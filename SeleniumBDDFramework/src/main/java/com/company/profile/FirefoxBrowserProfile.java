package com.company.profile;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;

public class FirefoxBrowserProfile extends browserProfile  {

	public FirefoxOptions option=new FirefoxOptions();
	public FirefoxProfile profile=new FirefoxProfile();
	
	public FirefoxBrowserProfile()
	{
		setDownloadPath();
		addUntrustedCertificate();
		disableFileDownloadPopup();
		disableadvertismentPopup();
	}

	/**
	 * I have used here firefox profile to set download folder path of project
	 */
	@Override
	public void setDownloadPath() {

		profile.setPreference("browser.download.folderList", 2);
		String path=System.getProperty("user.dir")+"\\download";
		profile.setPreference("browser.download.dir", path);
		option.setProfile(profile);
	}

	/**
	 *  I have used firefoxoptions class to add SSL certificate
	 */
	@Override
	public void addUntrustedCertificate() {
   option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
	}
    /**
     *  Here i have disable download popup for  all type of extension file 
     */
	@Override
	public void disableFileDownloadPopup() {
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv,application/zip,application/pdf");
          option.setProfile(profile);
	}
/**
 *  I have added code to accept unexpected alert behavior
 */
	@Override
	public void disableadvertismentPopup() {
		
		option.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		
	}
	

}
