package com.Pages;

import com.demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import windows.AlertPage;

public class SidePanel extends BasePage {

    public SidePanel(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[.='Alerts']")
    WebDriver alerts;



      public AlertPage selectAlerts(){
          return new AlertPage(driver);

      }


}
