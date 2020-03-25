package com.company.wait;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.company.factory.WebDriverManager;

public class ExplictlyWait {
	
	@SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(WebDriverManager.driver, 30, 1);	
	
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
