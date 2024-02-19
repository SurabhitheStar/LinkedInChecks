package com.org.surabhi.Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Browser {

    private Browser(String browserName)
    {
        if(browserName.equalsIgnoreCase("chrome"))
        {
            DriverContext.Driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("firefox"))
        {
            DriverContext.Driver = new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("edge"))
        {
            DriverContext.Driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Select valid Browser");
        }
        DriverContext.Driver.manage().window().maximize();
    }
    public static void setupBrowser() throws IOException {
        ConfigReader.readconfig();
        Browser b = new Browser(Settings.BrowserType);
    }
    public static void goToUrl() throws IOException {
        ConfigReader.readconfig();
        DriverContext.Driver.navigate().to(Settings.url);
    }
}
