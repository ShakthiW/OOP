import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestField  extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    private JPasswordField passwordField;

    public TestField() {
        super("testing Jfields and passwords");
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        add(textField1);

        textField2 = new JTextField("Enter text here");
        add(textField2);

        textField3 = new JTextField("An Uneditable Text");
        textField3.setEditable(false);
        add(textField3);

        passwordField = new JPasswordField("Hidden Text");
        add(passwordField);

        TestFieldHandler handler = new TestFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    private class TestFieldHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String string = "";

            if (event.getSource() == textField1)
                string = String.format("textField1: %s", event.getActionCommand());

            if (event.getSource() == textField2)
                string = String.format("textField1: %s", event.getActionCommand());

            if (event.getSource() == textField3)
                string = String.format("textField1: %s", event.getActionCommand());

            if (event.getSource() == passwordField)
                string = String.format("textField1: %s", new String(passwordField.getPassword()));

            JOptionPane.showMessageDialog(null, string);

        }
    }

    public static void main(String[] args) {
        TestField textFieldFrame = new TestField();
        textFieldFrame.setVisible(true);
        textFieldFrame.setSize(300, 125);
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
