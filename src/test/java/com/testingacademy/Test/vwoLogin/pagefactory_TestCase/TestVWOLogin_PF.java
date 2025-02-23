package com.testingacademy.Test.vwoLogin.pagefactory_TestCase;

import com.testingacademy.base.CommonToAllPage;
import com.testingacademy.driver.DriverManager;
import com.testingacademy.listeners.RetryAnalyser;
import com.testingacademy.pages.pageFactory.LoginPage_PF;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.testingacademy.utils.PropertyReader;

//import java.util.logging.LogManager;
//import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Test(retryAnalyzer = RetryAnalyser.class)
public class TestVWOLogin_PF extends CommonToAllPage {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF.class);


    @Test
    public void testLoginNegativeVWO_PF(){

        logger.info("Starting the TestCases Page Factory");


        WebDriver driver = DriverManager.getDriver();
        driver.get(PropertyReader.readkey("url"));
        LoginPage_PF loginPage_PF = new LoginPage_PF(driver);
        String error_msg = loginPage_PF.loginToVWOInvalidCreds();
        logger.info("End of the TestCases!!");

        Assert.assertEquals(error_msg,PropertyReader.readkey("error_message"));


    }



}
