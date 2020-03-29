package com.company.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "src//test//resources//features",

        monochrome =true,

                 glue = "com.company.stepDefination", 
                 plugin= {"pretty","json:target/cucumber-json/cucumber.json"})




public class PayamRunner {
	

	

}
