package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxElements {
	WebDriver ldriver;

	public CheckBoxElements(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "(//button)[2]")
	@CacheLookup
	public WebElement expandCheckBoxes;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[1]")
	@CacheLookup
	public WebElement homeCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[2]")
	@CacheLookup
	public WebElement desktopCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[3]")
	@CacheLookup
	public WebElement notesCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[4]")
	@CacheLookup
	public WebElement commandsCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[5]")
	@CacheLookup
	public WebElement documentsCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[6]")
	@CacheLookup
	public WebElement workspaceCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[7]")
	@CacheLookup
	public WebElement reactCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[8]")
	@CacheLookup
	public WebElement angularCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[9]")
	@CacheLookup
	public WebElement veuCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[10]")
	@CacheLookup
	public WebElement officeCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[11]")
	@CacheLookup
	public WebElement publicCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[12]")
	@CacheLookup
	public WebElement privateCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[13]")
	@CacheLookup
	public WebElement classifiedCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[14]")
	@CacheLookup
	public WebElement genealCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[15]")
	@CacheLookup
	public WebElement downloadsCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[16]")
	@CacheLookup
	public WebElement wordFileCheckBox;

	@FindBy(xpath = "(//label[1]/span[1]/*[1])[17]")
	@CacheLookup
	public WebElement excelFileCheckBox;

	public void clickExpandCheckBoxes() {
		expandCheckBoxes.click();
	}

	public void clickHomeCheckBox() {
		homeCheckBox.click();
	}

	public void clickDesktopCheckBox() {
		desktopCheckBox.click();
	}

	public void clickNotesCheckBox() {
		notesCheckBox.click();
	}

	public void clickCommandsCheckBox() {
		commandsCheckBox.click();
	}

	public void clickDocumentsCheckBox() {
		documentsCheckBox.click();
	}

	public void clickWorkSpaceCheckBox() {
		workspaceCheckBox.click();
	}

	public void clickReactCheckBox() {
		reactCheckBox.click();
	}

	public void clickAngularCheckBox() {
		angularCheckBox.click();
	}

	public void clickVeuCheckBox() {
		veuCheckBox.click();
	}

	public void clickOfficeCheckBox() {
		officeCheckBox.click();
	}

	public void clickPublicCheckBox() {
		publicCheckBox.click();
	}

	public void clickPrivateCheckBox() {
		privateCheckBox.click();
	}

	public void clickClassifiedCheckBox() {
		classifiedCheckBox.click();
	}

	public void clickGenealCheckBox() {
		genealCheckBox.click();
	}

	public void clickDownloadsCheckBox() {
		downloadsCheckBox.click();
	}

	public void clickWordFileCheckBox() {
		wordFileCheckBox.click();
	}

	public void clickExcelFileCheckBox() {
		excelFileCheckBox.click();
	}
}
