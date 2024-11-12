package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

    public class SignupOne  extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField; 
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;
    
    SignupOne()
    {
        setLayout(null);
        Random ran =new  Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formNo = new JLabel("APPLICATION FORM NO." + random);
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        formNo.setBounds(140, 10, 600, 40);
        add(formNo);
        
        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290, 70, 400, 30);
        add(personDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 130, 100, 30);
        add(name);
        
        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 130, 400, 30);
        add(nameTextField);
        
        JLabel Fname = new JLabel("Father's Name:");
        Fname.setFont(new Font("Raleway", Font.BOLD, 20));
        Fname.setBounds(100, 180, 200, 30);
        add(Fname);
        
        fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 180, 400, 30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 230, 200, 30);
        add(dob);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300, 230,400,30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);
        
        JLabel Gender= new JLabel("Gender:");
        Gender.setFont(new Font("Raleway", Font.BOLD, 20));
        Gender.setBounds(100, 280, 200, 30);
        add(Gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300, 280, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        female=new JRadioButton("Female");
        female.setBounds(450, 280, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 330, 200, 30);
        add(email);
        
        emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 330, 400, 30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 380, 200, 30);
        add(marital);
        
        married=new JRadioButton("Married");
        married.setBounds(300, 380, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450, 380, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other=new JRadioButton("Other");
        other.setBounds(630, 380, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 430, 200, 30);
        add(address);
        
        addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 430, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 480, 200, 30);
        add(city);
        
        cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 480, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 530, 200, 30);
        add(state);
        
        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 530, 400, 30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 580, 200, 30);
        add(pincode);
        
        pincodeTextField=new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeTextField.setBounds(300, 580, 400, 30);
        add(pincodeTextField);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620, 620, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
       setSize(900, 800);
       setLocation(350, 10);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
      String formNo =""+random;
      String name= nameTextField.getText();
      String fname=fnameTextField.getText();
      String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
      String gender = null;
      if(male.isSelected()){
          gender="Male";
      }else if(female.isSelected()){
          gender="Female";
      }
      
      String email=emailTextField.getText();
      String marital=null;
      if(married.isSelected())
      {
          marital="Married";
      }else if(unmarried.isSelected()){
          marital="Unmarried";
      }else if(other.isSelected()){
          marital="Other";
      }
      String address=addressTextField.getText();
      String city=cityTextField.getText();
      String state=stateTextField.getText();
      String pincode=pincodeTextField.getText();
      
      try{
      if(name.equals("")){
          JOptionPane.showMessageDialog(null, "Name is required");
      }else{
          Conn c=new Conn();
          String query="insert into signup values('"+formNo+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
          c.s.executeUpdate(query);
          
          setVisible(false);
          new SignupTwo(formNo).setVisible(true);
      }
     }catch(Exception e){
        System.out.println(e);
    }
    }
    public static void main(String[] args)
    {
        new SignupOne();
    
}
}
