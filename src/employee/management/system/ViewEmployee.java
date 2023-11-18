package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class ViewEmployee extends JFrame implements ActionListener {

    // GUI components
    JTable table;
    Choice cemployeeId;
    JButton search, print, update, back;

    // Constructor for the ViewEmployee class
    ViewEmployee() {
        

        // Set up the JFrame
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Label for employee id search
        JLabel searchlbl = new JLabel("Search by Employee Id");
        searchlbl.setBounds(20, 20, 150, 20);
        add(searchlbl);

        // Choice dropdown for selecting employee id
        cemployeeId = new Choice();
        cemployeeId.setBounds(180, 20, 150, 20);
        add(cemployeeId);

        // Populate employee ids in the choice dropdown
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            while (rs.next()) {
                cemployeeId.add(rs.getString("empId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Initialize JTable to display employee data
        table = new JTable();

        // Populate JTable with initial data from the database
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set up JScrollPane for the JTable
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);

        // Buttons for various actions
        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.addActionListener(this);
        add(search);

        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);

        update = new JButton("Update");
        update.setBounds(220, 70, 80, 20);
        update.addActionListener(this);
        add(update);

        back = new JButton("Back");
        back.setBounds(320, 70, 80, 20);
        back.addActionListener(this);
        add(back);

        // Set JFrame properties
        setSize(900, 700);
        setLocation(300, 100);
        setVisible(true);
    }

    // ActionListener implementation for button actions
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            // Search button action - fetch and display employee data based on selected id
            String query = "select * from employee where empId = '" + cemployeeId.getSelectedItem() + "'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == print) {
            // Print button action - print the contents of the JTable
            try {
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == update) {
            // Update button action - open a new window to update employee details
            setVisible(false);
            new UpdateEmployee(cemployeeId.getSelectedItem());
        } else {
            // Back button action - return to the home screen
            setVisible(false);
            new Home();
        }
    }

    // Main method to instantiate the ViewEmployee class
    public static void main(String[] args) {
        new ViewEmployee();
    }
}
