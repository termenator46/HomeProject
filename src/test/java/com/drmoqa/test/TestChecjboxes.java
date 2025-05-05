package com.drmoqa.test;

import com.demoqa.Pages.Checkboxes;
import com.demoqa.Pages.HomePage;
import com.drmoqa.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestChecjboxes extends TestBase {
    HomePage homePage;
    Checkboxes checkboxes;
    @BeforeEach
    public void preconscious(){
        homePage = new HomePage(driver);
        checkboxes = new Checkboxes(driver);
    }
    @Test
    @DisplayName("verfi the 2 boxs chekd")
    public void Test1(){
        homePage.CheckBoxes();
        checkboxes.Selectbox(new String[]{" checkbox 1"," checkbox 2"});
        checkboxes.Verifychecked("rgba(0, 0, 0, 0)");

    }
}
