package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWebSiteTest {
    public static void main(String[] args) {
        Map<String,String> websites= new HashMap<>();
        websites.put("Google", "https://www.google.com");
        websites.put("Amazon","https://www.amazon.com");
        websites.put("YouTube","https://www.youtube.com");

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(chromeOptions);

        Set<String> keys=websites.keySet();
        for(String k:keys){
            StopWatch watch= new StopWatch();
            watch.start();
            driver.get(websites.get(k));
            if(driver.getTitle().contains(k)){
                System.out.println(k+" Opened successfully, Test passed.");
                watch.stop();
                System.out.println(k+" opened within "+watch.getTime(TimeUnit.MILLISECONDS)+" Millisecond");
            }
        }

    }
}
