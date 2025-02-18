package com.testingacademy.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium_Test_DryRun {

    @Test
    public void test_VWOLogin(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();


    }


}
