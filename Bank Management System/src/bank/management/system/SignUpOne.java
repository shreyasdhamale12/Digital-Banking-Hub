package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener {

    long random;
    JLabel formno, personalDetails, name, fname, dob, gender, email, martial, address, city, state, pincode;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField,
            pincodeTextField;
    JRadioButton male, female, other, married, unmarried;
    JButton next;
    JDateChooser dateChooser;

    SignUpOne() {

        getContentPane().setBackground(Color.white);

        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        formno = new JLabel("Application Form NO: " + random);
        formno.setBounds(140, 20, 600, 40);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        add(formno);

        personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setBounds(240, 80, 400, 40);
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        add(personalDetails);

        name = new JLabel("Name: ");
        name.setBounds(100, 140, 100, 30);
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        fname = new JLabel("Father's name: ");
        fname.setBounds(100, 190, 200, 30);
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        dob = new JLabel("Date of Birth: ");
        dob.setBounds(100, 240, 200, 30);
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(Color.white);
        add(dateChooser);

        gender = new JLabel("Gender: ");
        gender.setBounds(100, 290, 200, 30);
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBackground(Color.white);
        female.setBounds(450, 290, 120, 30);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        email = new JLabel("Email Address: ");
        email.setBounds(100, 340, 200, 30);
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        martial = new JLabel("Martial Status: ");
        martial.setBounds(100, 390, 200, 30);
        martial.setFont(new Font("Raleway", Font.BOLD, 20));
        add(martial);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.white);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBackground(Color.white);
        unmarried.setBounds(450, 390, 120, 30);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBackground(Color.white);
        other.setBounds(630, 390, 120, 30);
        add(other);

        ButtonGroup martialGroup = new ButtonGroup();
        martialGroup.add(married);
        martialGroup.add(unmarried);
        martialGroup.add(other);

        address = new JLabel("Address: ");
        address.setBounds(100, 440, 200, 30);
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        city = new JLabel("City: ");
        city.setBounds(100, 490, 200, 30);
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        state = new JLabel("State: ");
        state.setBounds(100, 540, 200, 30);
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);

        pincode = new JLabel("Pincode: ");
        pincode.setBounds(100, 590, 200, 30);
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }

        String email = emailTextField.getText();
        String martial = null;
        if (married.isSelected()) {
            martial = "Married";
        } else if (unmarried.isSelected()) {
            martial = "Unmarried";
        } else if (other.isSelected()) {
            martial = "other";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pincodeTextField.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            } else if (fname.equals("")) {
                JOptionPane.showMessageDialog(null, "Father's Name is required");
            } else if (dob.equals("")) {
                JOptionPane.showMessageDialog(null, "Date of Birth is required");
            } else if (gender.equals("")) {
                JOptionPane.showMessageDialog(null, "Gender is required");
            } else if (email.equals("")) {
                JOptionPane.showMessageDialog(null, "Email is required");
            } else if (martial.equals("")) {
                JOptionPane.showMessageDialog(null, "Martial is required");
            } else if (address.equals("")) {
                JOptionPane.showMessageDialog(null, "Address is required");
            } else if (city.equals("")) {
                JOptionPane.showMessageDialog(null, "City is required");
            } else if (state.equals("")) {
                JOptionPane.showMessageDialog(null, "State is required");
            } else if (pin.equals("")) {
                JOptionPane.showMessageDialog(null, "Pin is required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + martial + "','" + address + "','" + city + "','" + state + "','" + pin + "')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignUpTwo(formno).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String args[]) {

        new SignUpOne();
    }

}
