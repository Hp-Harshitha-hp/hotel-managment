package detailsforlogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import com.mysql.cj.util.StringUtils;

import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class trial_for_registration extends Exception
{

	private JFrame frame;
	private JTextField fn;
	private JTextField ln;
	private JTextField number;
	private JTextField checkin1;
	private JTextField checkout1;
	private JTextField mail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trial_for_registration window = new trial_for_registration();
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
	public trial_for_registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1152, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 1138, 42);
		frame.getContentPane().add(panel);
		
		JLabel lblRegistrationForm = new JLabel("Registration form:");
		panel.add(lblRegistrationForm);
		lblRegistrationForm.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(25, 25, 112));
		panel_1.setBounds(0, 44, 1150, 504);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFirstName.setForeground(new Color(245, 255, 250));
		lblFirstName.setBackground(new Color(0, 0, 205));
		lblFirstName.setBounds(28, 16, 156, 32);
		panel_1.add(lblFirstName);
		
		fn = new JTextField();
		fn.setBounds(279, 15, 195, 29);
		panel_1.add(fn);
		fn.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setForeground(new Color(245, 255, 250));
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLastName.setBackground(new Color(0, 0, 205));
		lblLastName.setBounds(28, 105, 156, 32);
		panel_1.add(lblLastName);
		
		ln = new JTextField();
		ln.setColumns(10);
		ln.setBounds(279, 109, 195, 29);
		panel_1.add(ln);
		
		JLabel lblCheckInTime = new JLabel("check in");
		lblCheckInTime.setForeground(new Color(245, 255, 250));
		lblCheckInTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCheckInTime.setBackground(new Color(0, 0, 205));
		lblCheckInTime.setBounds(28, 217, 95, 32);
		panel_1.add(lblCheckInTime);
		
		JLabel lblCheckOut = new JLabel("check out");
		lblCheckOut.setForeground(new Color(245, 255, 250));
		lblCheckOut.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCheckOut.setBackground(new Color(0, 0, 205));
		lblCheckOut.setBounds(28, 272, 86, 32);
		panel_1.add(lblCheckOut);
		
		JLabel lblRoomType = new JLabel("Room type");
		lblRoomType.setForeground(new Color(245, 255, 250));
		lblRoomType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRoomType.setBackground(new Color(0, 0, 205));
		lblRoomType.setBounds(600, 105, 156, 32);
		panel_1.add(lblRoomType);
		
		final JComboBox cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(new String[] {"1-Bedded", "2-Bedded", "Suit"}));
		cb.setBounds(817, 113, 136, 21);
		panel_1.add(cb);
		
		JLabel lblPhoneNo = new JLabel("Phone num");
		lblPhoneNo.setForeground(new Color(245, 255, 250));
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhoneNo.setBackground(new Color(0, 0, 205));
		lblPhoneNo.setBounds(600, 16, 156, 32);
		panel_1.add(lblPhoneNo);
		
		number = new JTextField();
		number.setColumns(10);
		number.setBounds(817, 19, 195, 29);
		panel_1.add(number);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String first_Name = fn.getText();
		        String last_Name = ln.getText();
		       
		        String checkin = checkin1.getText();
		        String checkout =checkout1.getText();
		  
		        String room_type = String.valueOf(cb.getSelectedItem());

		        String phone_no= number.getText();
		        String mailid=mail.getText();
		      {
		    	  ResultSet rs=null;
		        PreparedStatement ps,ps1;
		        String mail=null;
		        String query = "INSERT INTO `booking`(`f_n`, `l_n`, `in`, `out`, `room`, `no`,`Bill`, `no_1-bed`,`no_2-bed`, `suit`,`mail_id`,`laundry`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?) ";
		        String query1 = "SELECT * FROM booking";
		      
		        try {
		        	int count = 0,count1 = 0,count2 = 0,count3=0;

		            ps = MyConnection.getConnection().prepareStatement(query);
		            ps1 = MyConnection.getConnection().prepareStatement(query1);
		            ps.setString(1, first_Name);
		            ps.setString(2, last_Name);
		     
		            ps.setString(3, checkin);
		            ps.setString(4, checkout);
		            ps.setString(5, room_type);
		            ps.setString(6, phone_no);
		         
		            ps.setString(7, null);
		            ps.setString(11, mailid);
		       
		            ps.setString(12, null);
		            rs = ps1.executeQuery(query1);
		         
		            String value= (String) cb.getSelectedItem();
		            System.out.println(value);
		            
		            if(first_Name==""||last_Name=="")
		            {
		          JOptionPane.showMessageDialog(null, "Please enter all the details");
		          }
		           
		            while(rs.next())
		            {
		            	count = rs.getInt("no_1-bed");
		            	count1=rs.getInt("no_2-bed");
		            	count2=rs.getInt("suit");
		            	count3=rs.getInt("number");
		            	
		            }
		          if(count<=100||count1<=100||count2<=100) {
		            if(value.equals("1-Bedded"))
		            {
		            ps.setInt(8, (count+1));
		            ps.setInt(9,count1);
		            ps.setInt(10,count2);
		            }
		           if(value.equals("2-Bedded")) {
		            ps.setInt(8, count);
		            ps.setInt(9, (count1 + 1));
		            ps.setInt(10,count2);
		            }
		           if(value.equals("Suit"))
		            { ps.setInt(8, count);
		            ps.setInt(9,count1);
		            ps.setInt(10, (count2 + 1));
		            }}
		          else
		            {
		            	JOptionPane.showMessageDialog(null, "SORRY! ROOMS unavailable");
		            }
		           
		            if(ps.executeUpdate() > 0)
		            {
		                JOptionPane.showMessageDialog(null, "New User Add");
		                
		            }
		            try{
		       	       
		                  
		        String host ="smtp.gmail.com" ;
		        
		                  String user = "lucky8008422@gmail.com";
		           
		               String pass = "lalitha12345";
		           String to = mailid;   
		           System.out.println(mailid);
		         String from = "lucky8008422@gmail.com";
		                
		          String subject = "Thanks for Booking in Oloha hotel";
		           
		               String messageText = "Mr."+first_Name+" you have booked "+room_type+" room and the "+" room number is "+(count3+1)+" your check in and check out dates are "+checkin+" and  "+checkout+"\n"+
		               "Thanks for Booking";
		           
		               boolean sessionDebug = false;

		                
		          Properties props = System.getProperties();

		              
		            props.put("mail.smtp.starttls.enable", "true");
		           
		               props.put("mail.smtp.host", host);
		            
		              props.put("mail.smtp.port", "587");
		            
		              props.put("mail.smtp.auth", "true");
		         
		                 props.put("mail.smtp.starttls.required", "true");

		          
		                java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		             
		             Session mailSession = Session.getDefaultInstance(props, null);
		                
		          mailSession.setDebug(sessionDebug);
		                
		          Message msg = new MimeMessage(mailSession);
		           
		               msg.setFrom(new InternetAddress(from));
		          
		                InternetAddress[] address = {new InternetAddress(to)};
		             
		             msg.setRecipients(Message.RecipientType.TO, address);
		               
		           msg.setSubject(subject); msg.setSentDate(new Date());
		              
		            msg.setText(messageText);

		             
		            Transport transport=mailSession.getTransport("smtp");
		            
		             transport.connect(host, user, pass);
		              
		           transport.sendMessage(msg, msg.getAllRecipients());
		           
		              transport.close();
		             
		              JOptionPane.showMessageDialog(null, "Message sent Successfully");
		           
		           }
		       catch(Exception ex)
		            
		          {
		             
		    	   JOptionPane.showMessageDialog(null, "Invalid Username");
		         
		             }

		            
		        } catch (SQLException ex) {
		        	ex.printStackTrace();
		        }
		        }                   
				 
			sub_booking.main(null);
			frame.setVisible(false);
			}
		});
		btnSubmit.setBackground(new Color(0, 255, 255));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnSubmit.setBounds(810, 424, 136, 45);
		panel_1.add(btnSubmit);
		
		checkin1 = new JTextField();
		checkin1.setBounds(194, 224, 96, 19);
		panel_1.add(checkin1);
		checkin1.setColumns(10);
		
		checkout1 = new JTextField();
		checkout1.setColumns(10);
		checkout1.setBounds(194, 279, 96, 19);
		panel_1.add(checkout1);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(new Color(245, 245, 245));
		lblAddress.setBackground(new Color(245, 255, 250));
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(600, 192, 128, 32);
		panel_1.add(lblAddress);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(817, 199, 306, 65);
		panel_1.add(textArea);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sub_booking.main(null);
			frame.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnBack.setBackground(new Color(0, 255, 255));
		btnBack.setBounds(194, 424, 136, 45);
		panel_1.add(btnBack);
		
		JLabel lblGmail = new JLabel("Gmail");
		lblGmail.setForeground(new Color(245, 245, 245));
		lblGmail.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGmail.setBackground(new Color(245, 255, 250));
		lblGmail.setBounds(600, 320, 128, 32);
		panel_1.add(lblGmail);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(817, 324, 195, 29);
		panel_1.add(mail);
		
		JLabel label = new JLabel("");
		label.setBounds(334, 217, 143, 26);
		panel_1.add(label);
	}
}
