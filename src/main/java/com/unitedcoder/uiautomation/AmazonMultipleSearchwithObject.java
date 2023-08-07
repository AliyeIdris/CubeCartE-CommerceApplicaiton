package com.unitedcoder.uiautomation;

import com.unitedcoder.classconcepts.Products;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.joda.time.DateTime;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonMultipleSearchwithObject {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        Products products = new Products();
        products.setProducts(new String[]{"Iphone","Ipad","JavaBook"});

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        for(String keyWords: products.getProducts()) {
            WebElement searchBar= driver.findElement(By.id("twotabsearchtextbox"));
            wait.until(ExpectedConditions.visibilityOf(searchBar));
            searchBar.sendKeys(keyWords, Keys.ENTER);
            driver.findElement(By.id("twotabsearchtextbox")).clear();
        }
        WebElement result=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        System.out.println("Search result is " +result.isDisplayed());
        driver.quit();
    }
}
