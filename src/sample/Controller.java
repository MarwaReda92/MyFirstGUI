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

    private DeckOfCards deckOfCards; //goes inside controller class, and before the methods


    /**
     * When the button is clicked, display something in the console
     */
    @FXML
    private void buttonPushed(){
        Card card = deckOfCards.dealTopCard(); //creates/gets card object by dealing the top of the deck
        messageLabel.setText(card.toString()); //update the label by calling the settext method, and we pass in a string from the card
    }

    /**
     * This method s called when the scene loads
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deckOfCards = new DeckOfCards(); //instantiates new deck of cards
        deckOfCards.shuffle();  //shuffles the deck
        messageLabel.setText("");  //clears the label text
    }
}
