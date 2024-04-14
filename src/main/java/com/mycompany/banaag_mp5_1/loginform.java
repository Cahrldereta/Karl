
package com.mycompany.banaag_mp5_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loginform extends JFrame{
    public String firstName;
    public String passwd;
    public loginform(String firstName, String passwd){
        this.setTitle("Login");
        this.setSize(500, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        this.getContentPane().setBackground(new Color(211,211,211));
        this.firstName = firstName;
        this.passwd = passwd;
        this.setLayout(null);
        
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (screen.getWidth() - this.getWidth()) / 2;
        int y = (int) (screen.getHeight() - this.getHeight()) / 2;
        this.setBounds(x, y, this.getWidth(),this.getHeight());
        
        
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(40, 100, 400, 350);
        panel1.setLayout(null);
        //panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setBackground(new Color(	112, 128, 144));
        
        JLabel lbltitle = new JLabel("Login");
        lbltitle.setBounds(120, 10, 170, 50);
        //lbltitle.setBorder(BorderFactory.createLineBorder(Color.black));
        lbltitle.setFont(new Font("Heavitas", Font.PLAIN, 48));
        panel1.add(lbltitle);
        
        JLabel lblusrnm = new JLabel("Username", JLabel.CENTER);
        lblusrnm.setForeground(new Color(50, 50, 50));
        lblusrnm.setBounds(50, 100, 70, 20);
        //lblusrnm.setBorder(BorderFactory.createLineBorder(Color.black));
        lblusrnm.setFont(new Font("Times New Roman", Font.BOLD, 16));
        panel1.add(lblusrnm);
        
        JTextField txtfldusrnm = new JTextField("");
        txtfldusrnm.setBounds(50, 125, 300, 20);
        //txtfldusrnm.setBorder(BorderFactory.createLineBorder(Color.black));
        //txtfldusrnm.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        panel1.add(txtfldusrnm);
        
        JLabel lblpwd = new JLabel("Password");
        lblpwd.setForeground(new Color(50, 50, 50));
        lblpwd.setBounds(50, 150, 70, 20);
       // lblpwd.setBorder(BorderFactory.createLineBorder(Color.black));
        lblpwd.setFont(new Font("Times New Roman", Font.BOLD, 16));
        panel1.add(lblpwd);
        
        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(50, 175, 300, 20);
        //txtfldusrnm.setBorder(BorderFactory.createLineBorder(Color.black));
        //txtfldusrnm.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        panel1.add(pwd);
        
        JCheckBox showpass = new JCheckBox("Show");
        showpass.setBounds(50, 200, 70, 15);
        panel1.add(showpass);
        
        showpass.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
               if(showpass.isSelected()){
                   pwd.setEchoChar((char)0);
               }
               else{
                   pwd.setEchoChar('*');
               }
            }
        });
        
        JButton btn = new JButton("Login");
        //loginbtn.setBorder(new RoundedBorder(10));
        //loginbtn.setBackground(new Color(155, 170, 180));
        btn.setFont(new Font("Heavitas", Font.PLAIN, 16));
        btn.setBounds(150, 220, 100, 40);
        panel1.add(btn);
        
        
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String username = txtfldusrnm.getText();
                String password = pwd.getText();
                
                
                if(username.trim().equals(firstName.trim()) && password.trim().equals(passwd.trim())){
                    JOptionPane.showMessageDialog(null, "Welcome Admin");               
                } else {
                    JOptionPane.showMessageDialog(null, "Access Denied");
                }
            }
        });
        
        this.getContentPane().add(panel1);
        
        this.setVisible(true);
    }
}
