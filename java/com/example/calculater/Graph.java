package com.example.calculater;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Graph {

    @FXML
    private Rectangle calculatorPage;

    @FXML
    private Rectangle clear;

    @FXML
    private Rectangle del;

    @FXML
    private Rectangle divide;

    @FXML
    private Rectangle eight;

    @FXML
    private Rectangle five;

    @FXML
    private Rectangle four;
    @FXML
    private Text text;

    @FXML
    private Rectangle historyPage;
    final NumberAxis xAxis = new NumberAxis();
    final NumberAxis yAxis = new NumberAxis();

    @FXML
    private LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
    public XYChart.Series<Number, Number> series = new XYChart.Series<>();
    @FXML
    private Rectangle momayez;

    @FXML
    private Rectangle mosavi;

    @FXML
    private Rectangle nine;

    @FXML
    private Rectangle one;
    @FXML
    private Rectangle xBtn;

    @FXML
    private Rectangle parClose;

    @FXML
    private Rectangle parOpen;

    @FXML
    private Rectangle pow;

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

    public static StringBuilder sb = new StringBuilder();

    @FXML
    void oneMouse(MouseEvent e){
        sb.append(1);
    }
    @FXML
    void twoMouse(MouseEvent e){
        sb.append(2);
    }
    @FXML
    void threeMouse(MouseEvent e){
        sb.append(3);
    }
    @FXML
    void fourMouse(MouseEvent e){
        sb.append(4);
    }
    @FXML
    void fiveMouse(MouseEvent e){
        sb.append(5);
    }
    @FXML
    void sixMouse(MouseEvent e){
        sb.append(6);
    }
    @FXML
    void sevenMouse(MouseEvent e){
        sb.append(7);
    }
    @FXML
    void eightMouse(MouseEvent e){
        sb.append(8);
    }
    @FXML
    void nineMouse(MouseEvent e){
        sb.append(9);
    }
    @FXML
    void clearMouse(MouseEvent event) {
        sb.delete(0, sb.length());

    }
    @FXML
    void dMouse(MouseEvent event) {
        sb.append("/");

    }
    @FXML
    void closeMouse(MouseEvent e){
        sb.append(")");

    }
    @FXML
    void xMouse(MouseEvent e){
        sb.append("x");
    }
    @FXML
    void openMouse(MouseEvent e){
        sb.append("(");

    }
    @FXML
    void delMouse(MouseEvent e){
        sb.deleteCharAt(sb.length()-1);

    }
    @FXML
    void moMouse(MouseEvent event) {
        sb.append(".");

    }
    @FXML
    void powMouse(MouseEvent event) {
        sb.append("^");

    }
    @FXML
    void subMouse(MouseEvent event) {
        sb.append("-");

    }

    @FXML
    void sumMouse(MouseEvent event) {
        sb.append("+");

    }
    @FXML
    void zarbMouse(MouseEvent e){
        sb.append("*");
    }
    @FXML
    void zeroMouse(MouseEvent e){
        sb.append("0");
    }
    @FXML
    public void equalMouse(MouseEvent e){
        text.setText(sb.toString());
        xAxis.setLabel("X");
        yAxis.setLabel("Y");

        for (double x = -10; x <= 10; x += 0.1) {
            double y = Calculator.calculate(sb.toString());
            series.getData().add(new XYChart.Data<>(x, y));
        }
    }



    @FXML
    void lightOne(MouseEvent event) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        one.setEffect(dropShadow);
    }

    @FXML
    void lightOpen(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        parOpen.setEffect(dropShadow);
    }

    @FXML
    void lightClose(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        parClose.setEffect(dropShadow);
    }

    @FXML
    void lightDel(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        del.setEffect(dropShadow);
    }

    @FXML
    void lightClear(MouseEvent event) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        clear.setEffect(dropShadow);
    }

    @FXML
    void lightSum(MouseEvent event) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(10);
        sum.setEffect(dropShadow);
    }

    @FXML
    void lightSub(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        sub.setEffect(dropShadow);
    }

    @FXML
    void lightDivide(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        divide.setEffect(dropShadow);
    }

    @FXML
    void lightTwo(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        two.setEffect(dropShadow);
    }

    @FXML
    void lightThree(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        three.setEffect(dropShadow);
    }

    @FXML
    void lightFour(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        four.setEffect(dropShadow);
    }

    @FXML
    void lightFive(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        five.setEffect(dropShadow);
    }

    @FXML
    void lightSix(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        six.setEffect(dropShadow);
    }

    @FXML
    void lightSeven(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        seven.setEffect(dropShadow);
    }

    @FXML
    void lightEight(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        eight.setEffect(dropShadow);
    }

    @FXML
    void lightNine(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        nine.setEffect(dropShadow);
    }

    @FXML
    void lightPow(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        pow.setEffect(dropShadow);
    }

    @FXML
    void lightZarb(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        zarb.setEffect(dropShadow);
    }

    @FXML
    void lightEqual(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.RED);
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        mosavi.setEffect(dropShadow);
    }

    @FXML
    void lightZero(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        zero.setEffect(dropShadow);
    }

    @FXML
    void lightMomayez(MouseEvent e) {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setColor(Color.web("#499c91", 1));
        dropShadow.setHeight(21);
        dropShadow.setWidth(21);
        dropShadow.setRadius(15);
        momayez.setEffect(dropShadow);
    }

    @FXML
    void off0(MouseEvent e) {
        zero.setEffect(null);
    }

    @FXML
    void off1(MouseEvent e) {
        one.setEffect(null);
    }

    @FXML
    void off2(MouseEvent e) {
        two.setEffect(null);
    }

    @FXML
    void off3(MouseEvent e) {
        three.setEffect(null);
    }

    @FXML
    void off4(MouseEvent e) {
        four.setEffect(null);
    }

    @FXML
    void off5(MouseEvent e) {
        five.setEffect(null);
    }

    @FXML
    void off6(MouseEvent e) {
        six.setEffect(null);
    }

    @FXML
    void off7(MouseEvent e) {
        seven.setEffect(null);
    }

    @FXML
    void off8(MouseEvent e) {
        eight.setEffect(null);
    }

    @FXML
    void off9(MouseEvent e) {
        nine.setEffect(null);
    }

    @FXML
    void offClear(MouseEvent e) {
        clear.setEffect(null);
    }

    @FXML
    void offSum(MouseEvent e) {
        sum.setEffect(null);
    }

    @FXML
    void offSub(MouseEvent e) {
        sub.setEffect(null);
    }

    @FXML
    void offDivide(MouseEvent e) {
        divide.setEffect(null);
    }

    @FXML
    void offPow(MouseEvent e) {
        pow.setEffect(null);
    }

    @FXML
    void offZarb(MouseEvent e) {
        zarb.setEffect(null);
    }

    @FXML
    void offEquall(MouseEvent e) {
        mosavi.setEffect(null);
    }

    @FXML
    void offMomayez(MouseEvent e) {
        momayez.setEffect(null);
    }

    @FXML
    void offClose(MouseEvent e) {
        parClose.setEffect(null);
    }

    @FXML
    void offOpen(MouseEvent e) {
        parOpen.setEffect(null);
    }

    @FXML
    void offDel(MouseEvent e) {
        del.setEffect(null);
    }


}
