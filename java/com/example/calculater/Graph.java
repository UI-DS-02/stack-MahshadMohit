package com.example.calculater;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static com.example.calculater.Calculator.calculate;

public class Graph implements Initializable {

    @FXML
    private Rectangle calculatorPage;

    @FXML
    private Rectangle historyPage;

    @FXML
    private Rectangle mosavi;
    @FXML
    private AnchorPane ap;
    public NumberAxis numberAxis = new NumberAxis(1, 10, 1);
    public NumberAxis yxis = new NumberAxis(0, 45, 5);
    public LineChart lineChart1 = new LineChart(numberAxis, yxis);
    TextField textField = new TextField();
    XYChart.Series series1 = new XYChart.Series();

    public static StringBuilder sb = new StringBuilder();


    void equalMsouse(MouseEvent e) {
        //sb = new StringBuilder("x*2 + x*3");
        //series.getData().add(new XYChart.Data<>(2, 30));
        //lineChart.getData().add(series);
        // for (int i = 0; i < 10; i++) {
        //  series.getData().add(new XYChart.Data<>(i , Calculator.calculate(toSth(sb,i))));
        //}
    }

    @FXML
    void equalMouse(MouseEvent e)  {
        sb = new StringBuilder(textField.getText());
        series1 = new XYChart.Series();

        for (int i = 0; i < 11; i++) {
            series1.getData().add(new XYChart.Data(i, calculate(toSth(sb, i))));
        }

        lineChart1.getData().add(series1);
    }

    public static String toSth(StringBuilder str, int index) {
        StringBuilder sn = new StringBuilder();
        char[] chars = str.toString().toCharArray();
        for (char aChar : chars) {
            if (aChar == 'x') {
                sn.append(index);
            } else {
                sn.append(aChar);
            }
        }
        return sn.toString();
    }
    @FXML
    void setCalculatorPage(MouseEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("calculatorPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void setHistoryPage(MouseEvent e) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("historyMainPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        lineChart1.setPrefWidth(361);
        lineChart1.setPrefHeight(275);
        lineChart1.setLayoutX(-15);
        lineChart1.setLayoutY(22);


        textField.setPrefWidth(301);
        textField.setPrefHeight(44);
        textField.setLayoutX(25);
        textField.setLayoutY(291);
        Group group = new Group(lineChart1, textField);
        ap.getChildren().add(group);
    }
}
