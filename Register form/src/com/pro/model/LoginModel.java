package com.pro.model;

public class LoginModel {

    private String userGmail = "user_gmail";
    private String userPassword = "user_password";

    public LoginModel() {}

    public String getUserGmail() {
        return userGmail;
    }

    public void setUserGmail(String userGmail) {
        this.userGmail = userGmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}
