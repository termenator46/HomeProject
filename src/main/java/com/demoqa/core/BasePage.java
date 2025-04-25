package com.demoqa.core;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
 public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public  void click(WebElement element){
        element.click();
    }


    public void type(WebElement element,String text){
        if (text != null){
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }
    public  boolean isAlertPresent(int time){
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.alertIsPresent());
        if (alert == null){
            return false;
        }
        return  true;
    }
    public boolean isContainsText(String text, WebElement element){

        return element.getText().contains(text);
    }
    public boolean isElementVisible(WebElement element){
        try {
            element.isDisplayed();
            return true;
        }catch (NoSuchElementException exception){
            exception.getMessage();
            return false;
        }
    }


}
