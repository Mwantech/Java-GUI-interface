import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyCombo extends JFrame {

    public MyCombo() {
        super("Programming Languages");

        getContentPane().setLayout(new BorderLayout());

        Vector<String> plang = new Vector<>(); // create vector data structure
        plang.addElement("Java Language");
        plang.addElement("C++");
        plang.addElement("Python");

        getContentPane().add(new JComboBox<>(plang), BorderLayout.CENTER);

        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        addWindowListener(wndCloser);

        pack();
        setVisible(true);
    }

    public static void main(String argv[]) {
        new MyCombo();
    }
}
