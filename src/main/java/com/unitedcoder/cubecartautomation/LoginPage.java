package com.unitedcoder.cubecartautomation;

import com.unitedcoder.configutility.ApplicationConfig;
import com.unitedcoder.io.FileWriteMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public static WebDriver driver;
    String result;

    //set constructor
    public LoginPage() {
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logIn(LoginUser loginUser) {
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(loginUser.getUserName());
        WebElement passwordField = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        passwordField.sendKeys(loginUser.getPassword());
        WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"login\"]"));
        loginButton.click();
    }

    public boolean verifyLoginSuccessful() {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            WebElement logoutLink = driver.findElement(By.xpath("//*[contains(text(),'Log Out')]"));
            if (logoutLink.isDisplayed()) {
                result=stringBuilder.append("Login Test Passed").toString();
                System.out.println("login pass");
                return true;
            }
        } catch (Exception e) {
             result=stringBuilder.append("Login Test Failed").toString();
            System.out.println("login failed");
        }
        return false;
    }
}

class LoginTest extends BaseClass{
    public static void main(String[] args) {
        openBrowser(ApplicationConfig.readFromConfig("config.properties","url"));
        LoginPage loginPage= new LoginPage(driver);
        loginPage.logIn(new LoginUser("testautomation1","automation123!"));
        takeScreenShot("login.jpg");
        loginPage.verifyLoginSuccessful();
        tearDown();

        FileWriteMethod fileWriteMethod= new FileWriteMethod();
        fileWriteMethod.writeToFile("cubecartlogintestresult","logintest",".txt", loginPage.result);

    }
}
