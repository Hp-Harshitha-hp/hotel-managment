
package detailsforlogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import javax.mail.*;

import javax.mail.internet.*;

import javax.mail.internet.MimeMessage;

public class EmailSend1 {

 
   public static void main(String args[]){
   
     try{
    	 String query1 = "SELECT * FROM booking";
    	 ResultSet rs=null;
	        PreparedStatement ps;
	        String mail = null;
           
 String host ="smtp.gmail.com" ;
 
           String user = "lucky8008422@gmail.com";
    
        String pass = "lalitha12345";
    String to = mail;       
  String from = "lucky8008422@gmail.com";
         
   String subject = "sample mail";
    
        String messageText = "Your Is Test Email :";
    
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
      
     System.out.println("message send successfully");
    
    }
catch(Exception ex)
     
   {
      
      System.out.println(ex);
  
      }

    }
}


