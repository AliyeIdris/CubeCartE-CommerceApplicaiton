package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AmazonSearchSafaridriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.safaridriver().setup();
        WebDriver safariDriver=new SafariDriver();
        safariDriver.get("https://www.amazon.com/");
        safariDriver.manage().window().maximize();
        safariDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("AirPod");
        safariDriver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(5000);
        WebElement result=safariDriver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        System.out.println("Search result is " +result.isDisplayed());
        safariDriver.close();

    }
}
