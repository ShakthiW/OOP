import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Counter count = new Counter();
        count.setVisible(true);
        count.setSize(600, 300);
        count.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}