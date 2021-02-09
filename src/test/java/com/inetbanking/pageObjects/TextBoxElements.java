package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxElements {
	WebDriver ldriver;

	public TextBoxElements(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Text Box')]")
	@CacheLookup
	public WebElement clickTextBox;

	@FindBy(xpath = "//input[@id='userName']")
	@CacheLookup
	public WebElement enterUserName;

	@FindBy(xpath = "//input[@id='userEmail']")
	@CacheLookup
	public WebElement enterUserEmail;

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	@CacheLookup
	public WebElement enterCurrentAddress;

	@FindBy(xpath = "//textarea[@id='permanentAddress']")
	@CacheLookup
	public WebElement enterPermanentAddress;
	
	@FindBy(xpath = "//button[contains(.,'Submit')]")
	@CacheLookup
	public WebElement clickSubmit;
	
	@FindBy(xpath = "//*[@id='name']")
	@CacheLookup
	public WebElement textBoxText;
	
	public void clickTextBox() {
		clickTextBox.click();
	}

	public void enterUserName() {
		enterUserName.sendKeys("Manoj");
	}

	public void enterUserEmail() {
		enterUserEmail.sendKeys("manojkumar.877@gmail.com");
	}

	public void enterCurrentAddress() {
		enterCurrentAddress.sendKeys("4-4-116,Bapuji Colony,Sullurpet,SPSR Nellore (D.t).,524121");
	}

	public void enterPermanentAddress() {
		enterPermanentAddress.sendKeys("4-4-116,Bapuji Colony,Sullurpet,SPSR Nellore (D.t).,524121");
	}
	
	public void clickSubmit() {
		clickSubmit.click();
	}

}
