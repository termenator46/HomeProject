package test;

import com.Pages.ContextMenu;
import com.Pages.HomePage;
import com.drmoqa.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestContextMenu extends TestBase {
    ContextMenu contextMenu;
    HomePage homePage;
    @BeforeEach
    public void precondition(){
        contextMenu = new ContextMenu(driver);
        homePage = new HomePage(driver).MenuContext();
    }
    @Test
    @DisplayName("Verify Right click")
    public void TestMenu(){
        contextMenu.RightClik()
                .verifyRightClick();

    }
}
