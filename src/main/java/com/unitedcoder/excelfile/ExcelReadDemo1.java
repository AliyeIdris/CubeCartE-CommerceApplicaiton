package com.unitedcoder.excelfile;

import com.unitedcoder.configutility.ApplicationConfig;
import com.unitedcoder.cubecartautomation.BaseClass;
import com.unitedcoder.cubecartautomation.LoginUser;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ExcelReadDemo1 extends BaseClass {
    public static void main(String[] args) {
        String fileName="TestDataFolders/testData.xlsx";
        String sheetName="LoginInfo";

        ExcelUtility excelUtility= new ExcelUtility();
        String userName=excelUtility.readFromExcel(fileName,sheetName,1,0);
        System.out.println(userName);
        String password=excelUtility.readFromExcel(fileName,sheetName,1,1);
        System.out.println(password);

        openBrowser(ApplicationConfig.readFromConfig("config.properties","url"));
        logIn(userName,password);
        try {
            FileUtils.writeStringToFile(new File("CubeCartAppTest"+File.separator+"logintest.txt"),loginTestResult);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logOut();
        tearDown();
    }
}
