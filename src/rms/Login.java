/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rms;

/**
 *
 * @author Monolium
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;

public class Login extends JFrame implements ActionListener{
    JFrame frame;
    JLabel name, pass;
    JTextField enter_text;
    JPasswordField password;
    JButton button, button_close;
    
       public Login(){
        
        name = new JLabel("UserName: ");
        name.setBounds(40,20,100,30);
        add(name);
        enter_text = new JTextField(20);
        enter_text.setBounds(150,20,100,30);
        add(enter_text);
        
        pass = new JLabel("Password: ");
        pass.setBounds(40,50,100,30);
        add(pass);
        password = new JPasswordField(10);
        password.setBounds(150,50,100,30);
        add(password);
        
        button = new JButton("LogIn");
        button.setBounds(70, 100,100,30);
        button.addActionListener(this);
        add(button);
        
        button_close = new JButton("Close");
        button_close.setBounds(200, 100,100,30);
        button_close.addActionListener(this);
        add(button_close);
        
        setLayout(null);
        setSize(400,300);
        setTitle("Login Page");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

 

    public static void main(String[] args){
        
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String u_name = enter_text.getText();
        String psw = password.getText();
        if(e.getSource()==button){
//            login1.dispose();
            if(u_name.equals("admin") && psw.equals("admin")){
                JOptionPane.showMessageDialog(null, "Login Succesful");
                dispose();
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Login Fail");
            }
        if(e.getSource().equals(button_close)){
            JOptionPane.showMessageDialog(null,"Do you want to exit?");
            dispose();
        }
//            login2 info = new login2(u_name);
        }
        Object log = e.getSource();
        
        
    }
}
