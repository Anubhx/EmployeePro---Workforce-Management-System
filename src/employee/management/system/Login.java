
package employee.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class Login extends JFrame  implements ActionListener{
    
    
   JTextField tfusername, tfpassword; 
    
    Login(){
        
        
        JLabel descriptionLabel = new JLabel("EmployeePro - Streamlining Workforce Management");
        descriptionLabel.setBounds(40, 0 , 1000 , 30);
         descriptionLabel.setFont(new Font("Poppins", Font.BOLD,20));
         add(descriptionLabel);
         
         JLabel adminloginLabel = new JLabel("Admin Login");
         adminloginLabel.setBounds(200, 40 , 1000 , 30);
         adminloginLabel.setFont(new Font("Poppins", Font.BOLD,18));
         add(adminloginLabel);
        
       
        getContentPane().setBackground(new Color(245, 245, 245 )); 
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 90 , 100 , 30);
        lblusername.setFont(new Font("Poppins", Font.BOLD,18));
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(150, 90 , 150 , 30);
        add(tfusername);
        
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 150 , 100 , 30);
        lblpassword.setFont(new Font("Poppins", Font.BOLD,18));
        add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(150, 150 , 150 , 30);
        add(tfpassword);
        
         JButton Login = new JButton("LOGIN");
        Login.setBounds(150, 210, 150, 30);
        Login.setBackground(Color.black);
        Login.setForeground(Color.white);
        Login.setFont(new Font("Poppins", Font.BOLD,12));
        Login.addActionListener(this);
        add(Login);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/admin1.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 40 , 300, 300);
        add(image); 
        
      
        
         setSize(700, 400); 
         setLocation(400, 300 );
         setVisible(true);
    }
    
     
     public void actionPerformed(ActionEvent ae) {
         
       try{ 
           String username = tfusername.getText();
           String password = tfpassword.getText();
           Conn c = new Conn();
          String query = "SELECT * FROM login WHERE username = '" + username + "' AND password = '" + password + "'";

           
           
        ResultSet rs =  c.s.executeQuery(query);   
        if (rs.next()){
          setVisible(false);
               Home home = new Home();
          
        }else { 
                JOptionPane.showMessageDialog(null, "Invaild uesername or password");
                setVisible(false);
                }
            
       } catch (Exception e) {
           e.printStackTrace();
           
       }
    } 
     
     
     public static void main(String args[]){
        new Login(); 
     }
    
}
