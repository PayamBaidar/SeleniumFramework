package com.company.wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictlyWait {
	protected WebDriver driver;
	
	@SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver, 30, 1);	
	
	public void waitforElementVisablity(WebElement element)
	{
	
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public void waitforElementclickAble(WebElement element)
	{
	
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public void waitforElementAndSwitchINframe(WebElement element)
	{
	
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}
	
	
	public void waitforElementSelectAble(WebElement element)
	{
	
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

	
}
