//Wap to create frame that display the student information.
import javax.swing.*;
import java.awt.*;
public class Student extends JFrame {

    public Student() {
        setTitle("Student Information");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 10, 10));

        JLabel nameLabel = new JLabel("Name: Ankit Halder", SwingConstants.CENTER);
        JLabel rollLabel = new JLabel("Roll No: BCA220036", SwingConstants.CENTER);
        JLabel courseLabel = new JLabel("Course: BCA", SwingConstants.CENTER);
        JLabel yearLabel = new JLabel("Year: 5th", SwingConstants.CENTER);

        Font font = new Font("Arial", Font.BOLD, 14);
        nameLabel.setFont(font);
        rollLabel.setFont(font);
        courseLabel.setFont(font);
        yearLabel.setFont(font);

        add(nameLabel);
        add(rollLabel);
        add(courseLabel);
        add(yearLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Student();
    }
}