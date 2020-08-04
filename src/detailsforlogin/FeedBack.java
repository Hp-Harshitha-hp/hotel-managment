package detailsforlogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FeedBack {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeedBack window = new FeedBack();
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
	public FeedBack() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 884, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterYourFeedback = new JLabel("Enter your Feedback:");
		lblEnterYourFeedback.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnterYourFeedback.setBounds(39, 10, 315, 55);
		frame.getContentPane().add(lblEnterYourFeedback);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 10, 860, 68);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(0, 75, 870, 416);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		final JTextArea tf = new JTextArea();
		tf.setWrapStyleWord(true);
		tf.setRows(5);
		tf.setLineWrap(true);
		tf.setTabSize(4);
		tf.setDropMode(DropMode.INSERT);
		tf.setBounds(393, 102, 301, 109);
		panel_1.add(tf);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String feed_backk = tf.getText();
				{
			    	  ResultSet rs=null;
			        PreparedStatement ps;
			        String query = "INSERT INTO `feedback`(`fb`) VALUES (?) ";
			        
			        try {
			            ps = MyConnection.getConnection().prepareStatement(query);
			            ps.setString(1, feed_backk);
			            if(ps.executeUpdate() > 0)
			            {
			            	JOptionPane.showMessageDialog(null, "Thank you for your Feedback",null,JOptionPane.DEFAULT_OPTION);
			            	frame.setVisible(false);
			            }
			            
			        } catch (SQLException ex) {
			        	ex.printStackTrace();
			        }
				
				sub_booking.main(null);
				
			}
			}});
		btnSubmit.setBackground(new Color(255, 140, 0));
		btnSubmit.setBounds(497, 288, 123, 29);
		panel_1.add(btnSubmit);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\all\\2nd sem1\\oops\\lab\\final project codes\\images\\feedback.png"));
		label.setBounds(12, 54, 301, 268);
		panel_1.add(label);
		
		JButton button = new JButton("<- Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_sub_booking.main(null);
			}
		});
		button.setBackground(new Color(255, 140, 0));
		button.setBounds(51, 348, 123, 29);
		panel_1.add(button);
	}
}
