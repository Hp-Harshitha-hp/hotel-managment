package detailsforlogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class change_password {

	private JFrame frame;
	private JTextField tf;
	private JPasswordField tf1;
	private JPasswordField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					change_password window = new change_password();
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
	public change_password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 597, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 579, 60);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChangePassword = new JLabel("Change Password:");
		lblChangePassword.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblChangePassword.setBounds(25, 13, 287, 47);
		panel.add(lblChangePassword);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(0, 60, 579, 267);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setForeground(new Color(245, 245, 245));
		lblId.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblId.setBounds(106, 13, 86, 28);
		panel_1.add(lblId);
		
		JLabel lblChangePassword_1 = new JLabel("Change Password");
		lblChangePassword_1.setForeground(new Color(245, 245, 245));
		lblChangePassword_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblChangePassword_1.setBounds(92, 82, 153, 28);
		panel_1.add(lblChangePassword_1);
		
		JLabel lblReenterPassword = new JLabel("Re-enter Password");
		lblReenterPassword.setForeground(new Color(245, 245, 245));
		lblReenterPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblReenterPassword.setBounds(92, 149, 176, 28);
		panel_1.add(lblReenterPassword);
		
		tf = new JTextField();
		tf.setBounds(393, 19, 116, 22);
		panel_1.add(tf);
		tf.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = tf.getText();
			    
		        String pass = tf1.getText();
String repass=tf2.getText();
if(pass.equals(repass))
{

				ResultSet rs=null;
		        PreparedStatement ps;
		        String query = "UPDATE registration SET password=? WHERE userId=? ";
		        try {
		        	
		            ps = MyConnection_for_employee.getConnection().prepareStatement(query);
		            System.out.println
		            ps.setString(1,pass);		     
		            ps.setString(2, id);
		       
		            if(ps.executeUpdate() > 0)
		            {
		                JOptionPane.showMessageDialog(null, "ADDED");
		                
		            }
		            else
		            {
		            	System.out.println("hello");
		            }
		            
		        } catch (SQLException ex) {
		        	ex.printStackTrace();
		        }         
			}
else
{
	JOptionPane.showMessageDialog(null, "Re-enter Password");
}
			}
		});
		btnOk.setBackground(new Color(0, 255, 255));
		btnOk.setBounds(250, 229, 97, 25);
		panel_1.add(btnOk);
		
		tf1 = new JPasswordField();
		tf1.setBounds(393, 99, 116, 22);
		panel_1.add(tf1);
		
		tf2 = new JPasswordField();
		tf2.setBounds(393, 168, 116, 22);
		panel_1.add(tf2);
	}
}
