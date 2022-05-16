package be.odisee.encryptie;

import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * implements a controller for encryptie-view
 */
public class EncryptieController {
    @FXML
    private TextField txtOrigineel, txtVersleuteld;

    @FXML
    private RadioButton btnAchterstevoren, btnEigen;

    /*@FXML // dit is hier niet nodig
    private int dummy=0;
    */

    /**
     * klik op encrypt button
     */
    @FXML
    protected void onEncryptButtonClick() {
        if(btnAchterstevoren.isSelected()){
            // Encrypt using first algorithm
            EncryptieAchterstevoren encryptor = new EncryptieAchterstevoren();

            String input = txtOrigineel.getText();
            String output = encryptor.encrypt(input);
            txtVersleuteld.setText(output);

            //txtVersleuteld.setText(encryptor.encrypt(txtOrigineel.getText()));
        } else if(btnEigen.isSelected()){
            // Encrypt using 2nd algorithm
        } else {
            // Alert
            Alert alert = new Alert(Alert.AlertType.NONE, "Selecteer eerst een encryptiealgoritme", ButtonType.CLOSE);
            alert.show();
        }
    }

    /**
     * klik op decrypt button
     */
    @FXML
    protected void onDecryptButtonClick() {
    }
}