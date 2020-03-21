package com.company.profile;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class ChromeProfile extends browserProfile {
	
	public ChromeOptions option=new ChromeOptions();
	
	public ChromeProfile()
	{
		setDownloadPath();
		addUntrustedCertificate();
		disableFileDownloadPopup();
		disableadvertismentPopup();
		
	}

	@Override
	public void setDownloadPath() {
		Map<String, Object> map=new HashMap<String, Object>();
		String path=System.getProperty("user.dir")+"\\download";
		map.put("download.default_directory", path);
		option.setExperimentalOption("prefs", map);

		
	}

	@Override
	public void addUntrustedCertificate() {
		
		option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
	}

	@Override
	public void disableFileDownloadPopup() {
		option.addArguments("--disable-extensions");		
	}

	@Override
	public void disableadvertismentPopup() {
		option.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		
	}

}
