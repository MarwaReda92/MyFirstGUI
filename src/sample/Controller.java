package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { //this clears the label tag
        messageLabel.setText("");
    }
}
