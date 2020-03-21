package com.company.profile;

public abstract class browserProfile {
	
	/**
	 * Its used to set download Path in My computer
	 */
	public abstract void setDownloadPath();
	
	/**
	 * This method is used to establish SSL connection between client and server
	 * SSL - Secure socket Layer
	 */
	public abstract void addUntrustedCertificate();
	
	/**
	 *  Its used to download automatic any file in my computer Project
	 *  without any popup
	 */
	public abstract void disableFileDownloadPopup();
	
	/**
	 * Its used to disable unnecessary advertisement popup
	 */
	
	public abstract void disableadvertismentPopup();

}
