package be.odisee.code;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtVoornaam;

    @FXML
    private TextField txtAchternaam;

    @FXML
    public void registreerUser(){
        String voornaam = txtVoornaam.getText();
        String achternaam = txtAchternaam.getText();

        User user = new User(voornaam, achternaam);

        Database database = new Database();
        database.addUser(user);
    }

    @FXML void loginUser(){

    }

    private void helperfunctie(){

    }
}