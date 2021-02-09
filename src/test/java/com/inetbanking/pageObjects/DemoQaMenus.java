package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaMenus {
	WebDriver ldriver;

	public DemoQaMenus(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	/* Elements Menu elements Starts Here */

	@FindBy(xpath = "//h5[contains(text(),'Elements')]")
	@CacheLookup
	WebElement clickElements;

	@FindBy(xpath = "//span[contains(text(),'Text Box')]")
	@CacheLookup
	public WebElement clickTextBox;

	@FindBy(xpath = "//span[contains(text(),'Check Box')]")
	@CacheLookup
	WebElement clickCheckBox;

	@FindBy(xpath = "//span[contains(text(),'Radio')]")
	@CacheLookup
	WebElement clickRadioBox;

	@FindBy(xpath = "//span[contains(text(),'Buttons')]")
	@CacheLookup
	WebElement clickButtons;

	@FindBy(xpath = "(//span[contains(text(),'Links')])[1]")
	@CacheLookup
	WebElement clickLinks;
	
	@FindBy(xpath = "//span[contains(text(),'Upload')]")
	@CacheLookup
	WebElement clickUplodDownloads;
	/* Elements Menu elements ends Here */

	/* Forms Menu elements Starts Here */

	@FindBy(xpath = "//h5[contains(text(),'Forms')]")
	@CacheLookup
	WebElement clickForms;

	@FindBy(xpath = "(//div[@class='icon'])[2]")
	@CacheLookup
	WebElement clickFormToggle;

	@FindBy(xpath = "//span[contains(text(),'Practice Form')]")
	@CacheLookup
	WebElement clickPracticeForm;

	/* Forms Menu elements ends Here */

	@FindBy(xpath = "//h5[contains(text(),'Alerts')]")
	@CacheLookup
	WebElement clickAlerts;

	@FindBy(xpath = "//h5[contains(text(),'Widgets')]")
	@CacheLookup
	WebElement clickWidgets;

	@FindBy(xpath = "//h5[contains(text(),'Interactions')]")
	@CacheLookup
	WebElement clickInteractions;

	/* Elements Menu methods Starts Here */

	public void clickElements() {
		clickElements.click();
	}

	public void clickTextBox() {
		clickTextBox.click();
	}

	public void clickCheckBox() {
		clickCheckBox.click();
	}

	public void clickRadioBox() {
		clickRadioBox.click();
	}

	public void clickButtons() {
		clickButtons.click();
	}

	public void clickLinks() {
		clickLinks.click();
	}
	
	public void clickUplodDownloads() {
		clickUplodDownloads.click();
	}
	/* Elements Menu methods Ends Here */

	/* Form Menu methods Starts Here */

	public void clickForms() {
		clickForms.click();
	}

	public void clickFormsToggle() {
		clickFormToggle.click();
	}

	public void clickPracticeForm() {
		clickPracticeForm.click();
	}

	/* Form Menu Ends Here */

	public void clickAlerts() {
		clickAlerts.click();
	}

	public void clickWidgets() {
		clickWidgets.click();
	}

	public void clickInteractions() {
		clickInteractions.click();
	}

}
