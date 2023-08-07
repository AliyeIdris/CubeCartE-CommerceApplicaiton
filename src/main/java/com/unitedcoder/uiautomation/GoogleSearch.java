package com.unitedcoder.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {

        //Define Driver --chromedriver
        //System.setProperty("webdriver.chrome.driver","/Users/user/MyApplications/chromedriver_mac_arm64/chromedriver");
        System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");  // MacOS

        //Define chromedriver object
        WebDriver chromeDriver=new ChromeDriver();

        //Open Google home page
        chromeDriver.get("https://www.google.com/");

        //Set browser size
        chromeDriver.manage().window().maximize();

        //search a topic on Google
        WebElement searchBox=chromeDriver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("Iphone 14 pro" + Keys.ENTER);
        chromeDriver.close();
        chromeDriver.quit();



    }
}
