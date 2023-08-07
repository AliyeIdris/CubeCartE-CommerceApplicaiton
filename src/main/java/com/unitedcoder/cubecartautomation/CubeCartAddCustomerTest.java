package com.unitedcoder.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartAddCustomerTest {
    public static void main(String[] args) {
        LoginUser loginUser =new LoginUser("testautomation1","automation123!");

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver =new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php");
        WebElement userNameField=driver.findElement(By.cssSelector("#username"));
        userNameField.sendKeys(loginUser.getUserName());
        WebElement passwordField=driver.findElement(By.xpath("//input[@id=\"password\"]"));
        passwordField.sendKeys(loginUser.getPassword());
        WebElement loginButton= driver.findElement(By.xpath("//input[@id=\"login\"]"));
        loginButton.click();
        CustomerInfo customerInfo=new CustomerInfo(
                "Test"+System.currentTimeMillis(),
                "United"+System.currentTimeMillis(),
                "Coder"+System.currentTimeMillis(),
                (int)System.currentTimeMillis(),
                "email"+System.currentTimeMillis()+"@gmail.com"
        );
        WebElement customerListLink = driver.findElement(By.xpath("//a[contains(text(),'Customer List')]"));
        customerListLink.click();
        WebElement addCustomerLink = driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]"));
        addCustomerLink.click();
        WebElement titleField = driver.findElement(By.xpath("//*[@id=\"cust-title\"]"));
        titleField.sendKeys(customerInfo.getTitle());
        WebElement firstNameField = driver.findElement(By.xpath("//*[@id=\"cust-firstname\"]"));
        firstNameField.sendKeys(customerInfo.getFirstName());
        WebElement lastNameField = driver.findElement(By.xpath("//*[@id=\"cust-lastname\"]"));
        lastNameField.sendKeys(customerInfo.getLastName());
        WebElement phoneNrField = driver.findElement(By.xpath("//*[@id=\"cust-phone\"]"));
        String abc =String.valueOf(customerInfo.getPhoneNumber());
        phoneNrField.sendKeys(abc);
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"cust-email\"]"));
        emailField.sendKeys(customerInfo.getEmail());
        WebElement saveButton = driver.findElement(By.xpath("//input[@name=\"save\"]"));
        saveButton.click();

        //Verify Add Customer
        WebElement successMessage=driver.findElement(By.xpath
                ("//*[contains(text(),'Customer successfully added.')]"));
        if(successMessage.isDisplayed()){
            System.out.println("Customer added successfully!");
        }else{
            System.out.println("Add customer Failed!!!");
        }
        WebElement logOutLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logOutLink.click();

        driver.close();
        driver.quit();

    }
}
