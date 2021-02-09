package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buttons {

	WebDriver ldriver;

	public Buttons(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//button[@id='doubleClickBtn']")
	@CacheLookup
	public WebElement doubleClick;
	
	@FindBy(xpath = "//button[@id='rightClickBtn']")
	@CacheLookup
	public WebElement rightClick;
	
	@FindBy(xpath = "(//button[contains(text(),'Click Me')])[3]")
	@CacheLookup
	public WebElement clickButton;
	
	public void clickDoubleClickButton() {
		doubleClick.click();
	}
	
	public void clickRightClickButton() {
		rightClick.click();
	}
	
	public void clickButton() {
		clickButton.click();
	}
	
}
