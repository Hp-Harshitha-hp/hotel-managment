package detailsforlogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class employee_registration {

	private JFrame frame;
	private JTextField first;
	private JTextField last;
	private JTextField phone;
	private JPasswordField passw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employee_registration window = new employee_registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public employee_registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1100, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 1086, 55);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEmployeeRegistration = new JLabel("EMPLOYEE REGISTRATION");
		lblEmployeeRegistration.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 30));
		lblEmployeeRegistration.setBounds(40, 10, 601, 35);
		panel.add(lblEmployeeRegistration);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(0, 56, 1086, 438);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("First Name:");
		label.setForeground(new Color(245, 255, 250));
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBackground(new Color(0, 0, 205));
		label.setBounds(110, 27, 156, 32);
		panel_1.add(label);
		
		first = new JTextField();
		first.setBounds(313, 32, 156, 29);
		panel_1.add(first);
		first.setColumns(10);
		
		JLabel lblLastName = new JLabel("User ID");
		lblLastName.setForeground(new Color(245, 255, 250));
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLastName.setBackground(new Color(0, 0, 205));
		lblLastName.setBounds(110, 95, 156, 32);
		panel_1.add(lblLastName);
		
		JLabel lblPhoneNo = new JLabel("Phone no.");
		lblPhoneNo.setForeground(new Color(245, 255, 250));
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhoneNo.setBackground(new Color(0, 0, 205));
		lblPhoneNo.setBounds(110, 246, 156, 32);
		panel_1.add(lblPhoneNo);
		
		JLabel lblQualification = new JLabel("Qualification");
		lblQualification.setForeground(new Color(245, 255, 250));
		lblQualification.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQualification.setBackground(new Color(0, 0, 205));
		lblQualification.setBounds(622, 10, 156, 32);
		panel_1.add(lblQualification);
		
		JLabel lblBasicSalary = new JLabel("Basic Salary");
		lblBasicSalary.setForeground(new Color(245, 255, 250));
		lblBasicSalary.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBasicSalary.setBackground(new Color(0, 0, 205));
		lblBasicSalary.setBounds(622, 130, 156, 32);
		panel_1.add(lblBasicSalary);
		
		final JComboBox cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(new String[] {"10th Class", "Intermediate", "Btech", "Mtech", "Degree"}));
		cb.setBounds(852, 19, 172, 21);
		panel_1.add(cb);
		
		final JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"below 10,000", "10,000-15000", "15,000-20,000", "above 20,000"}));
		cb1.setBounds(852, 139, 172, 21);
		panel_1.add(cb1);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(new Color(245, 255, 250));
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBackground(new Color(0, 0, 205));
		lblAddress.setBounds(622, 246, 156, 32);
		panel_1.add(lblAddress);
		
		last = new JTextField();
		last.setColumns(10);
		last.setBounds(313, 100, 156, 29);
		panel_1.add(last);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(313, 251, 156, 29);
		panel_1.add(phone);
		
		final JTextArea address = new JTextArea();
		address.setBounds(852, 253, 183, 84);
		panel_1.add(address);
		
		JButton Register = new JButton("Register");
		Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String fname=first.getText();
				String id=last.getText();
				String phn=phone.getText();
				String pass=String.valueOf(passw.getPassword());
		
				String qualif = String.valueOf(cb.getSelectedItem());

		        String bas = String.valueOf(cb1.getSelectedItem());
				String addr=address.getText();
				PreparedStatement ps;
		        String query = "INSERT INTO `registration`(`fn`, `userId`, `password`, `pno`, `qua`, `basic`, `addr`) VALUES (?,?,?,?,?,?,?)";
		        
		        try {
		            ps = MyConnection_for_employee.getConnection().prepareStatement(query);  
		            ps.setString(1, fname);
		            ps.setString(2, id);
		            ps.setString(3, pass);
		            ps.setString(4, phn);
		            ps.setString(5, qualif);
		            ps.setString(6, bas);
		            ps.setString(7, addr);
		            if(ps.executeUpdate() > 0)
		            {
		                JOptionPane.showMessageDialog(null, "New Employee added");
		                sub_booking.main(null);
		                frame.setVisible(false);
		            }
		            
		     
		       	 
		            
		        } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
			}
			
		});
		Register.setBackground(new Color(255, 140, 0));
		Register.setFont(new Font("Tahoma", Font.BOLD, 18));
		Register.setBounds(463, 357, 123, 47);
		panel_1.add(Register);
		
		
		
		
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(245, 255, 250));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBackground(new Color(0, 0, 205));
		lblPassword.setBounds(110, 177, 156, 32);
		panel_1.add(lblPassword);
		
		passw = new JPasswordField();
		passw.setBounds(313, 187, 156, 32);
		panel_1.add(passw);
	}
}
