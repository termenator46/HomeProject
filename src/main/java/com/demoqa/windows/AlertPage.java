package com.demoqa.windows;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/button[1]")
    WebElement alertsWindows;


    public AlertPage selectResult(String result) {
        click(alertsWindows);
        if (result != null && result.equals("ok")) {
            driver.switchTo().alert().accept();
        } else if (result != null && result.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/p[2]")
    WebElement result;

    public AlertPage verifyMessage(String text) {
        Assertions.assertTrue(isContainsText(text, result));
        return this;
    }


     @FindBy(id = "result")
     WebElement result1;
    public AlertPage verifyResult(String text) {
        Assertions.assertTrue(isContainsText(text, result));
        return this;
    }



    @FindBy(xpath = "//button[contains(text(),'Click for JS Prompt')]")
    WebElement messagebutten;

    public AlertPage sendMessageToAlert(String message) {
        click(messagebutten);
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

}


