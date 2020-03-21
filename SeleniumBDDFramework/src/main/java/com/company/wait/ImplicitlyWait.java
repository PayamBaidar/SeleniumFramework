package com.company.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class ImplicitlyWait {

	protected WebDriver driver;
	
	
	public ImplicitlyWait() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
}
