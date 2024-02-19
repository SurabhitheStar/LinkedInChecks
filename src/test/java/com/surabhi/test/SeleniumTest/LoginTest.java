package com.surabhi.test.SeleniumTest;

import com.surabhi.Base.Browser;
import com.surabhi.Base.ConfigReader;
import com.surabhi.test.pages.HomePage;
import com.surabhi.test.pages.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;


public class LoginTest {

    @Test
    public void initialize() throws IOException {
        //Browser.setupBrowser("chrome");
        ConfigReader.readconfig();
        Browser.goToUrl();
    }

    @Test
    public void login() throws InterruptedException {
        LoginPage lp = new LoginPage();
        HomePage pg = lp.loginlinkedIn("surabhijais2109@gmail.com","Ssur@8984");
        pg.job_Page();
        pg.searchwithlocation("New Zealand");


    }

}
