package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.Buttons;
import com.inetbanking.pageObjects.DemoQaMenus;
import com.inetbanking.pageObjects.ReusableMethods;

public class ButtonsTest  extends BaseClass {
	@Test
	public void ButtonsTest() throws InterruptedException {

		DemoQaMenus dqm = new DemoQaMenus(driver);
		logger.info("Demo QA");

		Buttons but = new Buttons(driver);
		ReusableMethods rm = new ReusableMethods();

		rm.scrollDown();
		dqm.clickElements();
		logger.info("Clicked on Elements");
		dqm.clickButtons();
		logger.info("Clicked on Buttons Menu");
		rm.doubleClick(but.doubleClick);
		logger.info("Double clicked the button");
		rm.rightClick(but.rightClick);
		logger.info("Right clicked the button");
		but.clickButton();
		logger.info("Clicked the button");
		Thread.sleep(5000);
	}
}
