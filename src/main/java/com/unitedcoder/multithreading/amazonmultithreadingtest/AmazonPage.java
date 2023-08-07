package com.unitedcoder.multithreading.amazonmultithreadingtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonPage extends BasePage {

    public void amazonSearchTest(String item){
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(item);
        driver.findElement(By.id("nav-search-submit-button")).click();
        WebElement result=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        if(result.isDisplayed()){
            System.out.println("Search "+item+ " test is passed");
        } else{
            System.out.println("Search test is Failed!!!");
        }
    }
}
