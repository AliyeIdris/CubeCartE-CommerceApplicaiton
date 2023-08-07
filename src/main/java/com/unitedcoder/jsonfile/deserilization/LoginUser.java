package com.unitedcoder.jsonfile.deserilization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginUser {
    @JsonProperty("user-name")
    private String userName;
    @JsonProperty("password")
    private String password;

    public LoginUser() {
    }

    public LoginUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
