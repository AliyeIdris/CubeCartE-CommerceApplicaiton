package com.unitedcoder.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartAutomationWithArray {
    public static void main(String[] args) throws InterruptedException {
        //username password
        // final String USER_NAME=""; // Asla değişmeyecek sabit değerleri bu şekilde tanımlarız.
        String[] loginInformation={"testautomation1","automation123"};

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.setHeadless(false);
        WebDriver driver= new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php?");
        WebElement userNameField=driver.findElement(By.id("username"));
        WebElement passWordField=driver.findElement(By.id("password"));
        WebElement loginButton= driver.findElement(By.id("login"));
        userNameField.sendKeys(loginInformation[0]);
        passWordField.sendKeys(loginInformation[1]);
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