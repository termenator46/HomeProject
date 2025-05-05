package com.demoqa.Pages;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Hovers extends BasePage {
    public Hovers(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[25]/a")
    WebElement linkHovers;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/img[1]")
    WebElement image1;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/img[1]")
    WebElement image2;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/img[1]")
    WebElement image3;

    public Hovers Movingimage1() {
        click(linkHovers);
        Actions actions = new Actions(driver);
        actions.moveToElement(image1).perform();
        return new Hovers(driver);
    }

    public Hovers verifyname() {
        Assertions.assertTrue(isElementVisible(image1));
        return this;
    }
    public Hovers Movingimage2(){
        click(linkHovers);
        Actions actions = new Actions(driver);
        actions.moveToElement(image2).perform();
        return this;
    }
    public Hovers Movingimage3(){
        click(linkHovers);
        Actions actions = new Actions(driver);
        actions.moveToElement(image3).perform();
        return this;

}}
