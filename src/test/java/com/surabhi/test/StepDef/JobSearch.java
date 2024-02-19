package com.surabhi.test.StepDef;

import com.surabhi.test.pages.HomePage;
import com.surabhi.test.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.surabhi.Base.Browser;
import java.io.IOException;
import java.util.List;
import java.util.Map;


public class JobSearch {
    @Given("As a user I login to LinkedIn")
    public void asAUserILoginToLinkedIn() throws IOException, InterruptedException {
        Browser.setupBrowser();
        Browser.goToUrl();
        LoginPage lp = new LoginPage();
        HomePage pg = lp.loginlinkedIn("surabhijais2109@gmail.com","Ssur@8984");

    }
    @And("I Verify user {string} is logged in")
    public void iVerifyUserIsLoggedIn(String user) {
        LoginPage lp = new LoginPage();
        lp.userisloggedIn("Surabhi Jaiswal");
    }

    @Then("I Navigate to Jobs Section")
    public void iNavigateToJobsSection() {
       HomePage hp = new HomePage();
       hp.job_Page();
    }

    @Then("I search for jobs with Roles and Locations")
    public void i_search_for_jobs_with_roles_and_locations(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<Map<String,String>> data = dataTable.asMaps();
        String role= data.get(0).get("Roles");
        String location = data.get(0).get("Locations");
        HomePage hp = new HomePage();
        hp.search_job(role,location);
    }

}
