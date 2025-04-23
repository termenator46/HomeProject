package test;

import com.Pages.HomePage;
import com.Pages.SidePanel;
import com.drmoqa.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import windows.AlertPage;

public class Windows extends TestBase {
    @BeforeEach
    public void precondition() {
        new HomePage(driver).selectAlertsFrameWindows();
    }

    @Test
    public void alertWaitTest() {
        new SidePanel(driver).selectAlerts();
       new AlertPage(driver).verifyAlertWithTimer();
    }
}

