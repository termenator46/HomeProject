package com.Pages;
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

    @FindBy(css = "div.row:nth-child(2) div.large-12.columns:nth-child(2) ul:nth-child(4) li:nth-child(11) > a:nth-child(1)")
    WebElement Droplist;
    @FindBy(id = "dropdown")
    WebElement Selectanoption;

    public DropdownList ListDrob() {
        click(Droplist);
        Select select = new Select(Selectanoption);
        select.selectByVisibleText("Option 2");
        return new DropdownList(driver);
    }

    public DropdownList verifyOptionsMenu() {
        Assertions.assertTrue(isElementVisible(Selectanoption));
        return this;
    }
}
