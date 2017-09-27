import javax.swing.*;
import java.util.logging.Logger;

public class HolaTodos {
    public static void main(String[] args) {

        JFrame frame = new JFrame("HolaTodos");
        frame.setContentPane(new HolaTodos().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private JPanel panel1;
}
