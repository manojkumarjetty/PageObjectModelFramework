package com.inetbanking.testCases;

import org.testng.annotations.Test;
import com.inetbanking.pageObjects.DemoQaMenus;
import com.inetbanking.pageObjects.PracticeForm;
import com.inetbanking.pageObjects.ReusableMethods;

public class PracticeFormTest extends BaseClass {
	@Test
	public void PracticeFormTest() throws InterruptedException {

		DemoQaMenus dqm = new DemoQaMenus(driver);
		logger.info("Demo QA");

		PracticeForm pf = new PracticeForm(driver);
		ReusableMethods rm = new ReusableMethods();

		rm.scrollDown();
		dqm.clickForms();
		logger.info("Clicked on Forms");
		
		dqm.clickPracticeForm();
		logger.info("Clicked on Practice Forms");
		
		Thread.sleep(5000);
	}
}