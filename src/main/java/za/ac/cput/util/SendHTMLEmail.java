package za.ac.cput.util;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendHTMLEmail {

    public static void sendEmail(String email) {
        String[] verify = new String[2];
        boolean verified = true;
        String to = "";

        if (email.contains("@")) verify = email.split("@");
        if (verify[0].trim().toLowerCase() == "" || verify[1].trim().toLowerCase() == "") verified = false;
        // Recipient's email ID needs to be mentioned.
        if (verified) to = email;

        // Sender's email ID needs to be mentioned
        String from = "horridhenry1694@gmail.com";

        // Assuming you are sending email from localhost
        String host = "localhost";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.setProperty("mail.smtp.host", host);

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Application form info");

            // Send the actual HTML message, as big as you like
            message.setContent("<h1>Following is a link to your application form</h1>" +
                    "<a target='_blank' href='+token+'>Application Form</a>", "text/html; charset=utf-8");

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
