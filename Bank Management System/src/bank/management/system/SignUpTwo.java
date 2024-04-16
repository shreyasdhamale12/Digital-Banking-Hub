
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener{
    
    
    JLabel additionalDetails, religion_name, category_name, income_name, education_name, qualification_name, occupation_name, pan_name, aadhar_name, scitizen_name, existingacc_name;
    JTextField  pan_nameTextField, aadhar_nameTextField;
    JRadioButton existingacc_rbtnyes, existingacc_rbtnno, scitizen_rbtnno, scitizen_rbtnyes;
    JButton next;
    JComboBox religion_combox, income_combox, category_combox, education_combox, occupation_combox;
    String formno;
    
    
    
    SignUpTwo(String formno){
        this.formno = formno;
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        
         setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setBounds(240,80,400,40);
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));        
        add(additionalDetails);
        
        religion_name = new JLabel("Religion: ");
        religion_name.setBounds(100,140,100,30);
        religion_name.setFont(new Font("Raleway",Font.BOLD,20));        
        add(religion_name);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian","Other"};
        religion_combox = new JComboBox(valReligion);
        religion_combox.setBounds(300, 140, 400, 30);
        religion_combox.setBackground(Color.white);
        add(religion_combox);
        

        category_name = new JLabel("Category: ");
        category_name.setBounds(100,190,200,30);
        category_name.setFont(new Font("Raleway",Font.BOLD,20));        
        add(category_name);
        
        String valCategory[] = {"General", "SC", "ST", "OBC","Other"};
        category_combox = new JComboBox(valCategory);
        category_combox.setBounds(300, 190, 400, 30);
        category_combox.setBackground(Color.white);
        add(category_combox);
        
        income_name = new JLabel("Income");
        income_name.setBounds(100,240,200,30);
        income_name.setFont(new Font("Raleway",Font.BOLD,20));        
        add(income_name);
        
        String valIncome[] = {"0 - 1,50,000", "1,50,000 - 3,00,000", "3,50,000 - 5,00,000", "5,00,000 - 7,00,000",">7,00,000"};
        income_combox = new JComboBox(valIncome);
        income_combox.setBounds(300, 240, 400, 30);
        income_combox.setBackground(Color.white);
        add(income_combox);
        
        education_name = new JLabel("Educational ");
        education_name.setBounds(100,290,200,30);
        education_name.setFont(new Font("Raleway",Font.BOLD,20));        
        add(education_name);
        
        String valEducation[] = {"Graduate", "Non-Graduate", "Post-Graduate", "Doctrate", "Other"};
        education_combox = new JComboBox(valEducation);
        education_combox.setBounds(300, 290, 400, 30);
        education_combox.setBackground(Color.white);
        add(education_combox);
        
        qualification_name = new JLabel("Qualification: ");
        qualification_name.setBounds(100,330,200,30);
        qualification_name.setFont(new Font("Raleway",Font.BOLD,20));        
        add(qualification_name);
          
        occupation_name = new JLabel("Occupation: ");
        occupation_name.setBounds(100,390,200,30);
        occupation_name.setFont(new Font("Raleway",Font.BOLD,20));        
        add(occupation_name);
        
        String valoccupation[] = {"Unemployed", "Employed", "Business", "Student", "Retired", "Other"};
        occupation_combox = new JComboBox(valoccupation);
        occupation_combox.setBounds(300, 390, 400, 30);
        occupation_combox.setBackground(Color.white);
        add(occupation_combox);
        
        pan_name = new JLabel("PAN Number: ");
        pan_name.setBounds(100,440,200,30);
        pan_name.setFont(new Font("Raleway",Font.BOLD,20));        
        add(pan_name);
        
        pan_nameTextField = new JTextField();
        pan_nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pan_nameTextField.setBounds(300, 440, 400, 30);
        add(pan_nameTextField);
        
        aadhar_name = new JLabel("Aadhar Number: ");
        aadhar_name.setBounds(100,490,200,30);
        aadhar_name.setFont(new Font("Raleway",Font.BOLD,20));        
        add(aadhar_name);
        
        aadhar_nameTextField = new JTextField();
        aadhar_nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar_nameTextField.setBounds(300, 490, 400, 30);
        add(aadhar_nameTextField);
        
        scitizen_name = new JLabel("Senior Citizen: ");
        scitizen_name.setBounds(100,540,200,30);
        scitizen_name.setFont(new Font("Raleway",Font.BOLD,20));        
        add(scitizen_name);
        
        scitizen_rbtnyes = new JRadioButton("Yes");
        scitizen_rbtnyes.setBounds(300, 540, 100, 30);
        scitizen_rbtnyes.setBackground(Color.white);
        add(scitizen_rbtnyes);
        
        scitizen_rbtnno = new JRadioButton("No");
        scitizen_rbtnno.setBackground(Color.white);
        scitizen_rbtnno.setBounds(450, 540, 120, 30);
        add(scitizen_rbtnno);
        
        ButtonGroup seniorcitizenGroup = new ButtonGroup();
        seniorcitizenGroup.add(scitizen_rbtnyes);
        seniorcitizenGroup.add(scitizen_rbtnno);
        
        existingacc_name = new JLabel("Existing Account: ");
        existingacc_name.setBounds(100,590,200,30);
        existingacc_name.setFont(new Font("Raleway",Font.BOLD,20));        
        add(existingacc_name);
        
        existingacc_rbtnyes = new JRadioButton("Yes");
        existingacc_rbtnyes.setBounds(300, 590, 100, 30);
        existingacc_rbtnyes.setBackground(Color.white);
        add(existingacc_rbtnyes);
        
        existingacc_rbtnno = new JRadioButton("No");
        existingacc_rbtnno.setBackground(Color.white);
        existingacc_rbtnno.setBounds(450, 590, 120, 30);
        add(existingacc_rbtnno);
        
        ButtonGroup existingaccGroup = new ButtonGroup();
        existingaccGroup.add(existingacc_rbtnyes);
        existingaccGroup.add(existingacc_rbtnno);
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }        
        public void actionPerformed (ActionEvent ae){
            String sreligion = (String) religion_combox.getSelectedItem();
            String scategory = (String) category_combox.getSelectedItem();
            String sincome = (String) income_combox.getSelectedItem();
            String seducation = (String) education_combox.getSelectedItem();
            String soccupation = (String) occupation_combox.getSelectedItem();
            
            String sseniorcitizen = null;
            if(scitizen_rbtnyes.isSelected()){
                sseniorcitizen = "Yes";
            }else if (scitizen_rbtnno.isSelected()){
                sseniorcitizen = "No";
            }
            
            
            String sexistingacc = null;
            if(existingacc_rbtnyes.isSelected()){
                sexistingacc = "Yes";
            }else if (existingacc_rbtnno.isSelected()){
                sexistingacc = "No";
            }

            String span = pan_nameTextField.getText();
            String saadhar = aadhar_nameTextField.getText();
            
            
            try{
                    Conn c = new Conn();
                    String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+sseniorcitizen+"','"+sexistingacc+"','"+span+"','"+saadhar+"')";
                        c.s.executeUpdate(query);
                
                        //SignUpThree object
                        
                     setVisible(false);
                     new SignUpThree(formno).setVisible(true);
                        
            }catch(Exception e){
                System.out.println(e);
            }
            
    }
    
    
    public static void main(String args[]){
        
        new SignUpTwo("");
    }
    
    
}
