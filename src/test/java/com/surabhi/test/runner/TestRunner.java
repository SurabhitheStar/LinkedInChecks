package com.surabhi.test.runner;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/com/surabhi/test/features/LinkedInResumeUpload.feature"}, glue = {"com/surabhi/test/StepDef"})
public class TestRunner {

}
