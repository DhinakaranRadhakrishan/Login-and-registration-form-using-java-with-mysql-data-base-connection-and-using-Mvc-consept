package com.pro.controller;

import com.pro.database.DataBaseConnection;
import com.pro.model.LoginModel;
import java.sql.SQLException;

public class LoginController {

    private DataBaseConnection databaseConnection;
    private LoginModel loginModel;
    private String getQuery;
    private String password;

    public LoginController() {
        databaseConnection = DataBaseConnection.getConnection();
        databaseConnection.createLoginConnection();
        loginModel = new LoginModel();
        password = " ";
    }

    public boolean checkUserProfile(String userName, String userPassword) {
        getQuery = "select "+loginModel.getUserPassword()+" from RegisterUser where "+loginModel.getUserGmail()+" = \""+userName+"\"";
        try {
            this.databaseConnection.setStatement(this.databaseConnection.gettingConnection().createStatement());
            this.databaseConnection.setResult(this.databaseConnection.getStatement().executeQuery(getQuery));
            while (databaseConnection.getResult().next()) {
                password = databaseConnection.getResult().getString(1);
            }
            if (password.equals(userPassword)) {
                return true;
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return false;
    }

}
