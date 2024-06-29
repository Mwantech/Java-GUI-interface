import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    // Components of the Form
    private Container container;
    private JLabel num1Label, num2Label, num3Label, resultLabel;
    private JTextField num1Field, num2Field, num3Field;
    private JButton addButton, subtractButton, multiplyButton, divideButton, concatenateButton;

    // Constructor to set up the GUI components
    public Calculator() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        container = getContentPane();
        container.setLayout(new GridLayout(6, 2, 10, 10));

        num1Label = new JLabel("num1:");
        num2Label = new JLabel("num2:");
        num3Label = new JLabel("num3:");
        resultLabel = new JLabel("Result:");

        num1Field = new JTextField();
        num2Field = new JTextField();
        num3Field = new JTextField();

        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");
        concatenateButton = new JButton("Concatenate");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        concatenateButton.addActionListener(this);

        container.add(num1Label);
        container.add(num1Field);
        container.add(num2Label);
        container.add(num2Field);
        container.add(num3Label);
        container.add(num3Field);
        container.add(addButton);
        container.add(subtractButton);
        container.add(multiplyButton);
        container.add(divideButton);
        container.add(concatenateButton);
        container.add(resultLabel);
    }

    // Action listener for button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double num3 = Double.parseDouble(num3Field.getText());

            if (e.getSource() == addButton) {
                double result = num1 + num2 + num3;
                resultLabel.setText("Result: " + result);
            } else if (e.getSource() == subtractButton) {
                double result = num1 - num2 - num3;
                resultLabel.setText("Result: " + result);
            } else if (e.getSource() == multiplyButton) {
                double result = num1 * num2 * num3;
                resultLabel.setText("Result: " + result);
            } else if (e.getSource() == divideButton) {
                if (num2 == 0 || num3 == 0) {
                    resultLabel.setText("Result: Cannot divide by zero");
                } else {
                    double result = num1 / num2 / num3;
                    resultLabel.setText("Result: " + result);
                }
            } else if (e.getSource() == concatenateButton) {
                String result = String.valueOf(num1) + String.valueOf(num2) + String.valueOf(num3);
                resultLabel.setText("Result: " + result);
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: Invalid input");
        }
    }

    // Main method to launch the application
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}
