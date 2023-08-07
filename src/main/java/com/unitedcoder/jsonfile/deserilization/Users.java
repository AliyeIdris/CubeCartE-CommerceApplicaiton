package com.unitedcoder.jsonfile.deserilization;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Users {
    @JsonProperty("Users")
    private List<LoginUser> loginUsers;

    public Users() {
    }

    public Users(List<LoginUser> loginUsers) {
        this.loginUsers = loginUsers;
    }

    public List<LoginUser> getLoginUsers() {
        return loginUsers;
    }
}
