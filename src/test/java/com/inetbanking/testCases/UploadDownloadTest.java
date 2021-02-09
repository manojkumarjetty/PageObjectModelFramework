package com.inetbanking.testCases;

import org.testng.annotations.Test;
import com.inetbanking.pageObjects.DemoQaMenus;
import com.inetbanking.pageObjects.ReusableMethods;
import com.inetbanking.pageObjects.UploadDownload;

public class UploadDownloadTest extends BaseClass {
	@Test
	public void UploadDownloadTest() throws InterruptedException {

		DemoQaMenus dqm = new DemoQaMenus(driver);
		logger.info("Demo QA");

		UploadDownload ud = new UploadDownload(driver);
		ReusableMethods rm = new ReusableMethods();

		rm.scrollDown();
		dqm.clickElements();
		logger.info("Clicked on Elements");
		dqm.clickUplodDownloads();
		logger.info("Clicked Uploads and Downloads from Menu");

		ud.downloadElement();
		logger.info("Downloaded jpeg file Successfully");

		ud.uploadElement("C:\\Users\\91990\\Downloads\\sampleFile.jpeg");
		logger.info("Uploaded jpeg file Successfully");
		Thread.sleep(5000);
	}
}
