//Wap to demostrate System clock.
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SystemClock extends JFrame {

    private JLabel clockLabel;
    private SimpleDateFormat timeFormat;
    private Timer timer;

    public SystemClock() {
        setTitle("System Clock");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        clockLabel = new JLabel();
        clockLabel.setFont(new Font("Arial", Font.BOLD, 24));

        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateClock();
            }
        });
        timer.start();

        add(clockLabel);
        updateClock();

        setVisible(true);
    }
    private void updateClock() {
        String currentTime = timeFormat.format(new Date());
        clockLabel.setText(currentTime);
    }

    public static void main(String[] args) {
        new SystemClock();
    }
}