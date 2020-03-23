package com.company.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//features",

        monochrome =true,

                 glue = "com.company.stepDefination", 
                 format= {"pretty", "html:target/cucumber-reprots/cucumber-pretty"})




public class PayamRunner {
	
	

}
