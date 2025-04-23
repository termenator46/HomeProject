package com.Pages;

import com.demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".card:nth-child(3)")
    WebElement alertsFrameWindows;


    public  SidePanel selectAlertsFrameWindows(){
        return  new SidePanel(driver);
    }
}
