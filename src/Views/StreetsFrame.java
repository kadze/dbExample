package Views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Shevtsov on 06.10.14.
 */
public class StreetsFrame {
    private JTable table1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel mainPanel;

    public StreetsFrame() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hallo");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("StreetsFrame");
        frame.setContentPane(new StreetsFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);




    }
}