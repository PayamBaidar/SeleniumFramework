package com.company.utils;

public class PathSetting {
	
	
	private String configFilePath;
	private String platform;
	
	/**
	 * @author Baidar
	 * @description: This method is used to get config file path
	 * @return
	 */
	public String getconfigFilePath()
	{
		return configFilePath;
	}

	/**
	 * @author Baidar
	 * @description: This method is used to set Config file Path
	 * @param configFilePath
	 */
	public void setconfigFilePath(String configFilePath)
	{
		this.configFilePath=configFilePath;
		
	}
	/**
	 * @description This method is used to get platformName
	 * @return
	 */
	
	public String getPlatform()
	{
		return platform;
		
	}
	/**
	 * @description This method is used to set Platform Name
	 * @param platform
	 */
	public void setPlatform(String platform)
	{
		this.platform=platform;
		
	}
	
	
	
	
	
	
}
