module com.example.calculater {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens com.example.calculater to javafx.fxml;
    exports com.example.calculater;
}