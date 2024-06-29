import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {
    private Container container;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton exitButton;

    public LoginPage() {
        // Set the title of the window
        setTitle("Login Page");
        
        // Set the size of the window
        setSize(400, 200);
        
        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the layout manager
        container = getContentPane();
        container.setLayout(new GridLayout(3, 2, 10, 10));
        
        // Create and add components to the container
        userLabel = new JLabel("Username");
        userTextField = new JTextField();
        
        passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField();
        
        loginButton = new JButton("Login");
        exitButton = new JButton("Exit");
        
        loginButton.addActionListener(this);
        exitButton.addActionListener(this);

        container.add(userLabel);
        container.add(userTextField);
        container.add(passwordLabel);
        container.add(passwordField);
        container.add(loginButton);
        container.add(exitButton);

        // Make the window visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userTextField.getText();
            String password = new String(passwordField.getPassword());
            
            // For demonstration purposes, we use a hardcoded username and password
            if (username.equals("mwas") && password.equals("12345")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }
        } else if (e.getSource() == exitButton) {
            // Close the application
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the LoginPage class
        new LoginPage();
    }
}
