import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Counter extends JFrame {
    JButton increment, decrement;
    JLabel counterLabel;
    int count;

    Counter () {
        increment = new JButton("Increment");
        decrement = new JButton("Decrement");

        counterLabel = new JLabel("Count " + count);

        this.setLayout(new FlowLayout());
        this.add(counterLabel);
        this.add(increment);
        this.add(decrement);

        increment.addActionListener(this::actionPerformed);
        decrement.addActionListener(this::actionPerformed);
    }



    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == increment) {
            count ++;
            counterLabel.setText("count: "+count);
        }
        if (e.getSource() == decrement) {
            count --;
            counterLabel.setText("count: "+count);
        }
        if (count > 0) {
            counterLabel.setBackground(Color.blue);
            counterLabel.setVisible(true);
        } if (count < 0) {
            counterLabel.setBackground(Color.ORANGE);
            counterLabel.setVisible(true);
        } if (count == 0) {
            counterLabel.setBackground(Color.DARK_GRAY);
            counterLabel.setVisible(true);
        }
    }


}
