package com.drmoqa.test;

import com.demoqa.Pages.HomePage;
import com.demoqa.Pages.RedirectLink;
import com.drmoqa.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestLinkRedit extends TestBase {
    RedirectLink redirectLink;
    HomePage homePage;
    @BeforeEach
    public void precondition(){
        redirectLink =new RedirectLink(driver);
        homePage = new HomePage(driver);

    }
    @Test
    @DisplayName("verfi all ELemets")
    public void VerfiStatusCodes(){
        homePage.ClickRedirectLink();
        redirectLink.triggerredirect();
        redirectLink.verifyElements();
    }
}
