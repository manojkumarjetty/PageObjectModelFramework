package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DemoQaMenus;
import com.inetbanking.pageObjects.RadioBoxElements;
import com.inetbanking.pageObjects.ReusableMethods;

public class RadioBoxElementsTest extends BaseClass {
	@Test
	public void RadioBoxElementsTest() throws InterruptedException {

		DemoQaMenus dqm = new DemoQaMenus(driver);
		logger.info("Demo QA");

		RadioBoxElements rbe = new RadioBoxElements(driver);
		ReusableMethods rm = new ReusableMethods();

		rm.scrollDown();
		dqm.clickElements();
		logger.info("Clicked on Elements");
		dqm.clickRadioBox();
		logger.info("Clicked on Radio Box Menu");

		rm.isEnabled(rbe.yesRadioButton, "Yes Radio Button ");
		rm.isDisplayed(rbe.yesRadioButton, "Yes Radio Button ");
		rm.isSelected(rbe.yesRadioButton, "Yes Radio Button ");
		logger.info(":::::::::::::::: :::::::::::::::::::: :::::::::::::::::::");
		rm.isEnabled(rbe.noRadioButton, "NO Radio Button ");
		rm.isDisplayed(rbe.noRadioButton, "NO Radio Button ");
		rm.isSelected(rbe.noRadioButton, "NO Radio Button ");
		logger.info(":::::::::::::::: :::::::::::::::::::: :::::::::::::::::::");
		rm.isEnabled(rbe.impressiveRadioButton, "Impressive Radio Button ");
		rm.isDisplayed(rbe.impressiveRadioButton, "Impressive Radio Button ");
		rm.isSelected(rbe.impressiveRadioButton, "Impressive Radio Button ");
		logger.info(":::::::::::::::: :::::::::::::::::::: :::::::::::::::::::");
		rm.clickRadioButton(rbe.yesRadioButton, rm.isDisplayed(rbe.yesRadioButton));
		rm.clickRadioButton(rbe.impressiveRadioButton, rm.isDisplayed(rbe.impressiveRadioButton));
		Thread.sleep(5000);
	}
}
