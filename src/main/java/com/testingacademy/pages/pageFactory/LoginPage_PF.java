package com.testingacademy.pages.pageFactory;

import com.testingacademy.base.CommonToAllPage;
import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF extends CommonToAllPage {
    // Parameterized Constructor

    WebDriver driver;
    public LoginPage_PF(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //Page Locators

    @FindBy(id = "login-username")
    private WebElement username;

    @FindBy(id = "login-password")
    private WebElement password;

    @FindBy(id = "js-login-btn")
    private WebElement signButton;

    @FindBy(css = "#js-notification-box-msg")
    private WebElement error_message;

    //Page Actions

    public String loginToVWOInvalidCreds(){

        enterInput(username, PropertyReader.readkey("invalid_username"));
        enterInput(password, PropertyReader.readkey("invalid_password"));
        clickElement((By) signButton);
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return error_message.getText();

    }








}
