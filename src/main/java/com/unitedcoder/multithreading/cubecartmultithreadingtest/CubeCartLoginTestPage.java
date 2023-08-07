package com.unitedcoder.multithreading.cubecartmultithreadingtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CubeCartLoginTestPage extends CubeCartBasePage{
    public void login(String userName, String password) {
        WebElement userNameField = driver.findElement(By.id("username"));
        WebElement passWordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login"));
        userNameField.sendKeys(userName);
        passWordField.sendKeys(password);
        loginButton.click();
        try {
            WebElement dashBoard = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/h3"));
            if (dashBoard.getText().equalsIgnoreCase("dashboard"))
                System.out.println("Login Test Passed");
        }
        catch(Exception e) {
            System.out.println("Login Test Failed");
        }
        driver.close();
        driver.quit();

    }
}
