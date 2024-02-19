package com.org.surabhi.test.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.org.surabhi.Base.BasePage;
import com.org.surabhi.Base.DriverContext;

public class HomePage extends BasePage {
    Actions action;
    @FindBy(how= How.XPATH, using = "//span[text()='Jobs']")
    public WebElement link_job;

    @FindBy(how= How.XPATH, using = "//span[text()='Messaging'][1]")
    public WebElement message;

    @FindBy(how= How.XPATH, using = "//*[contains(@id,'jobs-search-box-location-id-ember')]")
    public WebElement jobLocation;

    @FindBy(how= How.XPATH, using = "//input[contains(@id,'jobs-search-box-keyword-id-ember')]")
    public WebElement jobsearch;


    @FindBy(how = How.XPATH, using = "//*[contains(@class,'jobs-search-box__submit-button')]")
    public WebElement searchsubmit;

    @FindBy(how = How.XPATH, using = "//ul[@class=\"jobs-search-box__typeahead-results-list\"]/li[1]")
    public WebElement getJobsearch;

    public void job_Page()
    {
        link_job.click();
    }

    public void search_job(String Role) throws InterruptedException {
        Thread.sleep(3000);
        Actions action = new Actions(DriverContext.Driver);
        jobsearch.click();
        action.sendKeys(Role).sendKeys(Keys.ENTER).build().perform();
        log.info("Job Search Page Navigation Successful");
    }

    public void search_job(String Roles, String Location) throws InterruptedException {
        Thread.sleep(3000);
        Actions action = new Actions(DriverContext.Driver);
        jobsearch.click();
        action.sendKeys(Roles).perform();
        Thread.sleep(3000);
        jobLocation.click();
        Thread.sleep(3000);
        action.sendKeys(Location).sendKeys(Keys.ENTER).build().perform();
        log.info("Job Search with "+Roles+"and"+Location+"Successful");
    }

   public void searchwithlocation(String location) throws InterruptedException {
        Thread.sleep(3000);
      jobsearch.sendKeys(" ");
      Thread.sleep(3000);
       jobLocation.click();
       Thread.sleep(3000);
       Actions action = new Actions(DriverContext.Driver);
       action.sendKeys(location).sendKeys(Keys.ENTER).build().perform();
       log.info("Job Search with "+location+"Successful");

    }

}
