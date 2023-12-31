package com.example.calculater;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorPage {

    @FXML
    private Rectangle clear;

    @FXML
    private Rectangle divide;

    @FXML
    private Rectangle eight;

    @FXML
    private Rectangle factorial;

    @FXML
    private Rectangle five;

    @FXML
    private Rectangle four;
    @FXML
    private Rectangle graphPage;

    @FXML
    private Rectangle history;

    @FXML
    private Text javab;

    @FXML
    private Text mohasebat;

    @FXML
    private Rectangle momayez;

    @FXML
    private Rectangle mosavi;

    @FXML
    private Rectangle nine;

    @FXML
    private Rectangle one;

    @FXML
    private Rectangle pow;

    @FXML
    private Rectangle historyPage;

    @FXML
    private Rectangle seven;

    @FXML
    private Rectangle six;

    @FXML
    private Rectangle sub;

    @FXML
    private Rectangle sum;

    @FXML
    private Rectangle three;

    @FXML
    private Rectangle two;

    @FXML
    private Rectangle zarb;

    @FXML
    private Rectangle zero;
    @FXML
    private Rectangle parClose;
    @FXML
    private Rectangle parOpen;
    @FXML
    private Rectangle del;
    public static StringBuilder sb = new StringBuilder();

    @FXML
    void clearMouse(MouseEvent event) {
        sb.delete(0, sb.length());
        mohasebat.setText(sb.toString());
        javab.setText("");
    }

    @FXML
    void dMouse(MouseEvent event) {
        sb.append("/");
        mohasebat.setText(String.valueOf(sb));
    }
    @FXML
    void closeMouse(MouseEvent e){
        sb.append(")");
        mohasebat.setText(String.valueOf(sb));
    }
    @FXML
    void openMouse(MouseEvent e){
        sb.append("(");
        mohasebat.setText(String.valueOf(sb));
    }
    @FXML
    void delMouse(MouseEvent e){
        sb.deleteCharAt(sb.length()-1);
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void eightMouse(MouseEvent event) {
        sb.append(8);
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void equalMouse(MouseEvent event) throws Exception {
        try {
            javab.setText(String.valueOf(Calculator.calculate(sb.toString())));
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("error");
            alert.showAndWait();
        }

        SqlConnector sql =  new SqlConnector();
        String sqlCom = String.format("INSERT INTO calculator (input , output) VALUES ('%s','%s')",sb.toString(),String.valueOf(Calculator.calculate(sb.toString())));
        sql.ExecuteSQL(sqlCom);
        String sqlCmd = "Select * FROM calculator";
        //sql.showDatabase(sqlCmd);
    }

    @FXML
    void fMouse(MouseEvent event) {
        sb.append("!");
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void fiveMouse(MouseEvent event) {
        sb.append(5);
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void fourMouse(MouseEvent event) {
        sb.append(4);
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void hMouse(MouseEvent event) {

    }

    @FXML
    void lightOne(MouseEvent event) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        one.setEffect(dropShadow);
    }
    @FXML
    void lightOpen(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        parOpen.setEffect(dropShadow);
    }
    @FXML
    void lightClose(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        parClose.setEffect(dropShadow);
    }
    @FXML
    void lightDel(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        del.setEffect(dropShadow);
    }
    @FXML
    void lightClear(MouseEvent event){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        clear.setEffect(dropShadow);
    }
    @FXML
    void lightSum(MouseEvent event){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(10);
        sum.setEffect(dropShadow);
    }
    @FXML
    void lightSub(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        sub.setEffect(dropShadow);
    }
    @FXML
    void lightDivide(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        divide.setEffect(dropShadow);
    }
    @FXML
    void lightTwo(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        two.setEffect(dropShadow);
    }
    @FXML
    void lightThree(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        three.setEffect(dropShadow);
    }
    @FXML
    void lightFour(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        four.setEffect(dropShadow);
    }
    @FXML
    void lightFive(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        five.setEffect(dropShadow);
    }
    @FXML
    void lightSix(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        six.setEffect(dropShadow);
    }
    @FXML
    void lightSeven(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        seven.setEffect(dropShadow);
    }
    @FXML
    void lightEight(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        eight.setEffect(dropShadow);
    }
    @FXML
    void lightNine(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        nine.setEffect(dropShadow);
    }
    @FXML
    void lightPow(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        pow.setEffect(dropShadow);
    }
    @FXML
    void lightZarb(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        zarb.setEffect(dropShadow);
    }
    @FXML
    void lightEqual(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.RED);
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        mosavi.setEffect(dropShadow);
    }
    @FXML
    void lightZero(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        zero.setEffect(dropShadow);
    }
    @FXML
    void lightMomayez(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        momayez.setEffect(dropShadow);
    }
    @FXML
    void lightFactorial(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        factorial.setEffect(dropShadow);
    }
    @FXML
    void lightH(MouseEvent e){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91",1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        history.setEffect(dropShadow);
    }

    @FXML
    void moMouse(MouseEvent event) {
        sb.append(".");
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void nineMouse(MouseEvent event) {
        sb.append(9);
        mohasebat.setText(String.valueOf(sb));
    }



    @FXML
    void oneMouse(MouseEvent event) {
        sb.append(1);
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void powMouse(MouseEvent event) {
        sb.append("^");
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void sevenMouse(MouseEvent event) {
        sb.append(7);
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void sixMouse(MouseEvent event) {
        sb.append(6);
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void subMouse(MouseEvent event) {
        sb.append("-");
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void sumMouse(MouseEvent event) {
        sb.append("+");
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void threeMouse(MouseEvent event) {
        sb.append(3);
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void twoMouse(MouseEvent event) {
        sb.append(2);
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void zarbMouse(MouseEvent event) {
        sb.append("*");
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void zeroMouse(MouseEvent event) {
        sb.append(0);
        mohasebat.setText(String.valueOf(sb));
    }

    @FXML
    void off0(MouseEvent e){
        zero.setEffect(null);
    }
    @FXML
    void off1(MouseEvent e){
        one.setEffect(null);
    }
    @FXML
    void off2(MouseEvent e){
        two.setEffect(null);
    }
    @FXML
    void off3(MouseEvent e){
        three.setEffect(null);
    }
    @FXML
    void off4(MouseEvent e){
        four.setEffect(null);
    }
    @FXML
    void off5(MouseEvent e){
        five.setEffect(null);
    }
    @FXML
    void off6(MouseEvent e){
        six.setEffect(null);
    }
    @FXML
    void off7(MouseEvent e){
        seven.setEffect(null);
    }
    @FXML
    void off8(MouseEvent e){
        eight.setEffect(null);
    }
    @FXML
    void off9(MouseEvent e){
        nine.setEffect(null);
    }
    @FXML
    void offClear(MouseEvent e){
        clear.setEffect(null);
    }
    @FXML
    void offSum(MouseEvent e){
        sum.setEffect(null);
    }
    @FXML
    void offSub(MouseEvent e){
        sub.setEffect(null);
    }
    @FXML
    void offDivide(MouseEvent e){
        divide.setEffect(null);
    }
    @FXML
    void offPow(MouseEvent e){
        pow.setEffect(null);
    }
    @FXML
    void offZarb(MouseEvent e){
        zarb.setEffect(null);
    }
    @FXML
    void offEquall(MouseEvent e){
        mosavi.setEffect(null);
    }
    @FXML
    void offMomayez(MouseEvent e){
        momayez.setEffect(null);
    }
    @FXML
    void offFactorial(MouseEvent e){
        factorial.setEffect(null);
    }
    @FXML
    void offHistory(MouseEvent e){
        history.setEffect(null);
    }
    @FXML
    void offClose(MouseEvent e){parClose.setEffect(null);}
    @FXML
    void offOpen(MouseEvent e){parOpen.setEffect(null);}
    @FXML
    void offDel(MouseEvent e){del.setEffect(null);}
    public void setHistoryPage(MouseEvent e) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("historyMainPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void setGraphPage(MouseEvent e) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("graph.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}
