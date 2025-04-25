package test;

import com.Pages.Hovers;
import com.drmoqa.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HoversTestmunu extends TestBase {
    Hovers hovers;
    @BeforeEach
    public void precondition(){
        hovers = new Hovers(driver);
    }
    @Test
    @DisplayName("Verifi the user heve name")
    public void Testmovingimage(){
        hovers.Movingimage();
        hovers.verifyname();
    }



}
