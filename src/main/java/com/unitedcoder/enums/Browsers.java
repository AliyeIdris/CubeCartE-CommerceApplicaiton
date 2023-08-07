package com.unitedcoder.enums;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browsers {
    public enum BrowserType {
        GOOGLE, FIREFOX, IE, SAFARI, OPERA
    }

   public void selectBrowser(BrowserType browser){
       WebDriverManager.chromedriver().setup();
       ChromeOptions options = new ChromeOptions();
       options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
       ChromeDriver driver =new ChromeDriver(options);
       driver.manage().window().maximize();
        switch (browser){
            case GOOGLE:
                driver.get("https://www.google.com");
                break;
            case FIREFOX:
                driver.get("https://www.firefox.com");
            case IE:
                driver.get("https://enternetexplorer.com");
            case SAFARI:
                driver.get("https://safari.com");
            case OPERA:
                driver.get("https://www.opera.com");
            default:
                driver.get("https://www.google.com");
        }
   }

    public static void main(String[] args) {
        Browsers browsers= new Browsers();
        browsers.selectBrowser(BrowserType.GOOGLE);
    }
}

