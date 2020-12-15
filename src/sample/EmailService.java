package sample;

import com.sun.jdi.connect.Transport;

import java.util.Properties;

public class EmailService {
    Content emailContent;

    EmailService(Content content){
        emailContent= content;
    }

    public void SendEmail(){
        String host = "localhost";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(properties);

        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(emailContent.getFromEmail());
            message.addRecipient(emailContent.getToEmail());
            message.setSubject(emailContent.getSubject());
            message.setText(emailContent.getMessage());
            Transport.send(message);
            System.out.println("Sent successfully....");
        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}

