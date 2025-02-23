package com.testingacademy.pages.pageObjectModel.orangehr;

import com.testingacademy.base.CommonToAllPage;
import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM_OHR extends CommonToAllPage {
    //Parameterised Constructor

    WebDriver driver;
    public LoginPage_POM_OHR(WebDriver driver){
    this.driver = driver;

    }

    //Page Locator

    private By username = By.xpath("//input[@placeholder ='Username']");
    private By password = By.xpath("//input[@placeholder ='Password']");
    private By submit_btn = By.xpath("//button[normalize-space()='Login']");

    //Page Actions
public String loginToHRCreds(String user, String pwd){
driver.get(PropertyReader.readkey("orange_hr_url"));


    enterInput(username,user);
    enterInput(password,pwd);
    clickElement(submit_btn);

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    return user;
}


}
