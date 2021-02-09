package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Links {
	WebDriver ldriver;

	public Links(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "(//a[text()='Home'])[1]")
	@CacheLookup
	public WebElement homeLink;

	@FindBy(xpath = "(//a[text()='Home'])[2]")
	@CacheLookup
	public WebElement homeS3H5QLink;

	public void clickHomeLink() {
		homeLink.click();
	}

	public void clickHomeS3H5QLink() {
		homeS3H5QLink.click();
	}
}
