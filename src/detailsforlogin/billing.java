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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class billing extends Exception{
int sum1;
int sum2,sum3,sum;
String ssum1,ssum2,ssum3;
	private JFrame frmSubbooking;
	private JTextField room;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					billing window = new billing();
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
	public billing() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 991, 78);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOrderPlease = new JLabel("ORDER PLEASE");
		lblOrderPlease.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 30));
		lblOrderPlease.setBounds(301, 10, 346, 68);
		panel_1.add(lblOrderPlease);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 140, 0));
		panel_2.setBounds(0, 0, 991, 78);
		panel_1.add(panel_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\all\\2nd sem1\\oops\\lab\\final project codes\\images\\untitled.png"));
		label.setBounds(10, 163, 344, 319);
		panel.add(label);
		
		JLabel lblSelect = new JLabel("Main Dish:");
		lblSelect.setForeground(new Color(245, 245, 245));
		lblSelect.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblSelect.setBounds(585, 88, 147, 23);
		panel.add(lblSelect);
		
		
		
		JLabel lblStarter = new JLabel("Starters:");
		lblStarter.setForeground(new Color(245, 245, 245));
		lblStarter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblStarter.setBounds(376, 88, 147, 23);
		panel.add(lblStarter);
		
		JLabel lblDessert = new JLabel("Dessert:");
		lblDessert.setForeground(new Color(245, 245, 245));
		lblDessert.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblDessert.setBounds(794, 88, 147, 23);
		panel.add(lblDessert);
		
		final JComboBox cb1 = new JComboBox();
		cb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				String item1 = String.valueOf(cb1.getSelectedItem());
				//String item2 = String.valueOf(cb2.getSelectedItem());
				//String item3 = String.valueOf(cb3.getSelectedItem());
				if(item1.equals("veg manchow soup"))
				{
					sum1=150;
				}
				else if(item1.equals("crispy baby corn"))
				{
					sum1=200;
				}
				else if(item1.equals("chicken 65"))
				{
					sum1=250;
				}
				
				//if(item3.equals("Molten Choclate Cake")||item3.equals("Black Forest Cake")||item3.equals("Blue Berry CupCakes"))
				//{
					//sum3=150;
				//}
				//sum=sum1+sum2+sum3;
				String ssum1=Integer.toString(sum1);
				tf1.setText(ssum1);
				
			}
		});
		cb1.setModel(new DefaultComboBoxModel(new String[] {"veg manchow soup", "crispy baby corn", "chicken 65"}));
		cb1.setBounds(379, 147, 111, 21);
		panel.add(cb1);
		final JComboBox cb2 = new JComboBox();
		cb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				String item2 = String.valueOf(cb2.getSelectedItem());
				
				
				if(item2.equals("Bahubali Thali"))
				{
					sum2=850;
				}
				else if(item2.equals("South Indian Thali"))
				{
					sum2=750;
				}
				else if(item2.equals("North Indian Thali"))
				{
					sum2=650;
				}
				else if(item2.equals("Chicken Biryani"))
				{
					sum2=400;
				}
				
				String ssum2=Integer.toString(sum2);
				tf2.setText(ssum2);
				
			}
		});
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Bahubali Thali", "South Indian Thali", "North Indian Thali", "Chicken Biryani"}));
		cb2.setBounds(574, 147, 158, 21);
		panel.add(cb2);
		
		
		final JComboBox cb3 = new JComboBox();
		cb3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				//String item2 = String.valueOf(cb2.getSelectedItem());
				String item3 = String.valueOf(cb3.getSelectedItem());
				if(item3.equals("Molten Choclate Cake"))
				{
			sum3=170;
				}
				else if(item3.equals("Black Forest Cake"))
				{
			sum3=150;
				}
				else if(item3.equals("Blue Berry CupCakes"))
				{
			sum3=200;
				}
				
				//sum=sum1+sum2+sum3;
				String ssum3=Integer.toString(sum3);
				tf3.setText(ssum3);
				
			}
		});
		cb3.setModel(new DefaultComboBoxModel(new String[] {"Molten Choclate Cake", "Black Forest Cake", "Blue Berry CupCakes"}));
		cb3.setBounds(794, 147, 171, 21);
		panel.add(cb3);
		
		
		JButton btn = new JButton("Bill");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sum=sum1+sum2+sum3;
				String ssum=Integer.toString(sum);
				ResultSet rs=null;
				
				total.setText(ssum);
				
				int id = Integer.parseInt(room.getText());

		        int bill=Integer.parseInt(total.getText());
		      {
		          
		        PreparedStatement ps;
		        String query = "UPDATE booking SET Bill=? WHERE number=? ";
		   
		        try {
		        		
		            ps = MyConnection.getConnection().prepareStatement(query);
		      // exColumnValue is the data you're trying to insert
		            ps.setInt(1,bill);		     
		            ps.setInt(2, id); 
		            ps.executeUpdate();
		            if(ps.executeUpdate() > 0)
		            {	
  JOptionPane.showMessageDialog(null, "BIILED SUCCESSFULLY");
		                
		            }
		            else
		            {
	                    JOptionPane.showMessageDialog(null, "Enter correct Id number", "oops", 2);
		            }
		        	
		        } catch (SQLException ex) {
		        	ex.printStackTrace();
		        }
		        } 
				
			}
		});
		btn.setBounds(524, 411, 130, 32);
		panel.add(btn);
		
		JLabel lblId = new JLabel("Room no.");
		lblId.setForeground(new Color(245, 245, 245));
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblId.setBounds(22, 113, 107, 23);
		panel.add(lblId);
		
		room = new JTextField();
		room.setBounds(197, 118, 96, 19);
		panel.add(room);
		room.setColumns(10);
		
		JLabel lblCost = new JLabel("Cost:");
		lblCost.setForeground(new Color(245, 245, 245));
		lblCost.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCost.setBounds(376, 220, 74, 23);
		panel.add(lblCost);
		
		tf1 = new JTextField();
		tf1.setBounds(376, 263, 96, 19);
		panel.add(tf1);
		tf1.setColumns(10);
		
		JLabel label_1 = new JLabel("Cost:");
		label_1.setForeground(new Color(245, 245, 245));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(585, 227, 74, 23);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Cost:");
		label_2.setForeground(new Color(245, 245, 245));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(805, 227, 74, 23);
		panel.add(label_2);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(585, 263, 96, 19);
		panel.add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(794, 263, 96, 19);
		panel.add(tf3);
		
		JLabel lblToatalCost = new JLabel("Toatal Cost:");
		lblToatalCost.setForeground(new Color(245, 245, 245));
		lblToatalCost.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblToatalCost.setBounds(389, 349, 158, 32);
		panel.add(lblToatalCost);
		
		total = new JTextField();
		total.setColumns(10);
		total.setBounds(558, 357, 158, 21);
		panel.add(total);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 165, 0));
		menuBar.setForeground(new Color(0, 0, 205));
	
		frmSubbooking.setJMenuBar(menuBar);
		
		JButton btnHome = new JButton("HOME");
		btnHome.setForeground(new Color(0, 0, 0));
		btnHome.setBackground(new Color(255, 140, 0));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				billing.main(null);
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
		
		JButton btnAddEmployeeRecord = new JButton("Add Employee Record   ");
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
