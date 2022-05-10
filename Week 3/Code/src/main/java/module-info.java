module be.odisee.code {
    requires javafx.controls;
    requires javafx.fxml;


    opens be.odisee.code to javafx.fxml;
    exports be.odisee.code;
}