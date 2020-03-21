package com.company.utils;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.company.exception.PropertyNotFoundException;

public class CommonFunction {
	protected WebDriver driver;
	
	/**
	 * @description This method is used for reading any properties extension file
	 * @param key(Property file key )
	 * @param path(File Path which you want to read)
	 * @param fileName(which file you want to read)
	 * @return This method return String type of value against property key.
	 */
	
	public String readPropertyFile(String key,String path,String fileName)
	{
		
		String keyValue="";
	
		try {
			String actualPath=path+fileName;
			FileInputStream file=new FileInputStream(actualPath);
			Properties prop=new Properties();
			prop.load(file);
			keyValue=prop.getProperty(key);
			if(keyValue==null)
			{
				throw new PropertyNotFoundException("Missing Property in PropertyFile");
			}
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return keyValue;
		
	}
	
	/**
	 * @author Baidar
	 * @param key means the key for which value i have required
	 * @mainFilePath This variable contains whole path of config.properties package
	 * @fileName this contains filename like config.properties
	 * @setconfigFilePath this method is used to set package path of config.properties which is coming from encapsulation{pathSetting}
	 * @return value of key for config.properties
	 * @throws PropertyNotFoundException
	 */
	  public String setConfigPropertyFilePath(String key) throws PropertyNotFoundException
	  {
		  PathSetting path=new PathSetting();
		  String actualPath=System.getProperty("user.dir");
		  path.setconfigFilePath("\\src\\main\\java\\com\\company\\properties\\");
		  
		  String fileName="config.properties";
		  
		  String mainFilePath=actualPath+path.getconfigFilePath();
		  
		 String value= readPropertyFile(key,mainFilePath,fileName);
		 
		 if(value==null)
			{
				throw new PropertyNotFoundException("Missing Property in PropertyFile "+fileName);
			}
		return value;
		  
	  }
	  
	  /**
	   * 
	   * @param element
	   */
	  
	  public void click(WebElement element)
	  {
		  element.click();
		  
	  }
	  
	  /**
	   * 
	   * @param element
	   * @param data
	   */
	  public void enterData(WebElement element,String data)
	  {
		  element.sendKeys(data);
		  
	  }
	  
	  /**
	   * 
	   * @param url
	   */
	  public void navigateUrl(String url)
	  {
		  driver.get(url);
		  
	  }
	  
	  /**
	   * 
	   * @param element
	   */
	  public void switchToFrame(WebElement element)
	  {
		  
		driver.switchTo().frame(element);
	  }
	  
	  /**
	   * 
	   */
	 public void windowhandle()
	 {
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		while (itr.hasNext()){
			
			String windowID= itr.next();
			driver.switchTo().window(windowID);
		}
		 
	 }
	 /**
	  * 
	  * @param element
	  * @param index
	  */
	 
	 public void selectDropdownbyIndex(WebElement element,int index) {
		 Select select = new Select(element);
		 select.selectByIndex(index);
	 }
	 /**
	  * 
	  * @param element
	  * @param value
	  */
	 
	 public void selectDropdownbyValue(WebElement element,String value) {
		 Select select = new Select(element);
		 select.selectByValue(value);
	 }
	 /**
	  * 
	  * @param element
	  * @param text
	  */
	 public void selectDropdownbyText(WebElement element,String text) {
		 Select select = new Select(element);
		 select.selectByVisibleText(text);;
	 }
	 
	 /**
	  * 
	  * @param element
	  */
	 /**
	  * 
	  * @param element
	  */
	 public void clickUsingActions(WebElement element)
	 {
		 
		 Actions action=new Actions(driver);
		 action.moveToElement(element).click(element).build().perform();
		 
	 }
	 
	 /**
	  * 
	  * @param element
	  */
	 public void clickusingEnterKey(WebElement element)
	 {
		Actions action=new Actions(driver);
		action.moveToElement(element).sendKeys(Keys.ENTER).build().perform();
		 
	 }
	 /**
	  * This is javascript method
	  * @author Baidar
	  * @param element
	  */
	 
	 public void clickusingJavascript(WebElement element)
	 {
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		 
	 }
	 
	 
	 

}





