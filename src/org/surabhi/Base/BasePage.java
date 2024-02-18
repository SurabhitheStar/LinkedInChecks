package org.surabhi.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {

    public static Logger log;
    public BasePage()  {
        PageFactory.initElements(DriverContext.Driver, this);
        log = LogManager.getLogger(this.getClass());
        }


    }

