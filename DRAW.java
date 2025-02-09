//WAP to draw the line, rectangle, oval, text using the graphics method.
import javax.swing.*;
import java.awt.*;
public class DRAW extends JFrame {

    public DRAW() {
        setTitle("Drawing Shapes with Graphics");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.RED);
        g.drawLine(50, 50, 200, 50);

        g.setColor(Color.BLUE);
        g.drawRect(50, 80, 150, 100);

        g.setColor(Color.GREEN);
        g.drawOval(250, 80, 100, 100);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Ankit Halder, Java Graphics!", 120, 250);
    }

    public static void main(String[] args) {
        DRAW frame = new DRAW();
        frame.setVisible(true);
    }
}