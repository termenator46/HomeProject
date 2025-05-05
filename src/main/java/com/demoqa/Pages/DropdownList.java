package com.demoqa.Pages;
import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class DropdownList extends BasePage {
    public DropdownList(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[11]/a")
    WebElement Droplist;
    @FindBy(id = "dropdown")
    WebElement Selectanoption;

    public DropdownList ListDrob1() {
        click(Droplist);
        Select select = new Select(Selectanoption);
        select.selectByVisibleText("Option 1");
        return new DropdownList(driver);
    }

    public DropdownList verifyOptionsMenu() {
        Assertions.assertTrue(isElementVisible(Selectanoption));
        return this;
    }
    public DropdownList ListDrob2() {
        click(Droplist);
        Select select = new Select(Selectanoption);
        select.selectByVisibleText("Option 2");
        return new DropdownList(driver);
    }
}
