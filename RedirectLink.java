package com.Pages;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedirectLink extends BasePage {
    public RedirectLink(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#redirect")
    WebElement redirect;

    public RedirectLink triggerredirect() {
        click(redirect);
        return this;

    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[1]/a")
    WebElement Code200;
    @FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[2]/a")
    WebElement Code301;
    @FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[3]/a")
    WebElement Code404;
    @FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[4]/a")
    WebElement Code500;

    public RedirectLink verifyElements() {
        Assertions.assertTrue(isElementVisible(Code200));
        Assertions.assertTrue(isElementVisible(Code301));
        Assertions.assertTrue(isElementVisible(Code404));
        Assertions.assertTrue(isElementVisible(Code500));
        return this;
    }

}
