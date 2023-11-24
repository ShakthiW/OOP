import javax.swing.*;
import java.awt.*;

public class MouseDetailsFrame extends JFrame {
    private String details;
    private JLabel statusBur;

    private MouseDetailsFrame() {
        super("Mouse Click and Handling");

        statusBur = new JLabel("Click the mouse");
        add(statusBur, BorderLayout.SOUTH);
    }
}
