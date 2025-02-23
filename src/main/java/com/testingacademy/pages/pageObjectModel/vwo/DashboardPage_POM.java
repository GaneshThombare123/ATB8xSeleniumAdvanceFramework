package com.testingacademy.pages.pageObjectModel.vwo;

import com.testingacademy.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage_POM extends CommonToAllPage {

    WebDriver driver;
    public DashboardPage_POM(WebDriver driver){
    this.driver = driver;

    }

    //PageLocator
    By userNameOnDashboard = By.cssSelector("[data-qa\"lufexuloga\"]");

    //PageAction
    public String loggedInUserName(){

        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard);

    }





}
