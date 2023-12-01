import javax.swing.*;

public class CalculatorFrame {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        myCalculator.setVisible(true);
        myCalculator.setTitle("My Calculator");
        myCalculator.setSize(600, 300);
        myCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
