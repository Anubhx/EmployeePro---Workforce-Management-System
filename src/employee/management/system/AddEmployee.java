package employee.management.system;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

// Class to handle adding employee details
public class AddEmployee extends JFrame implements ActionListener{
    
    
    // Random number generator for generating employee ID
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
     // Textfields, labels, buttons, and other components
    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add, back;
    
    // Constructor for the AddEmployee class
    AddEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // ImageIcon for the employee image
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/addpng.png"));
        Image i5 = i4.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel imageLabel = new JLabel(i6);
        imageLabel.setBounds(375, 80, 150, 150);
        add(imageLabel);
       
        
            // Heading for the form
            
        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("Poppins", Font.BOLD, 25));
        add(heading);
        
        
         // Labels and textfields for employee details
         
     JLabel labelname = new JLabel("Name");
     labelname.setBounds(50, 250, 150, 30);
     labelname.setFont(new Font("serif", Font.PLAIN, 20));
     add(labelname);
 
      tfname = new JTextField();
      tfname.setBounds(200, 250, 150, 30);
      add(tfname);

     JLabel labelfname = new JLabel("Father's Name");
     labelfname.setBounds(400, 250, 150, 30);
     labelfname.setFont(new Font("serif", Font.PLAIN, 20));
     add(labelfname);

     tffname = new JTextField();
     tffname.setBounds(600, 250, 150, 30);
    add(tffname);
        
        // ... (Previous code)

    JLabel labeldob = new JLabel("Date of Birth");
    labeldob.setBounds(50, 300, 150, 30);
    labeldob.setFont(new Font("serif", Font.PLAIN, 20));
    add(labeldob);

    dcdob = new JDateChooser();
    dcdob.setBounds(200, 300, 150, 30);
    add(dcdob);

    JLabel labelsalary = new JLabel("Salary");
    labelsalary.setBounds(400, 300, 150, 30);
    labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
    add(labelsalary);

    tfsalary = new JTextField();
    tfsalary.setBounds(600, 300, 150, 30);
    add(tfsalary);

    JLabel labeladdress = new JLabel("Address");
    labeladdress.setBounds(50, 350, 150, 30);
    labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
    add(labeladdress);

    tfaddress = new JTextField();
    tfaddress.setBounds(200, 350, 150, 30);
    add(tfaddress);

    JLabel labelphone = new JLabel("Phone");
    labelphone.setBounds(400, 350, 150, 30);
   labelphone.setFont(new Font("serif", Font.PLAIN, 20));
   add(labelphone);

   tfphone = new JTextField();
   tfphone.setBounds(600, 350, 150, 30);
   add(tfphone);

   JLabel labelemail = new JLabel("Email");
    labelemail.setBounds(50, 400, 150, 30);
    labelemail.setFont(new Font("serif", Font.PLAIN, 20));
    add(labelemail);

    tfemail = new JTextField();
    tfemail.setBounds(200, 400, 150, 30);
    add(tfemail);
    
    // Dropdown for education
    JLabel labeleducation = new JLabel("Highest Education");
    labeleducation.setBounds(400, 400, 150, 30);
    labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
    add(labeleducation);
    
    String courses[] = {"BBA", "BCA", "BA", 
     "BSC", "B.COM", "BTech", 
     "MBA", "MCA", "MA", "MTech", "MSC", "PHD"};
    cbeducation = new JComboBox(courses);
    cbeducation.setBackground(Color.WHITE);
    cbeducation.setBounds(600, 400, 150, 30);
    add(cbeducation);


        
   JLabel labeldesignation = new JLabel("Designation");
   labeldesignation.setBounds(50, 450, 150, 30);
   labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
   add(labeldesignation);

   tfdesignation = new JTextField();
   tfdesignation.setBounds(200, 450, 150, 30);
   add(tfdesignation);
 
   JLabel labelaadhar = new JLabel("Aadhar Number");
   labelaadhar.setBounds(400, 450, 150, 30);
   labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
   add(labelaadhar);

   tfaadhar = new JTextField();
   tfaadhar.setBounds(600, 450, 150, 30);
   add(tfaadhar);

   JLabel labelempId = new JLabel("Employee id");
   labelempId.setBounds(50, 500, 150, 30);
   labelempId.setFont(new Font("serif", Font.PLAIN, 20));
   add(labelempId);

   lblempId = new JLabel("" + number);
   lblempId.setBounds(200, 500, 150, 30);
   lblempId.setFont(new Font("serif", Font.PLAIN, 20));
   add(lblempId);
// Buttons for adding details and going back
    add = new JButton("Add Details");
    add.setBounds(250, 550, 150, 40);
    add.addActionListener(this);
    add.setBackground(Color.BLACK);
    add.setForeground(Color.WHITE);
    add(add);

    back = new JButton("Back");
    back.setBounds(450, 550, 150, 40);
    back.addActionListener(this);
    back.setBackground(Color.BLACK);
    back.setForeground(Color.WHITE);
    add(back);
    
     JPanel backgroundLayer = new JPanel();
        backgroundLayer.setBackground(new Color(245, 245, 245, 100 )); // Adjust the alpha value (last parameter) for transparency
        backgroundLayer.setBounds(0, 0, 1120, 630);
        add(backgroundLayer);
 // Background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/add.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        
// JFrame properties
       setSize(900, 650);
       setLocation(400, 300 );
       setVisible(true);
    }

    // ActionListener implementation for button actions

public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == add) {
        String name = tfname.getText();
        String fname = tffname.getText();
        String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
        String salary = tfsalary.getText();
        String address = tfaddress.getText();
        String phone = tfphone.getText();
        String email = tfemail.getText();
        String education = (String) cbeducation.getSelectedItem();
        String designation = tfdesignation.getText();
        String aadhar = tfaadhar.getText();
        String empId = lblempId.getText();

        // Perform input validation
        if (name.isEmpty() || fname.isEmpty() || dob.isEmpty() || salary.isEmpty() || address.isEmpty()
                || phone.isEmpty() || email.isEmpty() || designation.isEmpty() || aadhar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all mandatory fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if validation fails
        }

        try {
            // Validate numeric fields
            double salaryValue = Double.parseDouble(salary);
            // Add additional validation for other numeric fields if needed

            Conn conn = new Conn();
            String query = "insert into employee values('" + name + "', '" + fname + "', '" + dob + "', '" + salary + "', '"
                    + address + "', '" + phone + "', '" + email + "', '" + education + "', '" + designation + "', '"
                    + aadhar + "', '" + empId + "')";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Details added successfully");
            setVisible(false);
            new Home();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid numeric value in salary.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } else {
        setVisible(false);
        new Home();
    }
}



    public static void main(String[] args) {
        new AddEmployee();
    }
}
