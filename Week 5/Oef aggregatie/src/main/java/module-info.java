module be.odisee.huiswerk {
    requires javafx.controls;
    requires javafx.fxml;


    opens be.odisee.huiswerk4 to javafx.fxml;
    exports be.odisee.huiswerk4;
}