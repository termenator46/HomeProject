package com.drmoqa.test;

import com.demoqa.Pages.HomePage;
import com.drmoqa.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.demoqa.windows.AlertPage;

public class Windows extends TestBase {
    AlertPage alertPage;
    @BeforeEach
    public void precondition() {
        alertPage = new AlertPage(driver);
        new HomePage(driver).selectAlertsFrameWindows();
    }

    @Test
    @DisplayName("Verify to - 'OK' is displayed")
    public void alertWithSelectTest() {
        alertPage.selectResult("ok");



    }

    @Test
    @DisplayName("Verify click butten")
    public void alertbutten() {
        alertPage.selectResult("ok").verifyResult("Ok");
    }

    @Test
    @DisplayName("Verify to - Text you entered is displayed")
    public void sendMessageToAlertTest() {
        alertPage.sendMessageToAlert("Hello world!").verifyMessage("Hello world!");
    }

}


