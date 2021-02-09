package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DemoQaMenus;
import com.inetbanking.pageObjects.Links;
import com.inetbanking.pageObjects.ReusableMethods;

public class LinksTest  extends BaseClass {
	@Test
	public void LinksTest() throws InterruptedException {

		DemoQaMenus dqm = new DemoQaMenus(driver);
		logger.info("Demo QA");

		Links lnk = new Links(driver);
		ReusableMethods rm = new ReusableMethods();

		rm.scrollDown();
		dqm.clickElements();
		logger.info("Clicked on Elements");
		dqm.clickLinks();
		logger.info("Clicked on Links Menu");
		lnk.clickHomeLink();
		logger.info("Clicked on Home Link");
		rm.newTab();
		logger.info("Closed New Tab");
		lnk.clickHomeS3H5QLink();
		rm.newTabs();
		Thread.sleep(5000);
	}
}
