package test;

import com.Pages.DropdownList;
import com.drmoqa.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestDroDownList extends TestBase {
    DropdownList dropdownList;

    @BeforeEach
    public void precondition() {
        dropdownList = new DropdownList(driver);
    }

    @Test
    @DisplayName("Verify the option select")
    public void MenuList() {
        dropdownList.ListDrob();
        dropdownList.verifyOptionsMenu();
    }
}
