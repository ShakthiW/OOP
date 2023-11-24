import javax.swing.*;
public class Week07 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");

        JButton jbOk = new JButton("Ok");
        frame.add(jbOk);

        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
