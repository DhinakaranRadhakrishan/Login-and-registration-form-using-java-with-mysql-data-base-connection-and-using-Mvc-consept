package com.pro.controller;

import com.pro.database.DataBaseConnection;
import com.pro.model.RegisterModel;
import java.sql.SQLException;

public class RegisterFormContoller {
    
    private RegisterModel registerModel;
    private DataBaseConnection datbaseConnection;
    private String storeUserDetails;

    public RegisterFormContoller() {
        this.datbaseConnection = DataBaseConnection.getConnection();
        this.datbaseConnection.createRegisterConnection();
        this.registerModel = new RegisterModel();
    }
    
    public void insertUserDetails(String userName,String UserGmail,String UserPasword){
        this.storeUserDetails = "insert into RegisterUser("+this.registerModel.getUserName()+","+this.registerModel.getGmail()+","+this.registerModel.getPassword()+") values (?,?,?)";
       
        try {
            this.datbaseConnection.setPrepare(datbaseConnection.gettingConnection().prepareStatement(storeUserDetails));
            this.datbaseConnection.getPrepare().setString(1, userName);
            this.datbaseConnection.getPrepare().setString(2, UserGmail);
            this.datbaseConnection.getPrepare().setString(3, UserPasword);
            this.datbaseConnection.getPrepare().executeUpdate();
        } catch (SQLException ex) {
            System.out.println("user value input error");
        }
    }
    
}
