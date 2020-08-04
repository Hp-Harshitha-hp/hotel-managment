package detailsforlogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class room_bill{

	private JFrame frmSubbooking;
	private JTextField tf;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					room_bill window = new room_bill();
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
	public room_bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSubbooking = new JFrame();
		frmSubbooking.setTitle("room_bill");
		frmSubbooking.setBounds(100, 100, 1005, 552);
		frmSubbooking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSubbooking.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 991, 492);
		frmSubbooking.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(242, 65, 476, 22);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 140, 0));
		panel_1.setBounds(203, 129, 171, 50);
		panel.add(panel_1);
		
		JLabel lblCustomerId = new JLabel("CUSTOMER ID");
		panel_1.add(lblCustomerId);
		lblCustomerId.setForeground(new Color(245, 245, 245));
		lblCustomerId.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		tf = new JTextField();
		tf.setBounds(450, 128, 206, 37);
		panel.add(tf);
		tf.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 140, 0));
		panel_2.setBounds(203, 296, 161, 37);
		panel.add(panel_2);
		
		JLabel lblBiil = new JLabel("BILL:");
		panel_2.add(lblBiil);
		lblBiil.setForeground(new Color(245, 245, 245));
		lblBiil.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(450, 309, 206, 37);
		panel.add(tf1);
		
		JButton btnBill = new JButton("BILL");
		btnBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs=null;
				PreparedStatement ps;
				String query="SELECT room FROM booking WHERE number=?";
				
				try {
					ps = MyConnection.getConnection().prepareStatement(query);
					ps.setString(1,tf.getText());
					
					rs = ps.executeQuery();
				while(rs.next())
		            {
					String rooms=rs.getString("room");
					if(rooms.equals("1-Bedded"))
					{String number=tf2.getText();
						String bill="1000";
						int num=Integer.valueOf(number);
						int bil=Integer.valueOf(bill);
						int c= bil*num;
						
						tf1.setText(String.valueOf(c));
			
					}
					else if(rooms.equals("2-Bedded"))
					{
						String bill="2000";
						String number=tf2.getText();
						
						int num=Integer.valueOf(number);
						int bil=Integer.valueOf(bill);
						int c= bil*num;
						
						tf1.setText(bill);
					}
					else if(rooms.equals("Suit"))
					{
						String bill="5000";
						String number=tf2.getText();
				
						int num=Integer.valueOf(number);
						int bil=Integer.valueOf(bill);
						int c= bil*num;
						
						tf1.setText(bill);
					}
								            }	
				
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnBill.setBounds(412, 390, 152, 37);
		panel.add(btnBill);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 140, 0));
		panel_3.setBounds(412, 390, 152, 37);
		panel.add(panel_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\all\\2nd sem1\\oops\\lab\\final project codes\\images\\bill.png"));
		label.setBounds(725, 121, 237, 267);
		panel.add(label);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 140, 0));
		panel_4.setBounds(203, 213, 200, 37);
		panel.add(panel_4);
		
		JLabel lblNumberOfDays = new JLabel("NUMBER OF DAYS");
		lblNumberOfDays.setForeground(new Color(245, 245, 245));
		lblNumberOfDays.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(lblNumberOfDays);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(450, 213, 206, 37);
		panel.add(tf2);
		
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
				sub_booking.main(null);
			}
		});
		menuBar.add(btnHome);
		
		JMenu mnFrontOffice = new JMenu("Front Office");
		menuBar.add(mnFrontOffice);
		
		JButton btnRegistration = new JButton("Registration");
		btnRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				trial_for_registration.main(null);
			}
		});
		btnRegistration.setBackground(new Color(255, 140, 0));
		mnFrontOffice.add(btnRegistration);
		
		JButton btnDepartureDetails = new JButton("Departure details");
		btnDepartureDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				departure.main(null);
			}
		});
		btnDepartureDetails.setBackground(new Color(255, 140, 0));
		mnFrontOffice.add(btnDepartureDetails);
		
		JButton btnRoomBill = new JButton("Room Bill");
		btnRoomBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				room_bill.main(null);
			}
		});
		btnRoomBill.setBackground(new Color(255, 140, 0));
		mnFrontOffice.add(btnRoomBill);
		
		JButton btnOccupancyReport = new JButton("Occupancy Report");
		btnOccupancyReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			occupancy_report.main(null);
			}
		});
		btnOccupancyReport.setBackground(new Color(255, 140, 0));
		mnFrontOffice.add(btnOccupancyReport);
		
		JMenuBar menuBar_1 = new JMenuBar();
		mnFrontOffice.add(menuBar_1);
		
		JMenu mnHouseKeeping = new JMenu("House Keeping");
		menuBar.add(mnHouseKeeping);
		
		JButton btnLaundaryService = new JButton("Laundary Service");
		btnLaundaryService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {  
				laundry.main(null);
			}
		});
		btnLaundaryService.setBackground(new Color(255, 140, 0));
		mnHouseKeeping.add(btnLaundaryService);
		
		JMenu mnFoodAndBeverages = new JMenu("Food and Beverages");
		menuBar.add(mnFoodAndBeverages);
		
		JButton btnBilling = new JButton("Billing");
		btnBilling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				billing.main(null);
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
				employee_registration.main(null);
			}
		});
		btnAddEmployeeRecord.setBackground(new Color(255, 140, 0));
		mnEmployee.add(btnAddEmployeeRecord);
		
		JButton btnEmployeeList = new JButton("Employee List");
		btnEmployeeList.setBackground(new Color(255, 140, 0));
		mnEmployee.add(btnEmployeeList);
		
		JButton btnEmployeeDtails = new JButton("Employee Details");
		btnEmployeeDtails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				employee_details.main(null);
			}
		});
		btnEmployeeDtails.setBackground(new Color(255, 140, 0));
		mnEmployee.add(btnEmployeeDtails);
		
		JMenuBar menuBar_3 = new JMenuBar();
		mnEmployee.add(menuBar_3);
		
		JButton btnGallery = new JButton("Gallery");
		btnGallery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gallery.main(null);
			}
		});
		btnGallery.setBackground(new Color(255, 140, 0));
		menuBar.add(btnGallery);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Thank you for signing in",null,JOptionPane.DEFAULT_OPTION);
				login_sub_booking.main(null);
				frmSubbooking.setVisible(false);
			
			}
		});
		btnLogout.setForeground(new Color(0, 0, 0));
		btnLogout.setBackground(new Color(255, 140, 0));
		menuBar.add(btnLogout);
		
		JButton btnFeedback = new JButton("FeedBack");
		btnFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FeedBack.main(null);
			}
		});
		btnFeedback.setForeground(new Color(0, 0, 0));
		btnFeedback.setBackground(new Color(255, 140, 0));
		menuBar.add(btnFeedback);
		
		JButton btnVacate = new JButton("Vacate");
		btnVacate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vacating.main(null);
			}
		});
		btnVacate.setBackground(new Color(255, 140, 0));
		menuBar.add(btnVacate);
	}
}
