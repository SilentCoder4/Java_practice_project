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

         JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;

     }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println();
    }
}
