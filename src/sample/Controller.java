package sample;

import javafx.scene.control.PasswordField;

import java.awt.*;

public class Controller {
    public TextField UserEmail;
    public PasswordField UserPassword;
    public TextField RecipientEmail;
    public TextField Subject;
    public TextArea Message;
    private Content emailContent;
    public Button sendButton = new Button("Send");
    public void VerifyEmail(){
        if(ValidateContent()){
                emailContent = new Content(UserEmail.getText(),UserPassword.getText(),RecipientEmail.getText(),
                Subject.getText(),Message.getText());

        }
        else {

        }

    }
    public boolean ValidateContent(){
        if(UserEmail.getText().isEmpty()||UserPassword.getText().isEmpty()||RecipientEmail.getText().isEmpty()||
                Subject.getText().isEmpty()||Message.getText().isEmpty())
            return false;
        return true;
    }
}
