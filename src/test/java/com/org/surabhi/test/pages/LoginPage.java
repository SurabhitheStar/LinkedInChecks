package com.org.surabhi.test.pages;

import com.org.surabhi.Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage extends BasePage {
    @FindBy(how = How.XPATH, using = "//input[@autocomplete=\"username\"]")
    public WebElement txt_username;

    @FindBy(how = How.XPATH, using = "//input[@autocomplete=\"current-password\"]")
    public WebElement txt_password;

    @FindBy(how = How.XPATH, using = "//button[@type=\"submit\"]")
    public WebElement click_submit;

    @FindBy(how =How.XPATH, using ="//div[@class=\"feed-identity-module artdeco-card overflow-hidden mb2\"]/div/a/div[2]")
    public WebElement user_Profile;


    public HomePage loginlinkedIn(String username, String password) throws InterruptedException {
        txt_username.sendKeys(username);
        txt_password.sendKeys(password);
        click_submit.click();
        log.info("LinkedIn Login Successful");
        Thread.sleep(10000);
        return new HomePage();
    }

    public void userisloggedIn(String user)
    {
        String loggedUser= user_Profile.getText();
        Assert.assertEquals(loggedUser,user);
        log.info("Login with user: "+user+" successful");
    }



}
