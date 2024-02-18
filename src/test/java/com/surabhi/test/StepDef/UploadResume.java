package com.surabhi.test.StepDef;

import com.surabhi.test.pages.JobApplicationSettingsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.surabhi.Base.DriverContext;
import org.testng.Assert;

public class UploadResume {
    @And("I Select Application settings")
    public void iSelectApplicationSettings() throws InterruptedException {
        JobApplicationSettingsPage sp = new JobApplicationSettingsPage();
        sp.click_JobApplicationSetting();
    }


    @Then("I click on Upload resume")
    public void iClickOnUploadResume() throws InterruptedException {
        JobApplicationSettingsPage sp = new JobApplicationSettingsPage();
        sp.click_UploadResume();
    }

    @And("I upload {string} file")
    public void iUploadFile(String arg0) throws InterruptedException {
        JobApplicationSettingsPage sp = new JobApplicationSettingsPage();
        sp.uploadResumeFile(arg0);

    }

    @Then("I Verify if Resume is uploaded")
    public void iVerifyIfResumeIsUploaded() throws InterruptedException {

        JobApplicationSettingsPage sp = new JobApplicationSettingsPage();
        Assert.assertTrue(sp.Resumeuploaded(),"Resume is uploaded");

    }

    @Then("I Delete all existing Resume")
    public void iDeleteAllExistingResume() throws InterruptedException {

        JobApplicationSettingsPage sp = new JobApplicationSettingsPage();
        sp.deleteAllResume();
    }
}
