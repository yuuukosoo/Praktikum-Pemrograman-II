module com.example.javafx_praktikum {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.javafx_praktikum to javafx.fxml;
    opens com.example.javafx_praktikum.controller to javafx.fxml;
    opens com.example.javafx_praktikum.model to javafx.base;

    exports com.example.javafx_praktikum;
    exports com.example.javafx_praktikum.controller;
}
