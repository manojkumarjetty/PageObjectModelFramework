package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadDownload {

	WebDriver ldriver;

	public UploadDownload(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@id='downloadButton']")
	@CacheLookup
	public WebElement downloadElement;

	@FindBy(xpath = "//input[@id='uploadFile']")
	@CacheLookup
	public WebElement uploadElement;

	public void uploadElement(String path) {
		uploadElement.sendKeys(path);
	}

	public void downloadElement() {
		downloadElement.click();
	}

}
