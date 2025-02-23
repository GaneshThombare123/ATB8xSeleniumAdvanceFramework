package com.testingacademy.Test.OrangeHR;

import com.testingacademy.base.CommonToAllTest;
import com.testingacademy.driver.DriverManager;
import com.testingacademy.pages.pageObjectModel.orangehr.LoginPage_POM_OHR;
import com.testingacademy.utils.PropertyReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

public class TestOrangeHR_POM extends CommonToAllTest {

    @Owner("PRAMOD")
    @Description("Verify that the login to the OrangeHR")
    @Test

public void testLoginPositive(){
        LoginPage_POM_OHR loginPagePomOhr = new LoginPage_POM_OHR(DriverManager.getDriver());
        loginPagePomOhr.loginToHRCreds(PropertyReader.readkey("ohr_username"),PropertyReader.readkey("ohr_password"));


    }

}
