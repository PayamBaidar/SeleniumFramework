package com.company.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.company.builder.WebDriverCapbiltyBuilder;
import com.company.exception.PropertyNotFoundException;
import com.company.profile.ChromeProfile;
import com.company.profile.FirefoxBrowserProfile;

public class WebDriverManager implements webDriverFactory {

	protected WebDriver driver=null;
	public void initalizeDriver() {
    

		
		try {
			WebDriverCapbiltyBuilder cap=new WebDriverCapbiltyBuilder();
			String browser=cap.setBrowserName();
			switch (browser) {
			case "chrome":
				WebDriverCapbiltyBuilder chromeCap=new WebDriverCapbiltyBuilder();
                ChromeProfile profile=new ChromeProfile();
				driver=new ChromeDriver(profile.option);
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				   break;
			case "firefox":
				WebDriverCapbiltyBuilder firefoxCap=new WebDriverCapbiltyBuilder();
                FirefoxBrowserProfile firefoxprofile=new FirefoxBrowserProfile();
				driver=new FirefoxDriver(firefoxprofile.option);
				driver.get("https://www.google.com");
				driver.manage().window().maximize();

				break;
			default:
				throw new PropertyNotFoundException("Unable to Open browser "+browser);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
		
		
		
		
	}

}
