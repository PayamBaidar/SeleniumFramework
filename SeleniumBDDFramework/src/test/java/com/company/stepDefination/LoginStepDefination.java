package com.company.stepDefination;

import com.company.factory.WebDriverManager;
import com.company.pageclass.LoginPageClass;
import com.company.utils.CommonFunction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {

	CommonFunction com =new CommonFunction();
	
	LoginPageClass loginPage=new LoginPageClass();
	public LoginStepDefination() {
		WebDriverManager manager=new WebDriverManager();
		manager.initalizeDriver();
	}

		@Given("^the user is on URL\"([^\"]*)\"$")
		public void the_user_is_on_URL(String URL) throws Throwable {
			com.navigateUrl(URL);
			
		}

		
		
		@Given("^the user is on Admin area demo Page$")
		public void the_user_is_on_Admin_area_demo_Page() throws Throwable {
		}

		
		@When("^the user enter valued value in username\"([^\"]*)\"$")
		public void the_user_enter_valued_value_in_username(String arg1) throws Throwable {
			loginPage.loginInsystem();
		}

		
		
		@When("^the user enter valid value in password \"([^\"]*)\"$")
		public void the_user_enter_valid_value_in_password(String arg1) throws Throwable {
		}

		
		
		@When("^the user clicks on enter key$")
		public void the_user_clicks_on_enter_key() throws Throwable {
		}
		
		

		@Then("^the user succefully login on dashbordPage$")
		public void the_user_succefully_login_on_dashbordPage() throws Throwable {
			
			loginPage.validatDashborPage();
		}

	
	
	
	
	
	
	
}
