package com.pro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {

    private Connection connection;
    public PreparedStatement prepare;
    private java.sql.Statement statement;
    private ResultSet result;
    private String user;
    private String password;
    private static DataBaseConnection databaseConnection;

    private DataBaseConnection() {
        this.user = "root";
        this.password = "Dine";
    }

    public void createLoginConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {}
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Register", user, password);
        } catch (SQLException ex) {}
    }

    public void createRegisterConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {}
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Register", user, password);
        } catch (SQLException ex) {}
    }

    public static DataBaseConnection getConnection() {
        if (databaseConnection == null) {
            databaseConnection = new DataBaseConnection();
            return databaseConnection;
        }
        return databaseConnection;
    }

    public Connection gettingConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public PreparedStatement getPrepare() {
        return prepare;
    }

    public void setPrepare(PreparedStatement prepare) {
        this.prepare = prepare;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResult() {
        return result;
    }

    public void setResult(ResultSet result) {
        this.result = result;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
