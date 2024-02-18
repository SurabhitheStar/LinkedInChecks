package com.surabhi.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.surabhi.Base.BasePage;
import org.surabhi.Base.DriverContext;

import java.util.List;

public class JobApplicationSettingsPage extends BasePage {

    Actions action = new Actions(DriverContext.Driver);
    @FindBy(how= How.XPATH, using="//span[text()='Application settings']/parent::a")
    public WebElement Job_ApplicationSettings;

    @FindBy(how=How.XPATH, using="//input[@id=\"resume-upload-button\"]")
    public WebElement Upload_Resume;

    @FindBy(how=How.XPATH, using="//div[@class=\"jobs-resume-card__options-button-container\"][1]")
    public WebElement CheckExisting_Resume;

    @FindBy(how=How.XPATH, using="//div[@class=\"jobs-resume-card__options-button-container\"]/div/button[@type=\"button\"]")
    public List<WebElement> Existing_Resumes;

    @FindBy(how=How.XPATH, using="//*[text()='Delete']")
    public WebElement Resume_Delete;



////label[text()='Upload resume']
    public void click_JobApplicationSetting() throws InterruptedException {
        Thread.sleep(3000);
        Job_ApplicationSettings.click();
        log.info("Application Settings Page Navigation Successful");
    }

    public void click_UploadResume() throws InterruptedException {
        Thread.sleep(3000);
        Upload_Resume.click();
        log.info("Clicking on Upload Resume Successful");
    }

    public void uploadResumeFile(String file) throws InterruptedException {
        Thread.sleep(3000);
        Upload_Resume.sendKeys(System.getProperty("user.dir")+"\\src\\org\\Utilities\\"+file);
        log.info("Resume upload Successful");
    }

    public boolean Resumeuploaded() throws InterruptedException {
        Thread.sleep(3000);
        return CheckExisting_Resume.isDisplayed();
    }

    public void deleteAllResume() throws InterruptedException {
        Thread.sleep(3000);
        for(WebElement w:Existing_Resumes)
        {
            action.click(w).perform();
            Thread.sleep(8000);
            action.click(Resume_Delete).perform();
            Thread.sleep(8000);
        }
    }

}
