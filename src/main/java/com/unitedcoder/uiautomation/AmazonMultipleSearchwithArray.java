package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.joda.time.DateTime;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AmazonMultipleSearchwithArray {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        DateTime browserOpenTime=new DateTime();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        String[] searchText={"Ipad","Iphone","Selenium"};

        for(String s: searchText) {
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(s, Keys.ENTER);
            driver.findElement(By.id("twotabsearchtextbox")).clear();
        }
        WebElement result=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        System.out.println("Search result is " +result.isDisplayed());
        driver.quit();
    }
}
