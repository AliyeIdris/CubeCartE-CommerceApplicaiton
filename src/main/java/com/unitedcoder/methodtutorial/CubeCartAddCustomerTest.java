package com.unitedcoder.methodtutorial;
import com.unitedcoder.cubecartautomation.CustomerInfo;
import com.unitedcoder.cubecartautomation.LoginUser;
import org.openqa.selenium.WebDriver;


public class CubeCartAddCustomerTest {
   static  WebDriver driver;
    public static void main(String[] args) {
CustomerObjectMethod method = new CustomerObjectMethod(driver);
method.driverSetup();
method.logIn(new LoginUser("testautomation1","automation123!"));
method.logOut();
method.tearDown();

    }
}
