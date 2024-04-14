/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banaag_mp5_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class RegistrationForm extends JFrame{
    public RegistrationForm(){
        this.setTitle("Registration Form");
        this.setSize(450, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        this.setBackground(Color.gray);
        this.setLayout(null);
        
        //Codes for center of the screen
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (screen.getWidth() - this.getWidth()) / 2;
        int y = (int) (screen.getHeight() - this.getHeight()) / 2;
        this.setBounds(x, y, this.getWidth(),this.getHeight());
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(12, 10, 410, 425);
        panel1.setLayout(null);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setBackground(new Color(	255, 255, 255));
        
        JLabel title = new JLabel("Registration");
        title.setFont(new Font("Work Sans", Font.BOLD, 24));
        title.setBounds(140, 20, 160, 30);
        //title.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(title);
        //this.getContentPane().add(title);
        
        JLabel lblLastName = new JLabel("Lastname:");
        //lblLastName.setFont(new Font("Work Sans", Font.BOLD, 16));
        lblLastName.setBounds(20, 80, 100, 20);
        //lblLastName.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(lblLastName);
        //this.getContentPane().add(lblLastName);
        
        JTextField txtLastName = new JTextField();
        //txtLastName.setFont(new Font("Work Sans", Font.BOLD, 16));
        txtLastName.setBounds(20, 105, 150, 20);
        //txtLastName.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(txtLastName);
        //this.getContentPane().add(txtLastName);
        
        JLabel lblFirstName = new JLabel("Firstname:");
        //lblFirstName.setFont(new Font("Work Sans", Font.BOLD, 16));
        lblFirstName.setBounds(260, 80, 100, 20);
        //lblFirstName.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(lblFirstName);
        //this.getContentPane().add(lblFirstName);
        
        JTextField txtFirstName = new JTextField();
        //txtFirstName.setFont(new Font("Work Sans", Font.BOLD, 16));
        txtFirstName.setBounds(260, 105, 140, 20);
        //txtFirstName.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(txtFirstName);
        //this.getContentPane().add(txtFirstName);
        
        JLabel radGender = new JLabel("Gender:");
        //radGender.setFont(new Font("Work Sans", Font.BOLD, 16));
        radGender.setBounds(20, 135, 70, 20);
        //radGender.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(radGender);
        //this.getContentPane().add(radGender);
        
        JRadioButton radMale = new JRadioButton("Male");
        //radMale.setFont(new Font("Work Sans", Font.BOLD, 16));
        radMale.setBounds(120, 135, 65, 20);
        //radMale.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(radMale);
        //this.getContentPane().add(radMale);
        
        JRadioButton radFemale = new JRadioButton("Female");
        //radFemale.setFont(new Font("Work Sans", Font.BOLD, 16));
        radFemale.setBounds(120, 155, 100, 20);
        //radFemale.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(radFemale);
        //this.getContentPane().add(radFemale);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radMale);
        genderGroup.add(radFemale);
        
        JLabel lblpwd = new JLabel("Password:");
        //lblpwd.setFont(new Font("Work Sans", Font.BOLD, 16));
        lblpwd.setBounds(260, 135, 90, 20);
        //lblpwd.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(lblpwd);
        //this.getContentPane().add(lblpwd);
        
        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(260, 160, 140, 20);
        //pwd.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(pwd);
        //this.getContentPane().add(pwd);
        
        JLabel lblbday = new JLabel("Birthdate:");
        //lblbday.setFont(new Font("Work Sans", Font.BOLD, 16));
        lblbday.setBounds(20, 190, 90, 20);
        //lblbday.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(lblbday);
        //this.getContentPane().add(lblbday);
        
        JTextField txtDay = new JTextField();
        txtDay.setBounds(120, 190, 20, 20);
        panel1.add(txtDay);
        //this.getContentPane().add(txtDay);
        
        JLabel lblslash1 = new JLabel("/");
        //lblslash1.setFont(new Font("Work Sans", Font.BOLD, 16));
        //lblslash1.setBorder(BorderFactory.createLineBorder(Color.black));
        lblslash1.setBounds(155, 190, 15, 20);
        panel1.add(lblslash1);
        //this.getContentPane().add(lblslash1);
        
        JTextField txtMonth = new JTextField();
        txtMonth.setBounds(175, 190, 20, 20);
        panel1.add(txtMonth);
        //this.getContentPane().add(txtMonth);
        
        JLabel lblslash2 = new JLabel("/");
        //lblslash2.setFont(new Font("Work Sans", Font.BOLD, 16));
        //lblslash2.setBorder(BorderFactory.createLineBorder(Color.black));
        lblslash2.setBounds(200, 190, 15, 20);
        panel1.add(lblslash2);
        //this.getContentPane().add(lblslash2);
        
        JTextField txtYear = new JTextField();
        txtYear.setBounds(220, 190, 40, 20);
        panel1.add(txtYear);
        //this.getContentPane().add(txtYear);
        
        JLabel lblFormat = new JLabel("DD/MM/YYYY");
        //lblFormat.setBorder(BorderFactory.createLineBorder(Color.black));
        //lblFormat.setFont(new Font("Work Sans", Font.BOLD, 16));
        lblFormat.setBounds(265, 190, 120, 20);
        panel1.add(lblFormat);
        //this.getContentPane().add(lblFormat);
        
        JLabel lblNumber = new JLabel("Number:");
        //lblNumber.setBorder(BorderFactory.createLineBorder(Color.black));
        //lblNumber.setFont(new Font("Work Sans", Font.BOLD, 16));
        lblNumber.setBounds(20, 215, 80, 20);
        panel1.add(lblNumber);
        //this.getContentPane().add(lblNumber);
        
        String[] dial = {"+63", "+1"};
        JComboBox cmbDial = new JComboBox(dial);
        cmbDial.setBounds(120, 215, 50, 20);
        panel1.add(cmbDial);
        //this.getContentPane().add(cmbDial);
        
        JTextField txtNumber = new JTextField();
        //txtNumber.setBorder(BorderFactory.createLineBorder(Color.black));
        //txtNumber.setFont(new Font("Work Sans", Font.BOLD, 16));
        txtNumber.setBounds(180, 215, 110, 20);
        panel1.add(txtNumber);
        //this.getContentPane().add(txtNumber);
        
        JLabel lblEmail = new JLabel("Email:");
        //lblEmail.setBorder(BorderFactory.createLineBorder(Color.black));
        //lblEmail.setFont(new Font("Work Sans", Font.BOLD, 16));
        lblEmail.setBounds(20, 240, 65, 20);
        panel1.add(lblEmail);
        //this.getContentPane().add(lblEmail);
        
        JTextField txtEmail = new JTextField();
        //txtEmail.setBorder(BorderFactory.createLineBorder(Color.black));
        //txtEmail.setFont(new Font("Work Sans", Font.BOLD, 16));
        txtEmail.setBounds(120, 240, 280, 20);
        panel1.add(txtEmail);
        //this.getContentPane().add(txtEmail);
        
        JLabel lblAddress = new JLabel("Address:");
        //lblAddress.setBorder(BorderFactory.createLineBorder(Color.black));
        //lblAddress.setFont(new Font("Work Sans", Font.BOLD, 16));
        lblAddress.setBounds(20, 270, 80, 20);
        panel1.add(lblAddress);
        //this.getContentPane().add(lblAddress);
        
        JTextField txtAddress = new JTextField();
        //txtAddress.setBorder(BorderFactory.createLineBorder(Color.black));
        //txtAddress.setFont(new Font("Work Sans", Font.BOLD, 16));
        txtAddress.setBounds(120, 270, 280, 20);
        panel1.add(txtAddress);
        //this.getContentPane().add(txtAddress);
        
        JLabel lblCity = new JLabel("City:");
        //lblCity.setBorder(BorderFactory.createLineBorder(Color.black));
        //lblCity.setFont(new Font("Work Sans", Font.BOLD, 16));
        lblCity.setBounds(20, 300, 50, 25);
        panel1.add(lblCity);
        //this.getContentPane().add(lblCity);
        
        String[] city = {"NCR", "Antipolo", "Cavite", "Tanay", "Pampanga", "Bulacan", "Batangas", "Taytay"};
        JComboBox cmbCity = new JComboBox(city);
        cmbCity.setBounds(120, 300, 90, 25);
        panel1.add(cmbCity);
        //this.getContentPane().add(cmbCity);
        
        JLabel lblNationality = new JLabel("Nationality");
        //lblNationality.setBorder(BorderFactory.createLineBorder(Color.black));
        lblNationality.setBounds(20, 335, 70, 25);
        panel1.add(lblNationality);
        //this.getContentPane().add(lblNationality);
        
        String[] nationality = {"Filipino", "Foreign"};
        JComboBox cmbNationality = new JComboBox(nationality);
        cmbNationality.setBounds(120, 335, 90, 25);
        panel1.add(cmbNationality);
        //this.getContentPane().add(cmbNationality);
        
        JButton btnRegister = new JButton("Register");
        btnRegister.setBounds(150, 380, 120, 25);
        panel1.add(btnRegister);
        //this.getContentPane().add(btnRegister);
        
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lastName = txtLastName.getText();
                String firstName = txtFirstName.getText();
                //String gender = radMale.isSelected() ? "Male" : "Female";
                String passwd = new String(pwd.getPassword());
               /* String day = txtDay.getText();
                String month = txtMonth.getText();
                String year = txtYear.getText();
                String number = cmbDial.getSelectedItem().toString() + txtNumber.getText();
                String email = txtEmail.getText();
                String address = txtAddress.getText();
                String selectedCity = cmbCity.getSelectedItem().toString();
                String nationality = cmbNationality.getSelectedItem().toString();*/

                /*String message = "Last Name: " + lastName + "\n"
                        + "First Name: " + firstName + "\n"
                        + "Gender: " + gender + "\n"
                        + "Password: " + password + "\n"
                        + "Birthdate: " + day + "/" + month + "/" + year + "\n"
                        + "Number: " + number + "\n"
                        + "Email: " + email + "\n"
                        + "Address: " + address + "\n"
                        + "City: " + selectedCity + "\n"
                        + "Nationality: " + nationality;*/
                //JOptionPane.showMessageDialog(null, message, "Registration Details", JOptionPane.INFORMATION_MESSAGE);
                
                loginform loginForm = new loginform(firstName, passwd);
                loginForm.setVisible(true);
                dispose();
            }
        });
        
        this.getContentPane().add(panel1);
        
        
         
        this.setVisible(true);
    }
}
