package detailsforlogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu1 window = new menu1();
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
	public menu1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 864, 496);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnService = new JButton("SERVICE");
		btnService.setBackground(new Color(255, 140, 0));
		btnService.setFont(new Font("Snap ITC", Font.BOLD, 39));
		btnService.setBounds(258, 294, 317, 78);
		frame.getContentPane().add(btnService);
		
		JButton btnBooking = new JButton("BOOKING");
		btnBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sub_booking.main(null);
			}
		});
		btnBooking.setBounds(258, 122, 317, 78);
		frame.getContentPane().add(btnBooking);
		btnBooking.setBackground(new Color(255, 153, 0));
		btnBooking.setFont(new Font("Snap ITC", Font.PLAIN, 39));
		
		JLabel lblWelcomeToOlaha = new JLabel("WELCOME TO OLAHA HOTEL");
		lblWelcomeToOlaha.setFont(new Font("Stencil", Font.BOLD, 57));
		lblWelcomeToOlaha.setForeground(new Color(240, 248, 255));
		lblWelcomeToOlaha.setBackground(new Color(240, 240, 240));
		lblWelcomeToOlaha.setBounds(40, 21, 800, 50);
		frame.getContentPane().add(lblWelcomeToOlaha);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Harshitha\\Desktop\\combo\\2ND year sem 1\\CSE(OOP)\\photos\\inside_.jpg"));
		lblNewLabel.setBounds(10, 81, 238, 368);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Harshitha\\Desktop\\combo\\2ND year sem 1\\CSE(OOP)\\photos\\outside_hotel.jpg"));
		lblNewLabel_1.setBounds(585, 65, 255, 176);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Harshitha\\Desktop\\combo\\2ND year sem 1\\CSE(OOP)\\photos\\hotel_outside2.jpg"));
		lblNewLabel_2.setBounds(585, 269, 255, 180);
		frame.getContentPane().add(lblNewLabel_2);
	}

	public static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		setVisible(false);
		
	}
}
