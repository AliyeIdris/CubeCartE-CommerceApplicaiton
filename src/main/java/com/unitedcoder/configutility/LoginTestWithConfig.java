package com.unitedcoder.configutility;

import com.unitedcoder.cubecartautomation.BaseClass;
import com.unitedcoder.cubecartautomation.LoginUser;

public class LoginTestWithConfig extends BaseClass {
    public static void main(String[] args) {
        String fileName="config.properties";
        String userName=ApplicationConfig.readFromConfig(fileName,"username");
        String password=ApplicationConfig.readFromConfig(fileName,"password");
        String url=ApplicationConfig.readFromConfig(fileName,"url");
        openBrowser(url);
        logIn(userName,password);
        logOut();
        tearDown();
    }
}
