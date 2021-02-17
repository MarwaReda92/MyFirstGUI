package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button button;

    @FXML
    private Label messageLabel;


    /**
     * When the button is clicked, display something in the console
     */
    @FXML
    private void buttonPushed(){
        messageLabel.setText("Here is a new message");
    }
}
