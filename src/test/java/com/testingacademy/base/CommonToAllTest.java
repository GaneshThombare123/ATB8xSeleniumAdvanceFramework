package com.testingacademy.base;

import com.testingacademy.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class CommonToAllTest {

    @BeforeMethod
    public void setUP() throws IOException {
        DriverManager.init();

    }
    @AfterMethod
    public void tearDown(){
        DriverManager.down();


    }




}
