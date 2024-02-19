package org.surabhi.Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static Logger log;
    public BasePage()  {
        PageFactory.initElements(DriverContext.Driver, this);
        log = LogManager.getLogger(this.getClass());
        }


    }

