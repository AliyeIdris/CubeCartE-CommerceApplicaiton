package com.unitedcoder.jsonfile.deserilization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcoder.cubecartautomation.BaseClass;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class RoleBasedSecurityTest extends BaseClass {
    public static void main(String[] args) {
        ObjectMapper mapper=new ObjectMapper();
        Users users=null;
        try {
            users=mapper.readValue(new File("JsonFile/LoginUsers.json"),Users.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<LoginUser> loginUsers=users.getLoginUsers();
        openBrowser("http://cubecartuat.unitedcoder.com/admin_tu8sml.php?");
        for(LoginUser eachUser:loginUsers){
            logIn(eachUser.getUserName(),eachUser.getPassword());
            logOut();
        }
        driver.close();
        driver.quit();

    }
}
