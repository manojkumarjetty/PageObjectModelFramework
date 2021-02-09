package com.inetbanking.testCases;

import org.testng.annotations.Test;
import com.inetbanking.pageObjects.CheckBoxesForm;
import com.inetbanking.pageObjects.DemoQaMenus;
import com.inetbanking.pageObjects.ReusableMethods;


public class CheckBoxesFormTest extends BaseClass {
	@Test
	public void CheckBoxElementsTest() throws InterruptedException {

		DemoQaMenus dqm = new DemoQaMenus(driver);
		logger.info("Demo QA");
		// Thread.sleep(30000);
		CheckBoxesForm cbf = new CheckBoxesForm(driver);
		ReusableMethods rm = new ReusableMethods();

		rm.scrollDown();
		dqm.clickForms();
		logger.info("Clicked on Forms");
		dqm.clickFormsToggle();
		logger.info("Clicked on Forms Toggle");
		dqm.clickPracticeForm();
		logger.info("Clicked on Practice Form");
		rm.isDisplayed(cbf.sportsCheckBox, "Sports");
		cbf.clickSportsCheckBox();
		logger.info("Clicked on Sports Check Box");
		rm.isSelected(cbf.sportsCheckBox, "Sports");
		rm.isEnabled(cbf.sportsCheckBox, "Sports");
		Thread.sleep(5000);
	}
}
