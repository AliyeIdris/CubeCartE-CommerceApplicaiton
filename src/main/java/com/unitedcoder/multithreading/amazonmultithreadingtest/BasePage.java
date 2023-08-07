package com.unitedcoder.multithreading.amazonmultithreadingtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class BasePage {
    public WebDriver driver;
    public WebDriver setup(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("Safari")){
            WebDriverManager.safaridriver().setup();
            SafariOptions options = new SafariOptions();
            options.setUseTechnologyPreview(false);
            driver= new SafariDriver(options);
        }else{
            WebDriverManager.edgedriver().setup();
           driver= new EdgeDriver();
        }
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        return driver;
    }
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
