package com.company.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//features",

        monochrome =true,

                 glue = "com.company.stepDefination", 
                 plugin= {"pretty", "html:target/cucumber-reprots/cucumber-pretty",
                		 "json:Reports/cucumber-json/cucumber.json",})




public class PayamRunner {
	
	

}
