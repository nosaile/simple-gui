import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0;
    JLabel label;


    public GUI(){


        JFrame frame = new JFrame();

        JButton button = new JButton("Click Me");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: ");

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     ++count;
     label.setText("Number of Clicks: " + count);
    }
}
