package com.unitedcoder.configutility;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UIUtility {
    private WebDriver driver;
    private int timeOut=Integer.parseInt(ApplicationConfig.readFromConfig("config.properties","timeout"));

    public UIUtility(WebDriver driver, int timeOut) {
        this.driver = driver;
        this.timeOut = timeOut;
    }

    public void waitForElementPresent(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public String  getCurrentDateTime(){
        DateTime dateTime=new DateTime();
        DateTimeFormatter formatter=DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss:SSS");
        return dateTime.toString(formatter);
    }
}
