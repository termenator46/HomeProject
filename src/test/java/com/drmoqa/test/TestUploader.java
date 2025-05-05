package com.drmoqa.test;

import com.demoqa.Pages.FileUploader;
import com.demoqa.Pages.HomePage;
import com.drmoqa.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestUploader extends TestBase {
    HomePage homePage;
    FileUploader uploader;
    @BeforeEach
    public void precondition(){
    homePage = new HomePage(driver);
    uploader = new FileUploader(driver);
    }
    @Test
    @DisplayName("Verfi Uplod file")
    public void testFile(){
        homePage.UploderFile();
        uploader.ChooseFileVerfi("C:/Users/Antony/Downloads/download.jpg");
        uploader.SumbmitUpload();
        uploader.verfiUploaded("File Uploaded!");





    }
}
