package com.testingacademy.pages.pageObjectModel.vwo;

import com.testingacademy.base.CommonToAllPage;
import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM extends CommonToAllPage {

    WebDriver driver;

    public LoginPage_POM(WebDriver driver) {
        this.driver = driver;


    }
    // Page Locators

    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");


    // Page Actions

    public String loginToVWOLoginInvalidCreds(String user, String pwd) {

        driver.get(PropertyReader.readkey("url"));
       // driver.findElement(username).sendKeys(user);
        enterInput(username,user);
       // driver.findElement(password).sendKeys(pwd);
        enterInput(password,pwd);
      //  driver.findElement(signButton).click();
        clickElement(signButton);


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

         String error_message_text = driver.findElement(error_message).getText();
         return error_message_text;


    }


    public void loginToVWOLoginValidCreds(String user, String pwd) {

        driver.get(PropertyReader.readkey("url"));
        // driver.findElement(username).sendKeys(user);
        enterInput(username,user);
        // driver.findElement(password).sendKeys(pwd);
        enterInput(password,pwd);
        //  driver.findElement(signButton).click();
        clickElement(signButton);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}

