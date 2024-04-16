package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignUpThree  extends JFrame implements ActionListener{

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    SignUpThree(String formno){
        this.formno = formno;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3 : Account Details");
        l1.setBounds(280,40,400,40);
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        add(l1);
        
        JLabel type = new JLabel("Account Type:");
        type.setBounds(100,140,400,40);
        type.setFont(new Font("Raleway",Font.BOLD,22));
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD, 16));
        r1.setBounds(100,180,150,30);
        r1.setBackground(Color.white);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD, 16));
        r2.setBounds(280,180,200,30);
        r2.setBackground(Color.white);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD, 16));
        r3.setBounds(100,240,150,30);
        r3.setBackground(Color.white);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBounds(280,240,300,30);
        r4.setFont(new Font("Raleway",Font.BOLD, 16));  
        r4.setBackground(Color.white);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card = new JLabel("Card Number:");
        card.setBounds(100,320,200,40);
        card.setFont(new Font("Raleway",Font.BOLD,18));
        add(card);
        
        JLabel card_number = new JLabel("XXXX-XXXX-XXXX-4186");
        card_number.setBounds(300,320,300,40);
        card_number.setFont(new Font("Raleway",Font.BOLD,18));
        add(card_number);
        
        JLabel carddetail = new JLabel("Your 16-Digit Card Number");
        carddetail.setBounds(100,340,200,40);
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        add(carddetail);
        
        JLabel pin = new JLabel("Pin Number:");
        pin.setBounds(100,400,200,40);
        pin.setFont(new Font("Raleway",Font.BOLD,18));
        add(pin);

        JLabel pin_number = new JLabel("XXXX");
        pin_number.setBounds(300,400,300,40);
        pin_number.setFont(new Font("Raleway",Font.BOLD,18));
        add(pin_number);
        
        JLabel pindetail = new JLabel("Your 4-Digit Password");
        pindetail.setBounds(100,420,200,40);
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        add(pindetail);
        
        JLabel services = new JLabel("Services Required:");
        services.setBounds(100,470,200,40);
        services.setFont(new Font("Raleway",Font.BOLD,18));
        add(services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBounds(100, 520, 200, 30);
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway",Font.BOLD,18));
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBounds(300, 520, 200, 30);
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway",Font.BOLD,18));
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(100, 560, 200, 30);
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway",Font.BOLD,18));
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alert");
        c4.setBounds(300, 560, 200, 30);
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway",Font.BOLD,18));
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBounds(100, 600, 200, 30);
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway",Font.BOLD,18));
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBounds(300, 600, 200, 30);
        c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway",Font.BOLD,18));
        add(c6);
        
        c7 = new JCheckBox("I hereby declare above entered details are correct to best to my knowledge");
        c7.setBounds(60, 650, 1000, 30);
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway",Font.BOLD,18));
        add(c7);

        submit = new JButton("Submit");
        submit.setBounds(200, 700, 100, 30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(500, 700, 100, 30);
        cancel.setBackground(Color.black);
        cancel.addActionListener(this);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        add(cancel);
        
        
        getContentPane().setBackground(Color.white);
        setSize(850,820);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()== submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            }else if(r2.isSelected()){
                accountType = "Fixed Deposit Account";
            }else if(r3.isSelected()){
                accountType = "Current Account";
            }else if(r4.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5045879500000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if(c1.isSelected()){
                facility = facility + " ATM Card";
            }else if(c2.isSelected()){
                facility = facility + " Internet Banking";
            }else if(c3.isSelected()){
                facility = facility + " Mobile Banking";
            }else if(c4.isSelected()){
                facility = facility + " Email & SMS Alert";
            }else if(c5.isSelected()){
                facility = facility + " Cheque Book";
            }else if(c6.isSelected()){
                facility = facility + " E-Statement";
            }
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is required");
                }else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values ('" + formno + "','" + accountType + "','" + cardnumber + "','" + pinnumber + "','" + facility + "')";
                    String query2 = "insert into login values ('" + formno + "','" + cardnumber + "','" + pinnumber + "')";
                    
                     conn.s.executeUpdate(query1);
                     conn.s.executeUpdate(query2);
                     
                    JOptionPane.showMessageDialog(null, "Card Number"+ cardnumber + "\n Pin: " + pinnumber);
                    
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
                    
                }
                
                
            }catch (Exception e){
                System.out.println(e);
            }
            
            
        }else if(ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    
    public static void main(String args[]){
        
        new SignUpThree("");
    }
    
}
