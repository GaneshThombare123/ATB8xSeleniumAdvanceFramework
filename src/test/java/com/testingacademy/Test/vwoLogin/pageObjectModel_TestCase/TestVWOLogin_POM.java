package com.testingacademy.Test.vwoLogin.pageObjectModel_TestCase;

import com.testingacademy.base.CommonToAllTest;
import com.testingacademy.driver.DriverManager;
import com.testingacademy.pages.pageObjectModel.vwo.DashboardPage_POM;
import com.testingacademy.pages.pageObjectModel.vwo.LoginPage_POM;
import com.testingacademy.utils.PropertyReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;


public class TestVWOLogin_POM extends CommonToAllTest {

    @Owner("Pramod")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testLoginPositiveVWO(){

//        WebDriver driver = DriverManager.getDriver();
//        driver.get("https://app.vwo.com");



        LoginPage_POM loginPagePom = new LoginPage_POM(DriverManager.getDriver());
       loginPagePom.loginToVWOLoginValidCreds(PropertyReader.readkey("username"),PropertyReader.readkey("password"));


        DashboardPage_POM dashboardPagePom= new DashboardPage_POM(DriverManager.getDriver());
        String loggedInUserName = dashboardPagePom.loggedInUserName();


        assertThat(loggedInUserName).isNotBlank().isNotEmpty().isNotNull();
        Assert.assertEquals(loggedInUserName, PropertyReader.readkey("expected_username"));



    }


}
