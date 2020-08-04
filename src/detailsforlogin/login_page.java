package detailsforlogin;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class login_page{

	private JFrame frame;
	private JTextField jTextField1;
	private JPasswordField jPasswordField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_page window = new login_page();
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
	public login_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(100, 100, 826, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 802, 40);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE OLOHA HOTEL BOOKING");
		lblWelcomeToThe.setBackground(new Color(255, 140, 0));
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblWelcomeToThe.setBounds(158, 0, 479, 40);
		panel.add(lblWelcomeToThe);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 139));
		panel_1.setBounds(10, 36, 792, 328);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		jTextField1 = new JTextField();
		jTextField1.setBounds(430, 82, 134, 19);
		panel_1.add(jTextField1);
		jTextField1.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(233, 67, 134, 42);
		panel_1.add(lblUsername);
		lblUsername.setForeground(new Color(240, 248, 255));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		
		jPasswordField1 = new JPasswordField();
		jPasswordField1.setBounds(430, 137, 134, 19);
		panel_1.add(jPasswordField1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(233, 137, 134, 30);
		panel_1.add(lblPassword);
		lblPassword.setForeground(new Color(240, 248, 255));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		
		JButton jButton_CANCEL = new JButton("Cancel");
		jButton_CANCEL.setBounds(606, 221, 117, 42);
		panel_1.add(jButton_CANCEL);
		jButton_CANCEL.setBackground(new Color(255, 51, 51));
		jButton_CANCEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		jButton_CANCEL.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton jButton_LOGIN = new JButton("Sign In");
		jButton_LOGIN.setBounds(329, 221, 125, 42);
		panel_1.add(jButton_LOGIN);
		jButton_LOGIN.setBackground(new Color(51, 255, 255));
		jButton_LOGIN.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnNewUser = new JButton("New User");
		btnNewUser.setBounds(35, 221, 176, 36);
		panel_1.add(btnNewUser);
		btnNewUser.setBackground(new Color(240, 248, 255));
		btnNewUser.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(47, 60, 176, 117);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\all\\2nd sem1\\oops\\lab\\final project codes\\images\\booking.jpg"));
		
		JLabel lblForgotPassword = new JLabel("Forgot Password?");
		lblForgotPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				change_password.main(null);
			}
		});
		lblForgotPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				laundry.main(null);
			}
		});
		lblForgotPassword.setForeground(new Color(245, 245, 245));
		lblForgotPassword.setBounds(606, 139, 117, 16);
		panel_1.add(lblForgotPassword);
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username=jTextField1.getText();		
				String password=jPasswordField1.getText();
				
					jPasswordField1.setText(null);
					jTextField1.setText(null);
//details info = new details();
employee_registration.main(null);
					
			}
		});
		jButton_LOGIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PreparedStatement ps;
				ResultSet rs;
				 String uname = jTextField1.getText();
			        String pass = String.valueOf(jPasswordField1.getPassword());
			        String query = "SELECT * FROM `registration` WHERE `userId`=? AND `password`=?";
			        try {
						ps = MyConnection_for_employee.getConnection().prepareStatement(query);
						ps.setString(1, uname);
			            ps.setString(2, pass);
			            
						rs = ps.executeQuery();
						 
						if(rs.next())
			            {
							sub_booking.main(null);
			            }
			            else{
			                    JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
			                }
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}

			private void dispose() {
		
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			} 

		
		});
	}
}
