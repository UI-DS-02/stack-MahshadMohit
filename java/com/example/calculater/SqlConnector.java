package com.example.calculater;
import java.sql.*;
public class SqlConnector {
    private final String URL = "jdbc:mysql://localhost/players";
    private final String username = "Asoo";
    private final String password = "password1212";
    public SqlConnector(){}
    void ExecuteSQL(String sqlCmd) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement s = con.prepareStatement(sqlCmd);
            s.execute(sqlCmd);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void showDatabase(String sqlCmd) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement s = con.prepareStatement(sqlCmd);
            ResultSet resultSet = s.executeQuery(sqlCmd);
            while(resultSet.next()){
                System.out.println(resultSet.getString("input"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
