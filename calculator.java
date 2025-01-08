// Java program for simple calculator
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;


class calculator extends JFrame implements ActionListener {

    static JFrame f;    //create a frame

    static JTextField l;    //create a textfield

    String s0, s1, s2;      //store oprerator and operands

    calculator()    {
        s0 = s1 = s2 = "";
    }
     public static void main(String []args) {   //main function

        f = new JFrame("Calculator");   // creating a frame

         try {
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());   // look and feel
         } catch (Exception e)    {
             System.err.println(e.getMessage());
         }
         calculator c = new calculator();   //creating object of class

         l.setEnabled(false);   //set textfield to non-editable

         JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;     //create numbers and operators

         //create number buttons
         b0 = new JButton("0");
         b1 = new JButton("1");
         b2 = new JButton("2");
         b3 = new JButton("3");
         b4 = new JButton("4");
         b5 = new JButton("5");
         b6 = new JButton("6");
         b7 = new JButton("7");
         b8 = new JButton("8");
         b9 = new JButton("9");
         //create operation button
         ba = new JButton("+");
         bs = new JButton("-");
         bd = new JButton("/");
         bm = new JButton("*");
         beq = new JButton("C");
         // equals button
         beq1 = new JButton("=");
         // create . button
         be = new JButton(".");

         JPanel p = new JPanel();   //create a panel

         //add action listeners

         bm.addActionListener(c);
         bd.addActionListener(c);
         bs.addActionListener(c);
         ba.addActionListener(c);
         b9.addActionListener(c);
         b8.addActionListener(c);
         b7.addActionListener(c);
         b6.addActionListener(c);
         b5.addActionListener(c);
         b4.addActionListener(c);
         b3.addActionListener(c);
         b2.addActionListener(c);
         b1.addActionListener(c);
         b0.addActionListener(c);
         be.addActionListener(c);
         beq.addActionListener(c);
         beq1.addActionListener(c);


     }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println();
    }
}
