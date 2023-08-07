package com.unitedcoder.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartLoginTest {
    public static void main(String[] args) {
        //username password
        // final String USER_NAME=""; // Asla değişmeyecek sabit değerleri bu şekilde tanımlarız.
        String userName = "testautomation1";
        String passWord = "automation123!";

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.setHeadless(false);
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php?");
        WebElement userNameField = driver.findElement(By.id("username"));
        WebElement passWordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login"));
        userNameField.sendKeys(userName);
        passWordField.sendKeys(passWord);
        loginButton.click();

        //verify login successful
       try {
           String invalidText = driver.findElement(By.xpath("//*[@id=\"gui_message\"]/div/ul/li")).getText();
           if (invalidText.contains("Invalid")) {
               System.out.println("Login Test Failed!");
           }
       }
           catch(Exception e){
               System.out.println("Login Test Passed");

           }
        driver.close();
        driver.quit();
    }
}