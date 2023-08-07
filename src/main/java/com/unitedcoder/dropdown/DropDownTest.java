package com.unitedcoder.dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        WebElement styleSelectMenu=driver.findElement(By.id("oldSelectMenu"));
        Select select= new Select(styleSelectMenu);
        select.selectByVisibleText("Blue");
        select.selectByValue("6");

        List<WebElement> options=select.getOptions();
        // for loop
        for (int i= 0; i<options.size(); i++){
            String optionValue=options.get(i).getText();
            if(optionValue.equalsIgnoreCase("black")){
                options.get(i).click();
            }
        }

        //for each loop
        for(WebElement element:options){
            String optionValue=element.getText();
            if(optionValue.equalsIgnoreCase("purple")){
                element.click();
            }
        }

        driver.close();
        driver.quit();

    }

}
