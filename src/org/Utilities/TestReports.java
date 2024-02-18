package org.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Date;

public class TestReports {

    public ExtentSparkReporter htmlreport;
    public ExtentReports extent;
    public ExtentTest test;

    Date d = new Date();
    @BeforeTest
    public void generateReport()
    {
        htmlreport = new ExtentSparkReporter("./ExtentReport/Report");
        htmlreport.config().setEncoding("utf-8");
        htmlreport.config().setDocumentTitle("LinkedIn Page");
        htmlreport.config().setReportName("Execution Report");
        htmlreport.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter();
        extent.setSystemInfo("Automation Tester","Surabhi");
        extent.setSystemInfo("Current Time", String.valueOf(d));

    }

    @AfterTest
    public void closereport()
    {
        extent.flush();
    }
}
