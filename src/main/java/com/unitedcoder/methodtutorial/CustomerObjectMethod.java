package com.unitedcoder.methodtutorial;

import com.unitedcoder.cubecartautomation.CustomerInfo;
import com.unitedcoder.cubecartautomation.LoginUser;
import com.unitedcoder.dropdown.CustomerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CustomerObjectMethod {

    //set property
    WebDriver driver;  ///null
    //default constructor
    public CustomerObjectMethod() {
    }


    // constructor with WebDriver parameter
    public CustomerObjectMethod(WebDriver driver) {
        this.driver = driver;
    }


    // driver setup- login method- add customer method- verify method- logout method
    // driver setup method
    public void driverSetup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://cubecartuat.unitedcoder.com/admin_tu8sml.php");
        driver.manage().window().maximize();
    }

    //login method
    public void logIn(LoginUser loginUser) {
        WebElement userNameField = driver.findElement(By.cssSelector("#username"));
        userNameField.sendKeys(loginUser.getUserName());
        WebElement passwordField = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        passwordField.sendKeys(loginUser.getPassword());
        WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"login\"]"));
        loginButton.click();
    }

    //add customer method
    public void addCustomer(CustomerInfo customerInfo) {
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

        WebElement customerType= driver.findElement(By.cssSelector("#cust-type"));
        Select select= new Select(customerType);
        select.selectByVisibleText(CustomerType.UNREGISTERED_CUSTOMER.getDescription());

        WebElement phoneNrField = driver.findElement(By.xpath("//*[@id=\"cust-phone\"]"));
        String abc =String.valueOf(customerInfo.getPhoneNumber());
        phoneNrField.sendKeys(abc);


        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"cust-email\"]"));
        emailField.sendKeys(customerInfo.getEmail());
        WebElement saveButton = driver.findElement(By.xpath("//input[@name=\"save\"]"));
        saveButton.click();
    }

    //verify method
    public boolean verifyCustomerAddSuccessfully() {
        WebElement successMessage = driver.findElement(By.xpath
                ("//*[contains(text(),'Customer successfully added.')]"));
        if (successMessage.isDisplayed()) {
            System.out.println("Customer added successfully!");
            return true;
        } else {
            System.out.println("Add customer Failed!!!");
            return false;
        }

    }

    // logout method
    public void logOut(){
        WebElement logOutLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logOutLink.click();

    }

    //close and quit
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}




