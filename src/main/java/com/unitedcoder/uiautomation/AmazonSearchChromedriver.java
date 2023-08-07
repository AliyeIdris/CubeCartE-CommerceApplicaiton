package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonSearchChromedriver {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5)); //explicit wait
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys("AirPod");
        driver.findElement(By.id("nav-search-submit-button")).click();
        WebElement result=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        System.out.println("Search result is " +result.isDisplayed());
        driver.quit();
    }
}
