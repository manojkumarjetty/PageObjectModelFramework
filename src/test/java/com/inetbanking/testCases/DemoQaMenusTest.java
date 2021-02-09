package com.inetbanking.testCases;

import org.testng.annotations.Test;
import com.inetbanking.pageObjects.DemoQaMenus;
import com.inetbanking.pageObjects.ReusableMethods;


public class DemoQaMenusTest extends BaseClass {
	@Test
	public void DemoQaMenusTest() throws InterruptedException {

		logger.info("Demo QA");
        // Thread.sleep(30000);
		DemoQaMenus dqm = new DemoQaMenus(driver);
		ReusableMethods rm = new ReusableMethods();
		
		rm.scrollDown();
		dqm.clickElements();
		logger.info("Clicked on Elements");
		driver.navigate().back();
		Thread.sleep(3000);
		
		rm.scrollDown();
		dqm.clickForms();
		logger.info("Clicked on Forms");
		driver.navigate().back();
		Thread.sleep(3000);
		
		rm.scrollDown();
		dqm.clickAlerts();
		logger.info("Clicked on Alerts");
		driver.navigate().back();
		Thread.sleep(3000);
		
		rm.scrollDown();
		dqm.clickWidgets();
		logger.info("Clicked on Widgets");
		driver.navigate().back();
		Thread.sleep(3000);
		
		rm.scrollDown();
		dqm.clickInteractions();
		logger.info("Clicked on Interactions");
		Thread.sleep(3000);
	}
}
