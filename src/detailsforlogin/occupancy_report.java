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
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class occupancy_report{

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
					occupancy_report window = new occupancy_report();
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
	public occupancy_report() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSubbooking = new JFrame();
		frmSubbooking.setTitle("sub_booking");
		frmSubbooking.setBounds(100, 100, 1005, 552);
		frmSubbooking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSubbooking.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 991, 492);
		frmSubbooking.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(241, 108, 476, 22);
		panel.add(separator);
		
		JLabel lblOccupancyReport = new JLabel("OCCUPANCY REPORT");
		lblOccupancyReport.setForeground(new Color(245, 245, 245));
		lblOccupancyReport.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblOccupancyReport.setBounds(310, 37, 339, 61);
		panel.add(lblOccupancyReport);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 140, 0));
		panel_1.setBounds(241, 37, 476, 61);
		panel.add(panel_1);
		
		JLabel lblNumberOfbedded = new JLabel("NUMBER OF  1-BEDDED ROOMS:");
		lblNumberOfbedded.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumberOfbedded.setBounds(123, 154, 339, 44);
		panel.add(lblNumberOfbedded);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 140, 0));
		panel_2.setBounds(124, 159, 306, 39);
		panel.add(panel_2);
		
		tf = new JTextField();
		tf.setBounds(576, 164, 206, 34);
		panel.add(tf);
		tf.setColumns(10);
		
		JLabel lblNumberOfbedded_1 = new JLabel("NUMBER OF  2-BEDDED ROOMS:");
		lblNumberOfbedded_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumberOfbedded_1.setBounds(123, 256, 339, 44);
		panel.add(lblNumberOfbedded_1);
		
		JLabel lblNumberOfSuits = new JLabel("NUMBER OF SUITS:");
		lblNumberOfSuits.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumberOfSuits.setBounds(123, 355, 339, 44);
		panel.add(lblNumberOfSuits);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(576, 273, 206, 34);
		panel.add(tf1);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(576, 372, 206, 34);
		panel.add(tf2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 140, 0));
		panel_3.setBounds(123, 261, 306, 39);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 140, 0));
		panel_4.setBounds(124, 355, 306, 39);
		panel.add(panel_4);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection connection=null;
				PreparedStatement ps=null;
				ResultSet rs=null;
				
			        String query = "SELECT * FROM booking";
			        try {
						connection= MyConnection.getConnection();
				ps=connection.prepareStatement(query);
				
				
				rs = ps.executeQuery();
						 
						while(rs.next())
			            {
							tf.setText(rs.getString("no_1-bed"));
							tf1.setText(rs.getString("no_2-bed"));
							tf2.setText(rs.getString("Suit"));
							
									            }
			            						
			           
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		});
		btnShow.setBounds(452, 432, 124, 34);
		panel.add(btnShow);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 140, 0));
		panel_5.setBounds(452, 432, 124, 34);
		panel.add(panel_5);
		
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
		
		JButton btnBilling = new JButton("Billing     ");
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
		
		JButton btnAddEmployeeRecord = new JButton("Add Employee Record        ");
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
		
		JButton btnEmployeeDetails = new JButton("Employee Details");
		btnEmployeeDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				employee_data.main(null);
			}
		});
		btnEmployeeDetails.setBackground(new Color(255, 140, 0));
		mnEmployee.add(btnEmployeeDetails);
		
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
