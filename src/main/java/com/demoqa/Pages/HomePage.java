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

    public HomePage selectAlertsFrameWindows() {
        click(alerts);
        return new HomePage(driver);
    }

    @FindBy(css = "div#content>ul>li:nth-of-type(7)>a") //! это локатор страници Context Menu
    WebElement Menu;

    public HomePage MenuContext() {
        click(Menu);
        return new HomePage(driver);
    }

    @FindBy(css = "div.row:nth-child(2) div.large-12.columns:nth-child(2) ul:nth-child(4) li:nth-child(24) > a:nth-child(1)")
    WebElement PageHorizontalSlider; // Кнопка перехода на страницу слайдера


    public HomePage PageHorizontal() {
        click(PageHorizontalSlider);
        return new HomePage(driver);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[18]/a")
    WebElement uploadFile;
    public HomePage UploderFile(){
          click(uploadFile);
        return new HomePage(driver);
    }
    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[6]/a")
    WebElement CheckboxesLink;
    public  HomePage CheckBoxes(){
        click(CheckboxesLink);
        return new HomePage(driver);
    }
    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[36]/a")
    WebElement LInkRedirect;
    public HomePage ClickRedirectLink(){
        click(LInkRedirect);
        return new HomePage(driver);
    }
}

