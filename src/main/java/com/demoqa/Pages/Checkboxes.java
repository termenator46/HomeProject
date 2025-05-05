package com.demoqa.Pages;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkboxes extends BasePage {
    public Checkboxes(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]")
    WebElement checkbox1;
    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]")
    WebElement checkbox2;

    public Checkboxes Selectbox(String[] boxs){
        for (int i = 0; i < boxs.length; i++) {
            if (boxs[i].equals(" checkbox 1")){
                click(checkbox1);

            }if (boxs[i].equals("checkbox 2")){
                click(checkbox2);
            }

        }
        return this;
    }
    @FindBy(css = "#checkboxes input:nth-child(1)")
    WebElement checkboxeschecked;
    public Checkboxes Verifychecked(String color){
//        System.out.println(checkboxeschecked.getCssValue("background-color"));
        Assertions.assertTrue(checkboxeschecked.getCssValue("background-color").contains(color));
        return this;

    }
}
