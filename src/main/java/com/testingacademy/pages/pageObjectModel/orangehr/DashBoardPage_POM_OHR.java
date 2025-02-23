package com.testingacademy.pages.pageObjectModel.orangehr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.testingacademy.base.CommonToAllPage;

public class DashBoardPage_POM_OHR extends CommonToAllPage {

    WebDriver driver;
    public DashBoardPage_POM_OHR(WebDriver driver){
        this.driver = driver;

    }

    //PageLocator
    By userNameOnDashboard = By.xpath("//h6[normalize-space()='PIM']");

    //PageAction
    public String loggedInUserName(){

        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard);


    }




}
