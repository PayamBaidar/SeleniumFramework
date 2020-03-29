package com.company.lowLeveReport;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogReporter {

	public Logger logger = Logger.getLogger(LogReporter.class);
	
	public LogReporter () {
		
		try {
	
		   String path=System.getProperty("user.dir")+"\\src\\main\\java\\com\\company\\lowLeveReport\\Log4j.properties";
		   PropertyConfigurator.configure(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void debug(String message)
	{
		logger.info(message);
	}
	
	
	
	
	
}
