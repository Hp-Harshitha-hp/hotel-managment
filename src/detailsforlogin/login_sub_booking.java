package detailsforlogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;

public class login_sub_booking extends Exception{

	private JFrame frmSubbooking;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_sub_booking window = new login_sub_booking();
					window.frmSubbooking.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login_sub_booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSubbooking = new JFrame();
		frmSubbooking.setTitle("sub_booking_page2");
		frmSubbooking.setBounds(100, 100, 1005, 552);
		frmSubbooking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSubbooking.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 991, 492);
		frmSubbooking.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPleaseLoginFor = new JLabel("PLEASE LOGIN FOR BOOKING ");
		lblPleaseLoginFor.setForeground(new Color(240, 255, 240));
		lblPleaseLoginFor.setBackground(new Color(255, 69, 0));
		lblPleaseLoginFor.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 28));
		lblPleaseLoginFor.setBounds(273, 148, 441, 69);
		panel.add(lblPleaseLoginFor);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 140, 0));
		panel_1.setBounds(232, 20, 584, 40);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblWelcomeToOloha = new JLabel("WELCOME TO OLOHA HOTEL BOOKING");
		lblWelcomeToOloha.setFont(new Font("Snap ITC", Font.ITALIC, 26));
		lblWelcomeToOloha.setBounds(0, 0, 630, 40);
		panel_1.add(lblWelcomeToOloha);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\all\\2nd sem1\\oops\\lab\\final project codes\\images\\hotel6.jpg"));
		lblNewLabel.setBounds(332, 221, 343, 188);
		panel.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 140, 0));
		menuBar.setForeground(new Color(0, 0, 205));
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
			}
		});
		frmSubbooking.setJMenuBar(menuBar);
		
		JButton btnHome = new JButton("HOME");
		btnHome.setForeground(new Color(0, 0, 0));
		btnHome.setBackground(new Color(255, 140, 0));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login_sub_booking.main(null);
			}
		});
		menuBar.add(btnHome);
		
		JMenu mnFrontOffice = new JMenu("Front Office");
		menuBar.add(mnFrontOffice);
		
		JButton btnRegistration = new JButton("Registration");
		btnRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Please login", "Login Failed", 2);
			}
		});
		btnRegistration.setBackground(new Color(255, 140, 0));
		mnFrontOffice.add(btnRegistration);
		
		JButton btnDepartureDetails = new JButton("Departure details");
		btnDepartureDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Please login", "Login Failed", 2);
			}
		});
		btnDepartureDetails.setBackground(new Color(255, 140, 0));
		mnFrontOffice.add(btnDepartureDetails);
		
		JButton btnRoomBill = new JButton("Room Bill");
		btnRoomBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Please login", "Login Failed", 2);
			}
		});
		btnRoomBill.setBackground(new Color(255, 140, 0));
		mnFrontOffice.add(btnRoomBill);
		
		JButton btnOccupancyReport = new JButton("Occupancy Report");
		btnOccupancyReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Please login", "Login Failed", 2);
			}
		});
		btnOccupancyReport.setBackground(new Color(255, 140, 0));
		mnFrontOffice.add(btnOccupancyReport);
		
		JButton btnCustomerOperation = new JButton("Customer Operation");
		btnCustomerOperation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Please login", "Login Failed", 2);
			}
		});
		btnCustomerOperation.setBackground(new Color(255, 140, 0));
		mnFrontOffice.add(btnCustomerOperation);
		
		JMenuBar menuBar_1 = new JMenuBar();
		mnFrontOffice.add(menuBar_1);
		
		JMenu mnHouseKeeping = new JMenu("House Keeping");
		menuBar.add(mnHouseKeeping);
		
		JButton btnLaundaryService = new JButton("Laundary Service");
		btnLaundaryService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {  
				JOptionPane.showMessageDialog(null, "Please login", "Login Failed", 2);
			}
		});
		btnLaundaryService.setBackground(new Color(255, 140, 0));
		mnHouseKeeping.add(btnLaundaryService);
		
		JMenu mnFoodAndBeverages = new JMenu("Food and Beverages");
		menuBar.add(mnFoodAndBeverages);
		
		JButton btnRoomService = new JButton("Room Service");
		btnRoomService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Please login", "Login Failed", 2);
			}
		});
		btnRoomService.setBackground(new Color(255, 140, 0));
		mnFoodAndBeverages.add(btnRoomService);
		
		JButton btnBilling = new JButton("Billing");
		btnBilling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Please login", "Login Failed", 2);
			}
		});
		btnBilling.setBackground(new Color(255, 140, 0));
		mnFoodAndBeverages.add(btnBilling);
		
		JMenuBar menuBar_2 = new JMenuBar();
		mnFoodAndBeverages.add(menuBar_2);
		
		JMenu mnEmployee = new JMenu("Employee");
		menuBar.add(mnEmployee);
		
		JButton btnAddEmployeeRecord = new JButton("Add Employee Record");
		btnAddEmployeeRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Please login", "Login Failed", 2);
			}
		});
		btnAddEmployeeRecord.setBackground(new Color(255, 140, 0));
		mnEmployee.add(btnAddEmployeeRecord);
		
		JButton btnEmployeeList = new JButton("Employee List");
		btnEmployeeList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Please login", "Login Failed", 2);
			}
		});
		btnEmployeeList.setBackground(new Color(255, 140, 0));
		mnEmployee.add(btnEmployeeList);
		
		JButton btnEmployeeAttendence = new JButton("Employee Attendence");
		btnEmployeeAttendence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Please login", "Login Failed", 2);
			}
		});
		btnEmployeeAttendence.setBackground(new Color(255, 140, 0));
		mnEmployee.add(btnEmployeeAttendence);
		
		JMenuBar menuBar_3 = new JMenuBar();
		mnEmployee.add(menuBar_3);
		
		JButton btnLogout = new JButton("Login");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				login_page.main(null);
				frmSubbooking.setVisible(false);
				}
				catch(NullPointerException e) 
		        { 
		            System.out.print("NullPointerException Caught"); 
		        } 
			
			}
		});
		btnLogout.setForeground(new Color(0, 0, 0));
		btnLogout.setBackground(new Color(255, 140, 0));
		menuBar.add(btnLogout);
		
		JButton btnFeedback = new JButton("FeedBack");
		btnFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Please login", "Login Failed", 2);
			}
		});
		btnFeedback.setForeground(new Color(0, 0, 0));
		btnFeedback.setBackground(new Color(255, 140, 0));
		menuBar.add(btnFeedback);
	}
}
