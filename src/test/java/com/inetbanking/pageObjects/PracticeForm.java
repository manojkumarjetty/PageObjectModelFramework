package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeForm {
	WebDriver ldriver;

	public PracticeForm(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@id='firstName']")
	@CacheLookup
	public WebElement enterFirstName;

	@FindBy(xpath = "//input[@id='lastName']")
	@CacheLookup
	public WebElement enterLastName;

	@FindBy(xpath = "//input[@id='userEmail']")
	@CacheLookup
	public WebElement enterEmail;

	@FindBy(xpath = "//input[@name='gender'][@value='Male']")
	@CacheLookup
	public WebElement selectGender;
	
	@FindBy(css="label[for='hobbies-checkbox-1']")
	@CacheLookup
	public WebElement sportsCheckBox;
	
	@FindBy(xpath = "//input[@id='uploadPicture']")
	@CacheLookup
	public WebElement uploadElement;
	
	@FindBy(xpath = "//textarea[@id='currentAddress']")
	@CacheLookup
	public WebElement updateCurrentAddress;
	
	@FindBy(xpath = "//div[contains(text(),'Select State')]")
	@CacheLookup
	public WebElement selectState;

	@FindBy(xpath = "//div[contains(text(),'Uttar Pradesh')]")
	@CacheLookup
	public WebElement selectUttarPradesh;
	
	public void enterFirstName(String fName) {
		enterFirstName.sendKeys(fName);
	}

	public void enterLastName(String lName) {
		enterFirstName.sendKeys(lName);
	}

	public void enterEmail(String email) {
		enterFirstName.sendKeys(email);
	}

	public void selectGender() {
		selectGender.click();
	}

	public void clickSportsCheckBox() {
		sportsCheckBox.click();
	}
	
	public void uploadElement(String path) {
		uploadElement.sendKeys(path);
	}
	
	public void updateCurrentAddress(String address) {
		updateCurrentAddress.sendKeys(address);
	}
	
	public void clickSelectState() {
		selectState.click();
	}
	
	public void selectUpState() {
		selectUttarPradesh.click();
	}
}
