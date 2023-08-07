package com.unitedcoder.jsonfile.deserilization;

import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteUsersJsonFile {
    public static void main(String[] args) {

        List<LoginUser> loginUsers = new ArrayList<>();
        loginUsers.add(new LoginUser("testautomation1","automation123!"));
        loginUsers.add(new LoginUser("testautomation2","automation123!"));
        Users users=new Users(loginUsers);

        JsonMapper mapper= new JsonMapper();
        try {
            mapper.writeValue(new File("JsonFile/Users.json"),users);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
