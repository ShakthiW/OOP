import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    Calculator() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));
        p1.setBackground(Color.blue);

        for ( int i = 1; i <= 9; i++ ) {
            p1.add(new JButton(""+i));
            JButton button = (JButton) p1.getComponent(i - 1);
            button.setBackground(Color.RED);
            button.setForeground(Color.BLUE);
        }

        JButton zero = new JButton("0");
        zero.setBackground(Color.red);
        zero.setForeground(Color.blue);

        JButton point = new JButton("0");
        point.setBackground(Color.red);
        point.setForeground(Color.blue);

        p1.add(zero);
        p1.add(point);


        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 1));
        p2.setBackground(Color.blue);

        JButton add = new JButton("+");
        add.setBackground(Color.yellow);
        add.setForeground(Color.blue);

        JButton minus = new JButton("-");
        minus.setBackground(Color.yellow);
        minus.setForeground(Color.blue);

        JButton clear = new JButton("Clear");
        clear.setBackground(Color.yellow);
        clear.setForeground(Color.blue);

        p2.add(add);
        p2.add(minus);
        p2.add(clear);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 2));


        add(new JTextField("45.4"), BorderLayout.NORTH);
        p3.add(p1);
        p3.add(p2);


        add(p3);
    }
}
