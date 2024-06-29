import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;

public class RadioButtonDemo extends JFrame {
    
    public RadioButtonDemo() {
        super("Swing JRadioButton Demo");
        JRadioButton jrb1 = new JRadioButton("C++");
        JRadioButton jrb2 = new JRadioButton("Java");
        JRadioButton jrb3 = new JRadioButton("VB.net");

        ButtonGroup group = new ButtonGroup();
        group.add(jrb1);
        group.add(jrb2);
        group.add(jrb3);

        setLayout(new FlowLayout());
        add(jrb1);
        add(jrb2);
        add(jrb3);
        
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RadioButtonDemo().setVisible(true);
            }
        });
    }
}
