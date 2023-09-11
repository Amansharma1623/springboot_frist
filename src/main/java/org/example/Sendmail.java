package org.example;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class Sendmail {

        public static void sendEmail(String response){

            final String username = "amansharmaas1622@gmail.com";
            final String password = "App_password";

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(username));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("Geekster@gmail.com"));
                message.setSubject("Send Mail Java API");
                message.setText(response);

                Transport.send(message);

                System.out.println("Email sent successfully.");

            } catch (Exception e) {
                System.out.println(e);
            }
        }


    }

