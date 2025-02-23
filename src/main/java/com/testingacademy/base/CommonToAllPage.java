package com.testingacademy.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.testingacademy.driver.DriverManager.getDriver;

public class CommonToAllPage {

    public CommonToAllPage() {

    }

    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }

    public void enterInput(By by, String key) {
        getDriver().findElement(by).sendKeys(key);
    }
    public void enterInput(WebElement by, String key) {
      by.sendKeys(key);
    }

    public void getText(By by) {
        getDriver().findElement(by).getText();


    }

    protected String getElement(By userNameOnDashboard) {

        By By = null;
        return getElement(By);
    }

   public WebElement presenceOfElement(By elementLocation) {
       Object ExpectedConditions = new Object();
 //      return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visiblityOfElementLocated(elementLocation));
//
//    }
//  public WebElement presenceOfElement(By elementLocation){

//      Object ExpectedConditions = new Object();
//      return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visiblityOfElementLocated(elementLocation));
//   }


       return null;
   }

}
