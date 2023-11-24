import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventListnerDemo extends JFrame {
    JButton b;
    JTextField tf;

    // ATTRIBUTES OF RELATIONS
    public EventListnerDemo() {
        b = new JButton("Click Here");
        tf = new JTextField();

        this.setTitle("Action Listener example");

        DemoHandler handler = new DemoHandler();

        b.addActionListener(handler);
        this.add(b, BorderLayout.NORTH);
        this.add(tf, BorderLayout.CENTER);

    }

    private class DemoHandler implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            tf.setText("Welcome to Java Swing!");
        }
    }

    public static void main(String[] args) {
        EventListnerDemo example = new EventListnerDemo();
        example.setVisible(true);
        example.setSize(300, 125);
        example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}