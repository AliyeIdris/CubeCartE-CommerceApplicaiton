package com.unitedcoder.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchForLoop {
    public static void main(String[] args) throws InterruptedException {

        //Define Driver --chromedriver
        //System.setProperty("webdriver.chrome.driver","/Users/user/MyApplications/chromedriver_mac_arm64/chromedriver");
        System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");  // MacOS

        //Define chromedriver object
        WebDriver driver=new ChromeDriver();

        //Open Google home page
        driver.get("https://www.google.com/");

        //Set browser size
        driver.manage().window().maximize();
        Thread.sleep(5000);
        // for each loop
        for (String searchValue:args){
            driver.findElement(By.id("APjFqb")).sendKeys(searchValue,Keys.ENTER);
            driver.findElement(By.id("APjFqb")).clear();
        }

        driver.close();
        driver.quit();



    }
}
