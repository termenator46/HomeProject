package windows;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "timerAlertButton")
    WebElement timerAlertButton;


    public AlertPage verifyAlertWithTimer(){
        click(timerAlertButton);
        Assertions.assertTrue(isAlertPresent(5));
        return this;
    }

}


