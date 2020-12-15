package sample;

import javafx.scene.control.TextField;

public class Content {
    String fromEmail;
    String password;
    String toEmail;
    String subject;
    String message;
    Content(
            String fromEmail,
            String password,
            String toEmail,
            String subject,
            String message
    ){
    this.fromEmail=fromEmail;
    this.password=password;
    this.toEmail=toEmail;
    this.subject=subject;
    this.message=message;
    }
    public String getFromEmail(){
        return fromEmail;
    }
    public String getPassword(){
        return password;
    }
    public String getToEmail(){
        return toEmail;
    }
    public String getSubject(){
        return subject;
    }
    public String getMessage(){
        return message;
    }

}
