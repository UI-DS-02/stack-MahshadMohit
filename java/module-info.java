module com.example.calculater {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculater to javafx.fxml;
    exports com.example.calculater;
}