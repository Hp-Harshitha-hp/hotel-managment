package detailsforlogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
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
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class departure{

	private JFrame frmSubbooking;
	private JTextField tf;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					departure window = new departure();
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
	public departure() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSubbooking = new JFrame();
		frmSubbooking.setTitle("departure");
		frmSubbooking.setBounds(100, 100, 1005, 552);
		frmSubbooking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSubbooking.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 991, 492);
		frmSubbooking.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCustomerId = new JLabel("Customer Id");
		lblCustomerId.setBounds(488, 44, 156, 50);
		lblCustomerId.setForeground(new Color(245, 245, 245));
		lblCustomerId.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblCustomerId);
		
		tf = new JTextField();
		tf.setBounds(747, 61, 165, 25);
		panel.add(tf);
		tf.setColumns(10);
		
		JLabel lblTypeOfRoom = new JLabel("Type of room");
		lblTypeOfRoom.setForeground(new Color(245, 245, 245));
		lblTypeOfRoom.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lblTypeOfRoom.setBounds(488, 168, 179, 50);
		panel.add(lblTypeOfRoom);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(747, 185, 165, 25);
		panel.add(tf2);
		
		JLabel lblCheckin = new JLabel("Check-in");
		lblCheckin.setForeground(new Color(245, 245, 245));
		lblCheckin.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lblCheckin.setBounds(488, 228, 179, 50);
		panel.add(lblCheckin);
		
		JLabel lblCheckout = new JLabel("Check_out");
		lblCheckout.setForeground(new Color(245, 245, 245));
		lblCheckout.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lblCheckout.setBounds(488, 288, 179, 50);
		panel.add(lblCheckout);
		
		JLabel lblPhoneNo = new JLabel("Phone no.");
		lblPhoneNo.setForeground(new Color(245, 245, 245));
		lblPhoneNo.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lblPhoneNo.setBounds(488, 348, 179, 50);
		panel.add(lblPhoneNo);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(747, 245, 165, 25);
		panel.add(tf3);
		
		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(747, 305, 165, 25);
		panel.add(tf4);
		
		tf5 = new JTextField();
		tf5.setColumns(10);
		tf5.setBounds(747, 368, 165, 25);
		panel.add(tf5);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection connection=null;
				PreparedStatement ps=null;
				ResultSet rs=null;
				
			        String query = "SELECT * FROM `booking` WHERE `number`=?";
			        try {
						connection= MyConnection.getConnection();
				ps=connection.prepareStatement(query);
				ps.setString(1,tf.getText());
				
				rs = ps.executeQuery();
						 
						if(rs.next())
			            {
							tf1.setText(rs.getString("f_n"));
							tf2.setText(rs.getString("room"));
							tf3.setText(rs.getString("in"));
							tf4.setText(rs.getString("out"));
							tf5.setText(rs.getString("no"));
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
		btnDisplay.setFont(new Font("Snap ITC", Font.BOLD, 16));
		btnDisplay.setBounds(660, 431, 142, 34);
		panel.add(btnDisplay);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 140, 0));
		panel_1.setBounds(660, 431, 142, 34);
		panel.add(panel_1);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setForeground(new Color(245, 245, 245));
		lblCustomerName.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lblCustomerName.setBounds(488, 99, 205, 50);
		panel.add(lblCustomerName);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(747, 119, 165, 25);
		panel.add(tf1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\all\\2nd sem1\\oops\\lab\\final project codes\\images\\customer.jpg"));
		label.setBounds(111, 137, 179, 165);
		panel.add(label);
		
		JLabel lblDetailsOfThe = new JLabel("DETAILS OF CUSTOMERS:");
		lblDetailsOfThe.setForeground(new Color(245, 245, 245));
		lblDetailsOfThe.setFont(new Font("Snap ITC", Font.BOLD, 20));
		lblDetailsOfThe.setBounds(85, 10, 380, 67);
		panel.add(lblDetailsOfThe);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 140, 0));
		panel_2.setBounds(40, 23, 425, 45);
		panel.add(panel_2);
		
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
			Registration.main(null);
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
		btnEmployeeList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				employee_details.main(null);
			}
		});
		btnEmployeeList.setBackground(new Color(255, 140, 0));
		mnEmployee.add(btnEmployeeList);
		
		JButton btnEmployeeAttendence = new JButton("Employee Details");
		btnEmployeeAttendence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			employee_data.main(null);
			}
		});
		btnEmployeeAttendence.setBackground(new Color(255, 140, 0));
		mnEmployee.add(btnEmployeeAttendence);
		
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
