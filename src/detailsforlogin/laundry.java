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
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class laundry{

	private JFrame frmSubbooking;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					laundry window = new laundry();
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
	public laundry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSubbooking = new JFrame();
		frmSubbooking.setTitle("laundry");
		frmSubbooking.setBounds(100, 100, 1005, 552);
		frmSubbooking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSubbooking.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(-10, 0, 991, 492);
		frmSubbooking.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 140, 0));
		panel_1.setBounds(306, 272, 120, 33);
		panel.add(panel_1);
		
		JLabel lblRoomNo = new JLabel("Room no:");
		panel_1.add(lblRoomNo);
		lblRoomNo.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		
		JLabel lblTime = new JLabel("Time");
		panel_1.add(lblTime);
		
		tf = new JTextField();
		tf.setText(" ");
		tf.setBounds(522, 272, 149, 33);
		panel.add(tf);
		tf.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(0, 0, 0));
		label.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\all\\2nd sem1\\oops\\lab\\final project codes\\images\\laundry8.jpg"));
		label.setBounds(10, 10, 284, 207);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\all\\2nd sem1\\oops\\lab\\final project codes\\images\\laundry4.png"));
		label_1.setBounds(715, 10, 266, 220);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\all\\2nd sem1\\oops\\lab\\final project codes\\images\\laundry7.jpg"));
		label_2.setBounds(10, 251, 266, 188);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\all\\2nd sem1\\oops\\lab\\final project codes\\images\\laundry6.jpg"));
		label_3.setBounds(306, 29, 383, 188);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\all\\2nd sem1\\oops\\lab\\final project codes\\images\\laundry5.png"));
		label_4.setBounds(708, 240, 273, 228);
		panel.add(label_4);
		final JComboBox cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(new String[] {"9:00-10:00", "10:00-11:00", "noon", "1:00-2:00", "2:00-3:00", "3:00-400", "4:00-5:00", "5:00-6:00"}));
		cb.setBounds(532, 348, 136, 21);
		panel.add(cb);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = tf.getText();
		    
		        String time = String.valueOf(cb.getSelectedItem());

		        {
				ResultSet rs=null;
		        PreparedStatement ps;
		        String query = "UPDATE booking SET laundry=? WHERE number=? ";
		        try {
		        	
		            ps = MyConnection.getConnection().prepareStatement(query);
		            ps.setString(1,"yes");		     
		            ps.setString(2, id);
		            if(ps.executeUpdate() > 0)
		            {
		                JOptionPane.showMessageDialog(null, "ADDED");
		                
		            }
		            
		        } catch (SQLException ex) {
		        	ex.printStackTrace();
		        }         
			}}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConfirm.setBackground(new Color(255, 140, 0));
		btnConfirm.setBounds(424, 392, 129, 42);
		panel.add(btnConfirm);
		
		JLabel lblTime_1 = new JLabel("Time");
		lblTime_1.setBackground(new Color(255, 140, 0));
		lblTime_1.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 20));
		lblTime_1.setBounds(306, 338, 120, 33);
		panel.add(lblTime_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 140, 0));
		panel_2.setBounds(302, 338, 103, 33);
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
		
		JButton btnBilling = new JButton("Billing    ");
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
		
		JButton btnAddEmployeeRecord = new JButton("Add Employee Record     ");
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
		btnVacate.setBackground(new Color(255, 140, 0));
		btnVacate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vacating.main(null);
			}
		});
		menuBar.add(btnVacate);
	}
}
