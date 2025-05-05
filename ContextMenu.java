package com.Pages;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenu extends BasePage {
    public ContextMenu(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "hot-spot") //! локатор квадрата
    WebElement center;
    public ContextMenu RightClik(){
//        click(center);
        new Actions(driver).contextClick(center);
        return this;
    }
    @FindBy(xpath = "/html/body/div[2]/div/script")
    WebElement Alertpage;
    public ContextMenu verifyRightClick() {
        Assertions.assertTrue(isElementVisible(Alertpage));
        return this;
    }
}


