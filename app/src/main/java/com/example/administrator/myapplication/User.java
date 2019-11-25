package com.example.administrator.myapplication;

/**
 * Created by Administrator on 2019/11/20.
 */

public class User {
    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean isRememberMe() {
        return IsRememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        IsRememberMe = rememberMe;
    }

    private String Account;
    private String Password;
    private boolean IsRememberMe;


}
