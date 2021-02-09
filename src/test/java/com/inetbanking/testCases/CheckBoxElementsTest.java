package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.CheckBoxElements;
import com.inetbanking.pageObjects.DemoQaMenus;
import com.inetbanking.pageObjects.ReusableMethods;
import com.inetbanking.pageObjects.TextBoxElements;

public class CheckBoxElementsTest extends BaseClass {
	@Test
	public void CheckBoxElementsTest() throws InterruptedException {

		DemoQaMenus dqm = new DemoQaMenus(driver);
		logger.info("Demo QA");
		// Thread.sleep(30000);
		CheckBoxElements cbe = new CheckBoxElements(driver);
		ReusableMethods rm = new ReusableMethods();

		rm.scrollDown();
		dqm.clickElements();
		logger.info("Clicked on Elements");
		dqm.clickCheckBox();
		logger.info("Clicked on Check Box Menu");
		cbe.clickExpandCheckBoxes();
		logger.info("Clicked on + Button");
		//rm.scrollDownParticularElement(cbe.excelFileCheckBox);
		cbe.clickExpandCheckBoxes();
		cbe.clickHomeCheckBox();
		// rm.isEnabled(cbe.homeCheckBox,"Home");
		rm.isEnabled(cbe.desktopCheckBox,"Desktop");
		rm.isEnabled(cbe.notesCheckBox,"Notes");
		rm.isEnabled(cbe.commandsCheckBox,"Commands");
		rm.isEnabled(cbe.documentsCheckBox,"Documents");
		rm.isEnabled(cbe.workspaceCheckBox,"Workspace");
		rm.isEnabled(cbe.reactCheckBox,"React");
		rm.isEnabled(cbe.angularCheckBox,"Angular");
		rm.isEnabled(cbe.veuCheckBox,"Veu");
		rm.isEnabled(cbe.officeCheckBox,"Office");
		rm.isEnabled(cbe.publicCheckBox,"Public");
		rm.isEnabled(cbe.classifiedCheckBox,"Classified");
		rm.isEnabled(cbe.genealCheckBox,"General");
		rm.isEnabled(cbe.downloadsCheckBox,"Downloads");
		rm.isEnabled(cbe.wordFileCheckBox,"Word File");
		rm.isEnabled(cbe.excelFileCheckBox,"Excel File");
		Thread.sleep(5000);
		logger.info("End of check boxes");
	}
}
