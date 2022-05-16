module be.odisee.encryptie {
    requires javafx.controls;
    requires javafx.fxml;


    opens be.odisee.encryptie to javafx.fxml;
    exports be.odisee.encryptie;
}