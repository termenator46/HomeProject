package com.demoqa.Pages;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploader extends BasePage {
    public FileUploader(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "file-submit")
    WebElement  sumbitFile;
    public  FileUploader SumbmitUpload(){
        click(sumbitFile);
        return this;
    }
    @FindBy(id = "file-upload")
    WebElement  fileupload;

    public FileUploader ChooseFileVerfi(String path){
        fileupload.sendKeys(path);
        return this;
    }
    @FindBy(xpath = "//*[@id=\"content\"]/div/h3")
    WebElement  Uploaded;
    public FileUploader verfiUploaded(String text){
     Assertions.assertTrue(isContainsText(text,Uploaded));
     return this;
    }


}
