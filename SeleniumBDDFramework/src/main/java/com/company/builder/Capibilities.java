package com.company.builder;

public abstract class Capibilities {

	/**
	 * @author Baidar
	 * @description: This method is used for deciding in which OS I
	 *               am going to execute test cases.
	 */
	public abstract void addPlatformAndBrowser();
	
	/**
	 * @author Baidar
	 * @description: in this method i am trying to set executable driver path
	 *               for different browsers.
	 */
	
	public abstract void addBrowserDriverExecutablePath();
	
	/**
	 * @author Baidar
	 * @description : this method is used to set which browser I am going to open
	 */
	public abstract String setBrowserName();
	

}
