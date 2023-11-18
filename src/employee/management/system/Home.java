package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    JButton view, add, update, remove;
    
    Home() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(620, 20, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(heading);
        
        add = createStyledButton("Add Employee");
        add.setBounds(650, 80, 150, 40);
        add.addActionListener(this);
         addMouseListener(add);
        image.add(add);

        view = createStyledButton("View Employees");
        view.setBounds(820, 80, 150, 40);
        view.addActionListener(this);
        addMouseListener(view); // Add mouse listener
        image.add(view);

        update = createStyledButton("Update Employee");
        update.setBounds(650, 140, 150, 40);
        update.addActionListener(this);
        addMouseListener(update); // Add mouse listener
        image.add(update);

        remove = createStyledButton("Remove Employee");
        remove.setBounds(820, 140, 150, 40);
        remove.addActionListener(this);
        addMouseListener(remove); // Add mouse listener
        image.add(remove);
        
        
        setSize(1120, 630);
        setLocation(400, 300 );
        setVisible(true);
    }
     private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(51, 153, 255)); // Set background color
        button.setForeground(Color.white); // Set text color
        button.setBorderPainted(false); // Hide the default border
        button.setFocusPainted(false); // Remove focus border
        //button.setFont(new Font("Monospace", Font.PLAIN, 14)); // Set font
        button.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Set cursor
        button.setMargin(new Insets(10, 20, 10, 20)); // Adjust margin for better appearance

        // Apply drop shadow effect (you may need to adjust the values)
        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(0, 9, 17), 2),
                BorderFactory.createEmptyBorder(5, 15, 5, 15)));

        return button;
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
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
