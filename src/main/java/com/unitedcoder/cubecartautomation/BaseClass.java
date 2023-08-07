package com.unitedcoder.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;
    public static String loginTestResult;

    public static void openBrowser(String url){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        driver= new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
    }
    public static boolean logIn(String userName,String password) {
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passwordField = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"login\"]"));
        loginButton.click();

        //Verify login
        try {
            WebElement dashBoard = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/h3"));
            if (dashBoard.getText().equalsIgnoreCase("dashboard"))
                System.out.println("Login Successful");
            return true;
        }
        catch(Exception e) {
            WebElement failMessage= driver.findElement(By.xpath("//li[contains(text(),\"Invalid username or password\")]"));
            if(failMessage.isDisplayed()){
                System.out.println("Invalid username or password");
            }
            System.out.println("Login failed.");
            return false;
        }
    }

    public  static void logOut(){
        WebElement logOutLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logOutLink.click();
    }

    public static void tearDown(){
        driver.close();
        driver.quit();
    }

    //Implicit wait
    public static void implicitWait(int second){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
    }

    //Explicit wait
    public static void explicitWait(WebElement element, int timeOut){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Fluent wait
    public static void fluentWait(WebElement element, int second){
        Wait<WebDriver> wait= new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(second))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);
    }

    //Take screenshot
    public static void takeScreenShot(String imageName){
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File screenShotFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
        String folderName="screenShots";
        File file=new File(folderName+File.separator+imageName);
        try {
            FileUtils.copyFile(screenShotFile,file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
