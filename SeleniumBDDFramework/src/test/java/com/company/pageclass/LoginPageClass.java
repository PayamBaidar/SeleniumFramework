package com.company.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.company.utils.CommonFunction;

public class LoginPageClass {
	
	CommonFunction com = new CommonFunction();

	
	protected WebDriver driver;
	
	public LoginPageClass() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	public WebElement username_txtbox;
	
	
	@FindBy(id = "Password")
	public WebElement password_txtbox;
	
	
	@FindBy(className = "button-1 login-button")
	public WebElement login_button;
	
	
	@FindBy(className = "logo-lg")
	public WebElement DashborLogo;
	
	
	
	public void loginInsystem()
	{
		com.enterData(username_txtbox, "admin@yourstore.com");
		com.enterData(password_txtbox, "admin");
		com.click(login_button);
		
	}
	
	
	public void validatDashborPage()
	{
		boolean  flag=com.IselementPresent(DashborLogo);
		if(flag) {
			
			System.out.println("dashbordPage");
		} else {
			System.out.println("Loged in user is not valid");
		}
			
		
	}
	
	
	
	
	
	

}
