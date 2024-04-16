package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener {

    JPasswordField pin, repin;
    JButton change, back;
    String pinnumber;

    PinChange(String pinnumber) {

        this.pinnumber = pinnumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JLabel text = new JLabel("Change your pin: ");
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(250, 280, 300, 25);
        image.add(text);

        JLabel pintext = new JLabel("New Pin: ");
        pintext.setForeground(Color.white);
        pintext.setFont(new Font("System", Font.BOLD, 16));
        pintext.setBounds(165, 320, 300, 25);
        image.add(pintext);

        pin = new JPasswordField();
        pin.setBounds(320, 320, 180, 25);
        pin.setFont(new Font("System", Font.BOLD, 16));
        image.add(pin);

        JLabel repintext = new JLabel("Re-enter your pin: ");
        repintext.setForeground(Color.white);
        repintext.setFont(new Font("System", Font.BOLD, 16));
        repintext.setBounds(165, 350, 300, 25);
        image.add(repintext);

        repin = new JPasswordField();
        repin.setBounds(320, 350, 180, 25);
        repin.setFont(new Font("System", Font.BOLD, 16));
        image.add(repin);

        change = new JButton("Change");
        change.setBounds(355, 460, 150, 25);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("Back");
        back.setBounds(355, 495, 150, 25);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setUndecorated(true);
        setLocation(300, 0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == change) {
            try {

                String npin = pin.getText();
                String rpin = repin.getText();

                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Entered pin does not match");
                    return;
                }

                if (npin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter pin");
                    return;
                }

                if (rpin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please re-enter new pin");
                    return;
                }

                Conn conn = new Conn();
                String query1 = "update bank set pin = '" + rpin + "' where pin = '" + pinnumber + "'";
                String query2 = "update login set pin = '" + rpin + "' where pin = '" + pinnumber + "'";
                String query3 = "update signupthree set pin = '" + rpin + "' where pin = '" + pinnumber + "'";

                System.out.println("Query 1: " + query1);
                System.out.println("Query 2: " + query2);
                System.out.println("Query 3: " + query3);

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);

//                conn.s.getConnection().commit();
                JOptionPane.showMessageDialog(null, "PIN Successfully changed");

                setVisible(false);
                new Transactions(rpin).setVisible(true);

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {

            setVisible(false);
            new Transactions(pinnumber).setVisible(true);

        }
    }

    public static void main(String[] args) {

        new PinChange("").setVisible(true);
    }

}
