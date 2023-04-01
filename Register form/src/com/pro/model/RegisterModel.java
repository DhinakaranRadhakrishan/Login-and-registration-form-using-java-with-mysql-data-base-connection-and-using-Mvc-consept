package com.pro.model;

public class RegisterModel {
    
    private String userName = "user_name";
    private String gmail="user_gmail";
    private String password="user_password";

    public RegisterModel() {}

    public RegisterModel(String userName, String gmail, String password, String repassword) {
        this.userName = userName;
        this.gmail = gmail;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
