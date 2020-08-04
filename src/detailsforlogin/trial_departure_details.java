package detailsforlogin;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.text.AbstractDocument.Content;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class trial_departure_details {
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trial_departure_details window = new trial_departure_details();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public trial_departure_details() throws Exception {
		initialize();
	}
PreparedStatement connection=null;
private JTextField tf;
private JTextField tf1;
private JTextField tf2;
private JTextField tf3;

	/**
	 * Initialize the contents of the frame.
	 * @throws Exception 
	 */
	private void initialize() throws Exception {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 787, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection connection=null;
				PreparedStatement ps=null;
				ResultSet rs=null;
				
			        String query = "SELECT f_n FROM `booking` WHERE `number`=?";
			        try {
						connection= MyConnection.getConnection();
				ps=connection.prepareStatement(query);
				ps.setString(1,tf.getText());
				
				rs = ps.executeQuery();
						 
						if(rs.next())
			            {
							tf1.setText(rs.getString("f_n"));
							
									            }
			            						
			            else{
			                    JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
			                }
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		});
		btnShow.setBounds(301, 280, 85, 21);
		frame.getContentPane().add(btnShow);
		
		JLabel lblEmployeeName = new JLabel("customer number");
		lblEmployeeName.setBounds(117, 62, 203, 21);
		frame.getContentPane().add(lblEmployeeName);
		
		tf = new JTextField();
		tf.setBounds(334, 62, 96, 19);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(130, 121, 45, 13);
		frame.getContentPane().add(lblName);
		
		JLabel lblCheckIn = new JLabel("check in");
		lblCheckIn.setBounds(130, 172, 45, 13);
		frame.getContentPane().add(lblCheckIn);
		
		JLabel lblCheckOut = new JLabel("check out");
		lblCheckOut.setBounds(130, 223, 45, 13);
		frame.getContentPane().add(lblCheckOut);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(315, 118, 96, 19);
		frame.getContentPane().add(tf1);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(315, 169, 96, 19);
		frame.getContentPane().add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(315, 220, 96, 19);
		frame.getContentPane().add(tf3);
		 
		}	
}
