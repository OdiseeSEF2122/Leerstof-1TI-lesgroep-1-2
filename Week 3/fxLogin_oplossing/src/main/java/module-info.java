module be.odisee.fxxxtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens be.odisee.fxlogin to javafx.fxml;
    exports be.odisee.fxlogin;
}