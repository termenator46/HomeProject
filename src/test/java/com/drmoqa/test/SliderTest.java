package com.drmoqa.test;

import com.demoqa.Pages.HomePage;
import com.demoqa.Pages.HorizontalSlider;
import com.drmoqa.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SliderTest extends TestBase {
    HorizontalSlider slider;
    HomePage homePage;
    @BeforeEach
    public void precondition(){
        slider = new HorizontalSlider(driver);
        homePage = new HomePage(driver);
    }
    @Test
    @DisplayName("Verfi the element move")
    public void Verifymovealament(){
        homePage.PageHorizontal();
        slider.moveElement(300,0)
                .verifyElement("5");
    }
}

