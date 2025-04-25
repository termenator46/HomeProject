package com.Pages;

import com.demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//li[29]/a")
    WebElement alerts;
    public  HomePage selectAlertsFrameWindows(){
        click(alerts);
        return  new HomePage(driver);
    }
}
