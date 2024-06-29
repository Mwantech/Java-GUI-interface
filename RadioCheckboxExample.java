import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class RadioCheckboxExample {
    public static void main(String args[]) {
        JFrame frame = new JFrame("The Radio and Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Panel for Crystal Shopping
        JPanel panel = new JPanel(new GridLayout(0, 1));
        Border border = BorderFactory.createTitledBorder("Crystal Shopping");
        panel.setBorder(border);

        ButtonGroup group = new ButtonGroup();

        JRadioButton cystalRB = new JRadioButton("Salt");
        panel.add(cystalRB);
        group.add(cystalRB);

        cystalRB = new JRadioButton("Sugar", true);
        panel.add(cystalRB);
        group.add(cystalRB);

        cystalRB = new JRadioButton("Flour");
        panel.add(cystalRB);
        group.add(cystalRB);

        Container contentPane = frame.getContentPane();
        contentPane.add(panel, BorderLayout.WEST);

        // Panel for Vegetable Shopping
        panel = new JPanel(new GridLayout(0, 1));
        border = BorderFactory.createTitledBorder("Vegetable Shopping");
        panel.setBorder(border);

        JCheckBox chkVeges = new JCheckBox("SukumaWiki");
        panel.add(chkVeges);

        chkVeges = new JCheckBox("Cabbage", true);
        panel.add(chkVeges);

        chkVeges = new JCheckBox("Spinach");
        panel.add(chkVeges);

        chkVeges = new JCheckBox("Kienyeji");
        panel.add(chkVeges);

        contentPane.add(panel, BorderLayout.EAST);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
