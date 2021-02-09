package com.inetbanking.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DemoQaMenus;
import com.inetbanking.pageObjects.ReusableMethods;
import com.inetbanking.pageObjects.TextBoxElements;

import junit.framework.Assert;

public class TextBoxElementsTest extends BaseClass {
	@Test
	public void TextBoxElementsTest() throws InterruptedException {

		logger.info("Demo QA");
        // Thread.sleep(30000);
		DemoQaMenus dqm = new DemoQaMenus(driver);
		ReusableMethods rm = new ReusableMethods();
		TextBoxElements tbe = new TextBoxElements(driver);
		
		rm.scrollDown();
		dqm.clickElements();
		logger.info("Clicked on Elements");
		
		tbe.clickTextBox();
		logger.info("Clicked on Text Box");
		tbe.enterUserName();
		logger.info("Entered User Name");
		tbe.enterUserEmail();
		logger.info("Entered Email");
		tbe.enterCurrentAddress();
		logger.info("Entered Current Address");
		tbe.enterPermanentAddress();
		logger.info("Entered Permenant Address");
		tbe.clickSubmit();
		logger.info("Clicked on Submit Button");	
		
		rm.scrollDown();
		rm.compareTwoStrings(tbe.textBoxText, "Name:Manoj");
		Thread.sleep(3000);
		
	}
}
