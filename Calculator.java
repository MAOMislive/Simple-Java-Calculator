import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Objects;


class calculator extends JFrame implements ActionListener {
    // create a frame
    static JFrame f;

    // create a textfield
    static JTextField l;

    // store operator and operands
    String s0, s1, s2;

    // default constructor
    calculator()
    {
        s0 = s1 = s2 = "";
    }

    // main function
    public static void main(String args[]) throws IOException {
        // create a frame
        f = new JFrame("calculator");


        // create a object of class
        calculator c = new calculator();

        // create a textfield
        l = new JTextField(13);
        l.setFont(new Font("Poppins", Font.BOLD, 24));
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setPreferredSize(new Dimension(250,75));
        l.setBounds(24, 27, 250, 75);
        l.setBorder(new LineBorder(new Color(0xF68B1F), 4, false));

        // set the textfield to non editable
        l.setEditable(false);

        // create number buttons and some operators
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, bcl, beq1;


        // create number buttons
        b0 = new JButton("0",new ImageIcon("10.png"));
        b0.setPreferredSize(new Dimension(66,46));
        b0.setHorizontalTextPosition(b0.CENTER);
        b0.setFont(new Font("Poppins", Font.PLAIN, 0));

        b1 = new JButton("1",new ImageIcon("1.png"));
        b1.setPreferredSize(new Dimension(66,46));
        b1.setHorizontalTextPosition(b1.CENTER);
        b1.setFont(new Font("Poppins", Font.PLAIN, 0));

        b2 = new JButton("2",new ImageIcon("2.png"));
        b2.setPreferredSize(new Dimension(66,46));
        b2.setHorizontalTextPosition(b2.CENTER);
        b2.setFont(new Font("Poppins", Font.PLAIN, 0));

        b3 = new JButton("3",new ImageIcon("3.png"));
        b3.setPreferredSize(new Dimension(66,46));
        b3.setHorizontalTextPosition(b3.CENTER);
        b3.setFont(new Font("Poppins", Font.PLAIN, 0));

        b4 = new JButton("4",new ImageIcon("4.png"));
        b4.setPreferredSize(new Dimension(66,46));
        b4.setHorizontalTextPosition(b4.CENTER);
        b4.setFont(new Font("Poppins", Font.PLAIN, 0));

        b5 = new JButton("5",new ImageIcon("5.png"));
        b5.setPreferredSize(new Dimension(66,46));
        b5.setHorizontalTextPosition(b5.CENTER);
        b5.setFont(new Font("Poppins", Font.PLAIN, 0));

        b6 = new JButton("6",new ImageIcon("6.png"));
        b6.setPreferredSize(new Dimension(66,46));
        b6.setHorizontalTextPosition(b6.CENTER);
        b6.setFont(new Font("Poppins", Font.PLAIN, 0));

        b7 = new JButton("7",new ImageIcon("7.png"));
        b7.setPreferredSize(new Dimension(66,46));
        b7.setHorizontalTextPosition(b7.CENTER);
        b7.setFont(new Font("Poppins", Font.PLAIN, 0));

        b8 = new JButton("8",new ImageIcon("8.png"));
        b8.setPreferredSize(new Dimension(66,46));
        b8.setHorizontalTextPosition(b8.CENTER);
        b8.setFont(new Font("Poppins", Font.PLAIN, 0));

        b9 = new JButton("9",new ImageIcon("9.png"));
        b9.setPreferredSize(new Dimension(66,46));
        b9.setHorizontalTextPosition(b9.CENTER);
        b9.setFont(new Font("Poppins", Font.PLAIN, 0));

        // equals button
        beq1 = new JButton("=",new ImageIcon("equal.png"));
        beq1.setPreferredSize(new Dimension(144,46));
        beq1.setHorizontalTextPosition(beq1.CENTER);
        beq1.setFont(new Font("Poppins", Font.BOLD, 0));

        // clear button
        bcl = new JButton("C",new ImageIcon("clear.png"));
        bcl.setPreferredSize(new Dimension(144,46));
        bcl.setHorizontalTextPosition(bcl.CENTER);
        bcl.setFont(new Font("Poppins", Font.BOLD, 0));

        // create operator buttons
        ba = new JButton("+",new ImageIcon("add.png"));
        ba.setPreferredSize(new Dimension(66,46));
        ba.setHorizontalTextPosition(ba.CENTER);
        ba.setFont(new Font("Poppins", Font.BOLD, 0));
        ba.setBorder(new LineBorder(new Color(0xF68B1F), 3, false));

        bs = new JButton("-",new ImageIcon("sub.png"));
        bs.setPreferredSize(new Dimension(66,46));
        bs.setHorizontalTextPosition(bs.CENTER);
        bs.setFont(new Font("Poppins", Font.BOLD, 0));
        bs.setBorder(new LineBorder(new Color(0xF68B1F), 3, false));

        bd = new JButton("/",new ImageIcon("divide.png"));
        bd.setPreferredSize(new Dimension(66,46));
        bd.setHorizontalTextPosition(bd.CENTER);
        bd.setFont(new Font("Poppins", Font.BOLD, 0));
        bd.setBorder(new LineBorder(new Color(0xF68B1F), 3, false));

        bm = new JButton("*",new ImageIcon("multi.png"));
        bm.setPreferredSize(new Dimension(66,46));
        bm.setHorizontalTextPosition(bm.CENTER);
        bm.setFont(new Font("Poppins", Font.BOLD, 0));
        bm.setBorder(new LineBorder(new Color(0xF68B1F), 3, false));


        // create a panel
        JPanel p = new JPanel(); p.setAlignmentX(Component.CENTER_ALIGNMENT);
        JPanel p0 = new JPanel();
        JPanel p1 = new JPanel(); p1.setLayout(new GridLayout(3,4,3,3)); p1.setAlignmentX(Component.CENTER_ALIGNMENT);
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        JPanel p00 = new JPanel(); JPanel p01 = new JPanel(); JPanel p02 = new JPanel(); JPanel p03 = new JPanel();

        // add action listeners
        bm.addActionListener(c);bm.setRolloverEnabled(true);
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
        bcl.addActionListener(c);
        beq1.addActionListener(c);

        BufferedImage myPicture = ImageIO.read(new File("header.png"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        JLabel picLabel1 = new JLabel(new ImageIcon(myPicture));
        JLabel picLabel2 = new JLabel(new ImageIcon(myPicture));
        JLabel picLabel3 = new JLabel(new ImageIcon(myPicture));

        p00.add(picLabel);
        p01.add(picLabel1);
        p02.add(picLabel2);
        p03.add(picLabel3);
        p00.setPreferredSize(new Dimension(175,15));
        p01.setPreferredSize(new Dimension(175,5));
        p02.setPreferredSize(new Dimension(175,5));
        p03.setPreferredSize(new Dimension(175,5));


        // add elements to panel
        p0.add(l);

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b0);

        p2.add(ba);
        p2.add(bs);
        p2.add(bm);
        p2.add(bd);

        p3.add(bcl);
        p3.add(beq1);

        // set Background of panel
        p.setBackground(new Color(0x3C3C3C));
        p00.setBackground(new Color(0x3C3C3C));
        p01.setBackground(new Color(0x3C3C3C));
        p02.setBackground(new Color(0x3C3C3C));
        p03.setBackground(new Color(0x3C3C3C));
        p0.setBackground(new Color(0x3C3C3C));
        p1.setBackground(new Color(0x3C3C3C));
        p2.setBackground(new Color(0x3C3C3C));
        p3.setBackground(new Color(0x3C3C3C));
        p1.setBackground(new Color(0x3C3C3C));

        // add panel to frame
        f.add(p);
        p.add(p00);
        p.add(p0);
        p.add(p01);
        p.add(p1);
        p.add(p02);
        p.add(p2);
        p.add(p03);
        p.add(p3);

        f.setSize(360, 475);
        f.show();
        //f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

        // if the value is a number
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9')) {
            // if operand is present then add to second no
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;

            // set the value of text
            l.setText(s0 + " " + s1 + " " + s2);
        }
        else if (s.charAt(0) == 'C') {
            // clear the one letter
            s0 = s1 = s2 = "";

            // set the value of text
            l.setText(s0 + " " + s1 + " " + s2);
        }
        else if (s.charAt(0) == '=') {

            double te = 0;
            int tee = 0;
            final DecimalFormat df = new DecimalFormat("0.00");

            // store the value in 1st
            if (s1.equals("+"))
                tee = (Integer.parseInt(s0) + Integer.parseInt(s2));
            else if (s1.equals("-"))
                tee = (Integer.parseInt(s0) - Integer.parseInt(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));

            // set the value of text
            if(s1.equals("+") || s1.equals("-"))
                l.setText(s0 + " " + s1 + " " + s2 + " " + "=" + " " + tee);
            else
                l.setText(s0 + " " + s1 + " " + s2 + " " + "=" + " " + df.format(te));

            // convert it to string
            s0 = Double.toString(te);

            s1 = s2 = "";
        }
        else {
            // if there was no operand
            if (s1.equals("") || s2.equals(""))
                s1 = s;
                // else evaluate
            else {
                double te;

                // store the value in 1st
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                // convert it to string
                s0 = Double.toString(te);

                // place the operator
                s1 = s;

                // make the operand blank
                s2 = "";
            }

            // set the value of text
            l.setText(s0 + " " + s1 + " " + s2);
        }
    }
}