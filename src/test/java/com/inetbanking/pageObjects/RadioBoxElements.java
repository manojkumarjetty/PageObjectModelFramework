package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioBoxElements {
	WebDriver ldriver;

	public RadioBoxElements(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@id='yesRadio']")
	@CacheLookup
	public WebElement yesRadioButton;
	
	@FindBy(xpath = "//input[@id='impressiveRadio']")
	@CacheLookup
	public WebElement impressiveRadioButton;
	
	@FindBy(xpath = "//input[@id='noRadio']")
	@CacheLookup
	public WebElement noRadioButton;
	
	/*public void clickYesRadioButton() {
		yesRadioButton.click();
	}
	
	public void clickImpressiveRadioButton() {
		impressiveRadioButton.click();
	}
	
	public void clickNoRadioButton() {
		noRadioButton.click();
	}*/
}
