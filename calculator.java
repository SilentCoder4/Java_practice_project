// Java program for simple calculator
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


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

         l = new JTextField(16);

         l.setEditable(false);   //set textfield to non-editable

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

         //add elements t panel
         p.add(l);
         p.add(ba);
         p.add(b1);
         p.add(b2);
         p.add(b3);
         p.add(bs);
         p.add(b4);
         p.add(b5);
         p.add(b6);
         p.add(bm);
         p.add(b7);
         p.add(b8);
         p.add(b9);
         p.add(bd);
         p.add(be);
         p.add(b0);
         p.add(beq);
         p.add(beq1);

         p.setBackground(Color.black);      //set background of panel

         f.add(p);      //add panel to frame

         f.setSize(200, 250);   //set frame size

         f.show();

     }

    @Override
    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        if((s.charAt(0) >= '0' && s.charAt(0) >= '9') || s.charAt(0) == '.')    {   //if the value is a number

            if(!s1.equals(""))  //if operand is present then add to second number
                s2 = s2 + s;
            else
                s0 = s0 + s;

            l.setText(s0 + s1 + s2);

        }

        else if (s.charAt(0) == 'C') {

            s0 = s1 = s2 = "";      // clear the one letter

            l.setText(s0 + s1 + s2);        // set the value of text

        }
        else if (s.charAt(0) == '=') {

            double te;

            if (s1.equals("+"))     // store the value in 1st
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));

            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));

            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));

            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));

            l.setText(s0 + s1 + s2 + "=" + te);     // set the value of text

            s0 = Double.toString(te);        // convert it to string

            s1 = s2 = "";

        }

        else {

            if (s1.equals("") || s2.equals(""))     // if there was no operand
                s1 = s;

            else {      // else evaluate

                double te;

                if (s1.equals("+"))     // store the value in 1st
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));

                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));

                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));

                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                s0 = Double.toString(te);       // convert it to string

                s1 = s;     // place the operator

                s2 = "";    // make the operand blank

            }

            l.setText(s0 + s1 + s2);    // set the value of text

        }

    }
}