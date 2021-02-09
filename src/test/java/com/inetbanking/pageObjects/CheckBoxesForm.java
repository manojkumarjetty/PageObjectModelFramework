package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxesForm {
	WebDriver ldriver;

	public CheckBoxesForm(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(css="label[for='hobbies-checkbox-1']")
	@CacheLookup
	public WebElement sportsCheckBox;
	
	public void clickSportsCheckBox() {
		sportsCheckBox.click();
	}

}
