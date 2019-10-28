package primary;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller implements Initializable {

    public @FXML TextArea chatTextArea;
    public @FXML TextField messageTextField;
    public @FXML Button sendMessageButton;

    private MessageServiceInterface messageService;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.messageService = new MockMessageService(chatTextArea);
    }

    @FXML
    public void sendText(ActionEvent actionEvent) {
        sendMessage();
    }

    @FXML
    public void sendMessage(ActionEvent actionEvent) {
        sendMessage();
    }

    private void sendMessage() {
        String message = messageTextField.getText();
        messageService.sendMessage(message);
        messageTextField.clear();
    }
}
