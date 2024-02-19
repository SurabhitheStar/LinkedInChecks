package com.surabhi.test.SeleniumTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class google {

    static Logger log = LogManager.getLogger(google.class);
    WebDriver driver;
    @Test
    public void test()
    {
        driver = new ChromeDriver();
        driver.get("https://google.com");
        Actions action = new Actions(driver);
        action.sendKeys("test").sendKeys(Keys.ENTER).build().perform();
        log.fatal("Fatal msg");
        log.error("error msg");
        log.info("info msg");

    }

}
