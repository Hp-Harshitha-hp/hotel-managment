/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * https://www.google.com/settings/security/lesssecureapps
 */


package detailsforlogin;


/**
 *
 * @author Naveen
 */

import java.util.*;

import javax.mail.*;

import javax.mail.internet.*;

import javax.mail.internet.MimeMessage;

public class EmailSend {

 
   public static void main(String args[]){
   
     try{
           
 String host ="smtp.gmail.com" ;
 
           String user = "lucky8008422@gmail.com";
    
        String pass = "lalitha12345";
        
    String to = "harshitha4437@gmail.com ";
          
  String from = "lucky8008422@gmail.com";
         
   String subject = "sample mail";
    
        String messageText = "This is a Is Test Email :"
        		+ "hello";
    
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

