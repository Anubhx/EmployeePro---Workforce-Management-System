
package employee.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Splash extends JFrame implements ActionListener   {
    JButton clickhere;
    JLabel heading;
    
     //private JPanel contentPane;
    Splash(){
        
        
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        heading = new JLabel ("EmployeePro - Streamlining Workforce Management");
        heading.setBounds(85, 30 , 1200 , 60);
        heading.setFont(new Font("Poppins", Font.BOLD,40));
        heading.setForeground(Color.red);
        add(heading);
        
         
        
        JLabel descriptionLabel = new JLabel("<html>"
        + "<div style='text-align: left;'>"
        + "EmployeePro is a robust and user-friendly Employee Management System designed to streamline and enhance "
        + "organizational workforce management. With features tailored for efficient employee information handling, "
        + "it simplifies tasks such as adding new employees, updating details, viewing workforce data, and removing records. "
        + "EmployeePro empowers businesses to manage their human resources effectively, fostering a seamless and organized "
        + "approach to employee administration."
        + "</div></html>");

       descriptionLabel.setForeground(Color.WHITE);
       descriptionLabel.setBounds(60, 150, 600, 200); // Adjust the height as needed
       descriptionLabel.setFont(new Font("Lato", Font.BOLD, 18));
       add(descriptionLabel);

        JPanel backgroundLayer = new JPanel();
        backgroundLayer.setBackground(new Color(240, 023, 023, 130 )); // Adjust the alpha value (last parameter) for transparency
        backgroundLayer.setBounds(55, 145, 610, 210);
        add(backgroundLayer);


        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/service1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1050, 470, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100 , 1050, 470);
        add(image); 
        
        clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setFont(new Font("Poppins", Font.BOLD,20));
        clickhere.setBounds(400, 375, 300, 70);
        clickhere.setBackground(Color.black);
        clickhere.setForeground(Color.white);
        image.add(clickhere);
        clickhere.addActionListener(this);
        add(clickhere);
        
        
       
        setSize(1150, 650);
        setLocation(400, 300 );
        setVisible(true);
        
        
     // while (true) {
//     heading.setVisible(false);
//     try {
//         Thread.sleep(500);
//     } catch (Exception e) {
//         
//     }
//     
//     heading.setVisible(true);
//     try {
//         Thread.sleep(500);
//     } catch (Exception e) {
//     
//     }
// }

    }
      private void addMouseListener(final JButton button) {
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(31, 122, 255)); // Change color on hover
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(51, 153, 255)); // Restore original color
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(0, 102, 204)); // Change color on click
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(51, 153, 255)); // Restore original color after click
            }
        });
    }
    
     public void actionPerformed(ActionEvent ae) {
         setVisible(false);
         new Login();
       
    }
    public static void main(String args[]){
        new Splash();
    }
   
}
