package com.example.calculater;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HistoryMainPage implements Initializable {

    @FXML
    private Rectangle calculatorPage;

    @FXML
    private Button clear;
    @FXML
    private Rectangle graphPage;

    @FXML
    private Text math;

    @FXML
    void setCalculatorPage(MouseEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("calculatorPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void setGraphPage(MouseEvent e) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("graph.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void setClear(MouseEvent e){
        SqlConnector sql = new SqlConnector();
        String sqlCmd = "Truncate table calculator";
        sql.ExecuteSQL(sqlCmd);
        setText();
    }
    void setText(){
        SqlConnector sql =  new SqlConnector();
        String sqlCmd = "Select * FROM calculator";
        math.setText(sql.printDatabase(sqlCmd));
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setText();
    }

}
