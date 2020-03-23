package com.company.utils;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.jetbrains.annotations.TestOnly;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.company.exception.PropertyNotFoundException;

public class CommonFunction {
	public WebDriver driver;
	
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
	   * @enterData this method is used to send the text into a field  
	   * @param element
	   * @param data
	   */
	  public void enterData(WebElement element,String data)
	  {
		  element.sendKeys(data);
		  
	  }
	  
	  /**
	   * @author Baidar
	   * @navigateUrl This method is used to get the URL
	   * @param url
	   */
	  public void navigateUrl(String url)
	  {
		  driver.get(url);
		  
	  }
	  
	  /**
	   * @author Baidar
	   * @switchToFrame This method is used to switch to a frame
	   * @param element
	   */
	  public void switchToFrame(WebElement element)
	  {
		  
		driver.switchTo().frame(element);
	  }
	  
	  /**
	   * @author Baidar
	   * @windowhandle This method is used to handle the window throw Iterator 
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
	  * @author Baidar
	  * @selectDropdownbyIndex This method is used from select class to select the dropdown by (index)
	  * @param element
	  * @param index
	  */
	 
	 public void selectDropdownbyIndex(WebElement element,int index) {
		 Select select = new Select(element);
		 select.selectByIndex(index);
	 }
	 /**
	  * @author Baidar
	  * @selectDropdownbyIndex This method is used from select class to select the dropdown by (value)
	  * @param element
	  * @param value
	  */
	 
	 public void selectDropdownbyValue(WebElement element,String value) {
		 Select select = new Select(element);
		 select.selectByValue(value);
	 }
	 /**
	  * @author Baidar
	  * @selectDropdownbyIndex This method is used from select class to select the dropdown by (text)
	  * @param element
	  * @param text
	  */
	 public void selectDropdownbyText(WebElement element,String text) {
		 Select select = new Select(element);
		 select.selectByVisibleText(text);;
	 }
	 
	 /**
	  * @author Baidar
	  * @clickUsingActions This method is used to click using Action class
	  * @param element
	  */
	 public void clickUsingActions(WebElement element)
	 {
		 
		 Actions action=new Actions(driver);
		 action.moveToElement(element).click(element).build().perform();
		 
	 }
	 
	 /**
	  *@author Baidar
	  *@clickusingEnterKey This method is used to click using keybord Enter using Action class
	  * @param element
	  */
	 public void clickusingEnterKey(WebElement element)
	 {
		Actions action=new Actions(driver);
		action.moveToElement(element).sendKeys(Keys.ENTER).build().perform();
		 
	 }
	 /**
	  *@clickusingJavascript This method is used to click on any Element to click using (JavascriptExecuter)
	  * @author Baidar
	  * @param element
	  */
	 
	 public void clickusingJavascript(WebElement element)
	 {
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		 
	 }
	 
	 /**
	  * @author Baidar
	  * @getText  This method is used to get text 
	  * @param element
	  * @return
	  */
	 
	 public String getText(WebElement element) 
	 {
	String text= element.getText();
	 return text;
	 
	 }
	 
	 /**
	  * @IselementPresent This method is used to show is the element is Displayed 
	  * @param element
	  * @return
	  */
	 public boolean IselementPresent(WebElement element)
	 {
		 boolean flag = element.isDisplayed();
		 return flag;
		 
	 }
	 
	 
	 public void assertElement(boolean actual,boolean expected)
	 {
	 }
	 
	 public String getValue(WebElement element,String attribute)
	 {
		 String value = element.getAttribute(attribute);
		 return value;
	 }
	 
	 /**
	  * @author Baidar
	  * @clearData This method is used to clear the data from the field before doning anything else 
	  * @param element
	  */
	 
	 public void clearData(WebElement element) {
		 
		 element.clear();
	 }
	 
	 /**
	  * @author Baidar
	  * @checkElementEnable This method is used to check is the Elements Inabilities  
	  * @param element
	  * @return
	  */
	 public boolean checkElementEnable(WebElement element) 
	 
	 {
		 boolean flag=element.isEnabled();
		 return flag;
		 
	 }

	 public boolean isCheckBoxSelected(WebElement element)
	 {
		 boolean flag =element.isSelected();
		 return flag;
	 }
	 
	 public String checkImageCSS(WebElement element)
	 {
		 String color =element.getCssValue("color");
		 return color;
	 }
	 
	 public void dragAndDrop(WebElement source,WebElement target)
	 {
		 Actions action = new Actions(driver);
		 action.dragAndDrop(source, target).build().perform();
		 
	 }
	 
	 public void acceptAlertBox()
	 {
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
	 }
	 
	 public void dismisAlertBox()
	 {
		 Alert alert = driver.switchTo().alert();
		 alert.dismiss();
	 }
	 
	 public String getAlertBoxText()
	 {
		 Alert alert = driver.switchTo().alert();
		String text= alert.getText();
		return text;
	 }
	 
	 public void moveToFrame(WebElement element)
	 {
		 driver.switchTo().frame(element);
	 }
	 
	 public void refresh() 
	 {
		 driver.navigate().refresh();
	 }
	 
	 public String getCurrentURL() {
		String currentURL= driver.getCurrentUrl();
		return currentURL;
	 }
	 
	 public String getTitelText()
	 {
		 String title= driver.getTitle();
		 return title;
	 }
	 
	 public void maxWindow()
	 {
		 driver.manage().window().maximize();
	 }
	 
	 public void TearDown()
	 {
	 driver.quit();
	 
	 }
	 
	 
	 
}





