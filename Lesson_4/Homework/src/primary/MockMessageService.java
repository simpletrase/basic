package primary;

import javafx.scene.control.TextArea;

public class MockMessageService implements MessageServiceInterface {

    private TextArea chatTextArea;

    public MockMessageService(TextArea chatTextArea) {
        this.chatTextArea = chatTextArea;
    }

    @Override
    public void sendMessage(String message) {
        System.out.printf("Message %s has been sent%n", message);
        processRetrievedMessage(message);
    }

    @Override
    public void processRetrievedMessage(String message) {
        chatTextArea.appendText(message + System.lineSeparator());
    }
}
