package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch2 {
    public static void main(String[] args) {

        //define driver -- chromedriver (use github external library)na
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("APjFqb")).sendKeys("Java Selenium"+ Keys.ENTER);
        WebElement searchResult= driver.findElement(By.id("result-stats"));
        if (searchResult.isDisplayed())
            System.out.println("Test pass");

        driver.close();
        driver.quit();

    }
}
