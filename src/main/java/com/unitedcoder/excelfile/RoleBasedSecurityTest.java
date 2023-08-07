package com.unitedcoder.excelfile;

import com.unitedcoder.configutility.ApplicationConfig;
import com.unitedcoder.cubecartautomation.BaseClass;
import com.unitedcoder.cubecartautomation.LoginUser;

import java.util.List;

public class RoleBasedSecurityTest extends BaseClass {
    public static void main(String[] args) {
        openBrowser(ApplicationConfig.readFromConfig("config.properties","url"));
        String fileName="TestDataFolders/testData.xlsx";
        ExcelUtility excelUtility=new ExcelUtility();
        List<LoginUser> loginUsers=excelUtility.readMultipleUsers(fileName,"LoginInfo");
        for(LoginUser user:loginUsers){
            logIn(user.getUserName(),user.getPassword());
            logOut();
        }
        tearDown();
    }
}
