package detailsforlogin;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
public class details {
	private JFrame frame;
	private JTextField jTextField_FN;
	private JTextField jTextField_UN;
	private JPasswordField jpasswordField_PASS;
private JTextField jTextField_LN;
private JTextField jBDATE;
private JPasswordField jpasswordField_REPASS;
private JTextField jTextArea_ADDRESS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					details window = new details();
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
	public details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		jTextField_FN = new JTextField();
		jTextField_FN.setBounds(260, 75, 164, 19);
		frame.getContentPane().add(jTextField_FN);
		jTextField_FN.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setToolTipText("");
		lblUsername.setForeground(new Color(240, 248, 255));
		lblUsername.setBounds(41, 132, 114, 29);
		frame.getContentPane().add(lblUsername);
		
		jTextField_UN = new JTextField();
		jTextField_UN.setBounds(260, 137, 164, 19);
		frame.getContentPane().add(jTextField_UN);
		jTextField_UN.setColumns(10);
		
		jTextField_LN = new JTextField();
		jTextField_LN.setBounds(260, 108, 164, 19);
		frame.getContentPane().add(jTextField_LN);
		jTextField_LN.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setToolTipText("");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLastName.setForeground(new Color(240, 248, 255));
		lblLastName.setBounds(41, 109, 78, 13);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setToolTipText("");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFirstName.setForeground(new Color(240, 248, 255));
		lblFirstName.setBackground(new Color(240, 248, 255));
		lblFirstName.setBounds(41, 75, 95, 19);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblRetypePass = new JLabel("Retype Pass");
		lblRetypePass.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRetypePass.setToolTipText("");
		lblRetypePass.setForeground(new Color(240, 248, 255));
		lblRetypePass.setBounds(41, 214, 84, 13);
		frame.getContentPane().add(lblRetypePass);
		
		JLabel lblBirthdate = new JLabel("BirthDate");
		lblBirthdate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBirthdate.setToolTipText("");
		lblBirthdate.setForeground(new Color(240, 248, 255));
		lblBirthdate.setBounds(41, 249, 65, 23);
		frame.getContentPane().add(lblBirthdate);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(78, 407, 85, 21);
		frame.getContentPane().add(btnCancel);
		
		jpasswordField_REPASS = new JPasswordField();
		jpasswordField_REPASS.setBounds(260, 211, 164, 19);
		frame.getContentPane().add(jpasswordField_REPASS);
		
		jTextArea_ADDRESS = new JTextField();
		jTextArea_ADDRESS.setBounds(257, 287, 167, 76);
		frame.getContentPane().add(jTextArea_ADDRESS);
		jTextArea_ADDRESS.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 636, 52);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblRegister = new JLabel("REGISTER:");
		lblRegister.setBackground(new Color(255, 102, 0));
		lblRegister.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblRegister.setBounds(10, 10, 180, 32);
		panel.add(lblRegister);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(240, 248, 255));
		panel_1.setToolTipText("");
		panel_1.setBackground(new Color(75, 0, 130));
		panel_1.setBounds(0, 56, 636, 397);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setToolTipText("");
		lblPassword.setForeground(new Color(240, 248, 255));
		lblPassword.setBounds(42, 120, 110, 29);
		panel_1.add(lblPassword);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddress.setToolTipText("");
		lblAddress.setForeground(new Color(240, 248, 255));
		lblAddress.setBounds(42, 230, 128, 29);
		panel_1.add(lblAddress);
		
		jpasswordField_PASS = new JPasswordField();
		jpasswordField_PASS.setBounds(260, 118, 164, 19);
		panel_1.add(jpasswordField_PASS);
		
		jBDATE = new JTextField();
		jBDATE.setBounds(260, 195, 160, 19);
		panel_1.add(jBDATE);
		jBDATE.setColumns(10);
		
		JButton jButton_Register_ = new JButton("Sign in");
		jButton_Register_.setFont(new Font("Tahoma", Font.BOLD, 14));
		jButton_Register_.setBounds(477, 347, 109, 29);
		panel_1.add(jButton_Register_);
		jButton_Register_.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String fname=jTextField_FN.getText();
				String lname=jTextField_LN.getText();
				String uname=jTextField_UN.getText();
				String pass=String.valueOf(jpasswordField_PASS.getPassword());
				String re_pass=String.valueOf(jpasswordField_REPASS.getPassword());
		
			    String bdate=jBDATE.getText();
				String address=jTextArea_ADDRESS.getText();
				PreparedStatement ps;
		        String query = "INSERT INTO `the_app_users`(`u_fname`, `u_lname`, `u_uname`, `u_pass`, `u_bdate`, `u_address`) VALUES (?,?,?,?,?,?)";
		        
		        try {
		            ps = MyConnection.getConnection().prepareStatement(query);
		            
		            ps.setString(1, fname);
		            ps.setString(2, lname);
		            ps.setString(3, uname);
		            ps.setString(4, pass);
		            ps.setString(5, bdate);
		            ps.setString(6, address);
		         
		       	 if(uname.equals(""))
			        {
			            JOptionPane.showMessageDialog(null, "Add a Username");
			        }
			        
			        else if(pass.equals(""))
			        {
			            JOptionPane.showMessageDialog(null, "Add a Password");
			        }
			        else if(!pass.equals(re_pass))
			        {
			            JOptionPane.showMessageDialog(null, "Retype The Password Again");
			        }
			        else if(ps.executeUpdate() > 0)
		            {
		                JOptionPane.showMessageDialog(null, "New User Add");
		                menu1.main(null);
		            }
		            
		        } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			
		});
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{jTextField_FN, lblUsername, jTextField_UN, lblPassword, jpasswordField_PASS, lblAddress, jButton_Register_}));
	}
}
