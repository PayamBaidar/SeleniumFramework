package com.company.builder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.company.exception.PropertyNotFoundException;
import com.company.utils.CommonFunction;
import com.company.utils.PathSetting;

public class WebDriverCapbiltyBuilder extends Capibilities {
	
    CommonFunction com=new CommonFunction();
    PathSetting path=new PathSetting();
    protected WebDriver driver;
    
    public WebDriverCapbiltyBuilder() {
		
    	addPlatformAndBrowser();
    	
	}
	
	@Override
	public void addPlatformAndBrowser() {

		try {
			
			String platformName=com.setConfigPropertyFilePath("platform");
			path.setPlatform(platformName);
			String platformValue=path.getPlatform();
			
			switch (platformValue) {
			case "windows":
				
				addBrowserDriverExecutablePath();
				break;
				
			case "linux":
				addBrowserDriverExecutablePath();

			break;
			
			case "mac":
				
				addBrowserDriverExecutablePath();

				break;
				
			default:
				throw new PropertyNotFoundException("Please check property File For PlatformName "+platformName);
			}
			
			
		} catch (PropertyNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addBrowserDriverExecutablePath() {
		String projectDriverPath=System.getProperty("user.dir")+"\\driver\\";
		
		try {
			String browser=setBrowserName();
			switch (browser) {
			case "chrome":
				   System.setProperty("webdriver.chrome.driver", projectDriverPath+"chromedriver.exe");
				   break;
			case "firefox":
				   System.setProperty("webdriver.gecko.driver", projectDriverPath+"geckodriver.exe");
				   break;
			default:
				throw new PropertyNotFoundException("Unable to find browserName "+browser);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String setBrowserName()  {
		String browserName="";
		try {
			browserName=com.setConfigPropertyFilePath("browserName");
			
		} catch (PropertyNotFoundException e) {
			e.printStackTrace();
		}
		return browserName;  
		
	}

}
