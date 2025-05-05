package com.demoqa.Pages;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HorizontalSlider extends BasePage {
    public HorizontalSlider(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type='range']")
    WebElement moverange; // Ползунок

    @FindBy(id = "range")
    WebElement moveElementtomax; // Текущее значение справа от ползунка


    public HorizontalSlider moveElement(int x, int y) {
        pause(1000);
        new Actions(driver).dragAndDropBy(moverange, x, y).perform();
        return this;
    }


    public HorizontalSlider verifyElement(String number) {
        Assertions.assertTrue(isContainsText(number ,moveElementtomax));
        return this;
    }
}

