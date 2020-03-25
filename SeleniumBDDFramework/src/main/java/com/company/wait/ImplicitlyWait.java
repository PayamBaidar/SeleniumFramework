package com.company.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.company.factory.WebDriverManager;

public class ImplicitlyWait {

	
	
	public ImplicitlyWait() {
		
		WebDriverManager.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
}
