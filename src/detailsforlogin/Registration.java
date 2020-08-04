package detailsforlogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import datechooser.beans.DateChooserPanel;
import datechooser.beans.DateChooserCombo;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Registration {

	private JFrame frame;
	private JTextField fn;
	private JTextField ln;
	private JTextField number;
	private JTextField checkin1;
	private JTextField checkout1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1152, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 1138, 42);
		frame.getContentPane().add(panel);
		
		JLabel lblRegistrationForm = new JLabel("Registration form:");
		panel.add(lblRegistrationForm);
		lblRegistrationForm.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(0, 44, 1138, 504);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFirstName.setForeground(new Color(245, 255, 250));
		lblFirstName.setBackground(new Color(0, 0, 205));
		lblFirstName.setBounds(202, 10, 156, 32);
		panel_1.add(lblFirstName);
		
		fn = new JTextField();
		fn.setBounds(423, 15, 195, 29);
		panel_1.add(fn);
		fn.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setForeground(new Color(245, 255, 250));
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLastName.setBackground(new Color(0, 0, 205));
		lblLastName.setBounds(202, 66, 156, 32);
		panel_1.add(lblLastName);
		
		ln = new JTextField();
		ln.setColumns(10);
		ln.setBounds(423, 71, 195, 29);
		panel_1.add(ln);
		
		JLabel lblCheckInTime = new JLabel("check in");
		lblCheckInTime.setForeground(new Color(245, 255, 250));
		lblCheckInTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCheckInTime.setBackground(new Color(0, 0, 205));
		lblCheckInTime.setBounds(157, 128, 95, 32);
		panel_1.add(lblCheckInTime);
		
		JLabel lblCheckOut = new JLabel("check out");
		lblCheckOut.setForeground(new Color(245, 255, 250));
		lblCheckOut.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCheckOut.setBackground(new Color(0, 0, 205));
		lblCheckOut.setBounds(460, 128, 86, 32);
		panel_1.add(lblCheckOut);
		
		JLabel lblRoomType = new JLabel("Room type");
		lblRoomType.setForeground(new Color(245, 255, 250));
		lblRoomType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRoomType.setBackground(new Color(0, 0, 205));
		lblRoomType.setBounds(202, 194, 156, 32);
		panel_1.add(lblRoomType);
		
		final JComboBox cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(new String[] {"1-Bedded", "2-Bedded", "3-Bedded", "Suit"}));
		cb.setBounds(423, 203, 136, 21);
		panel_1.add(cb);
		
		JLabel lblPhoneNo = new JLabel("Phone num");
		lblPhoneNo.setForeground(new Color(245, 255, 250));
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhoneNo.setBackground(new Color(0, 0, 205));
		lblPhoneNo.setBounds(202, 264, 156, 32);
		panel_1.add(lblPhoneNo);
		
		number = new JTextField();
		number.setColumns(10);
		number.setBounds(423, 269, 195, 29);
		panel_1.add(number);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String first_Name = fn.getText();
		        String last_Name = ln.getText();
		       
		        String checkin = checkin1.getText();
		        String checkout =checkout1.getText();
		  
		        String room_type = String.valueOf(cb.getSelectedItem());

		        String phone_no= number.getText();
		      {
		    	  ResultSet rs=null;
		        PreparedStatement ps;
		        String query = "INSERT INTO `booking`(`f_n`, `l_n`, `in`, `out`, `room`, `no`,`Bill`, `no_1-bed`) VALUES (?,?,?,?,?,?,?,?) ";
		        
		        try {
		            ps = MyConnection.getConnection().prepareStatement(query);
		            
		            ps.setString(1, first_Name);
		            ps.setString(2, last_Name);
		     
		            ps.setString(3, checkin);
		            ps.setString(4, checkout);
		            ps.setString(5, room_type);
		            ps.setString(6, phone_no);
		            ps.setString(7, null);
		            ps.setString(8, null);
		            if(ps.executeUpdate() > 0)
		            {
		                JOptionPane.showMessageDialog(null, "New User Add");
		                
		            }
		            
		        } catch (SQLException ex) {
		        	ex.printStackTrace();
		        }
		        }                   
				 
			sub_booking.main(null);
			frame.setVisible(false);
			}
		});
		btnSubmit.setBackground(new Color(255, 140, 0));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnSubmit.setBounds(810, 424, 136, 45);
		panel_1.add(btnSubmit);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Harshitha\\Desktop\\combo\\2ND year sem 1\\CSE(OOP)\\photos\\booking.png"));
		label.setBounds(753, 0, 358, 245);
		panel_1.add(label);
		
		checkin1 = new JTextField();
		checkin1.setBounds(314, 137, 96, 19);
		panel_1.add(checkin1);
		checkin1.setColumns(10);
		
		checkout1 = new JTextField();
		checkout1.setColumns(10);
		checkout1.setBounds(596, 137, 96, 19);
		panel_1.add(checkout1);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(new Color(245, 245, 245));
		lblAddress.setBackground(new Color(245, 255, 250));
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(202, 331, 128, 32);
		panel_1.add(lblAddress);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(423, 338, 342, 65);
		panel_1.add(textArea);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sub_booking.main(null);
			frame.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnBack.setBackground(new Color(255, 140, 0));
		btnBack.setBounds(194, 424, 136, 45);
		panel_1.add(btnBack);
	}
}

