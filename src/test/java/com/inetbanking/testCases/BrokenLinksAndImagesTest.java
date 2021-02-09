package com.inetbanking.testCases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.ReusableMethods;

public class BrokenLinksAndImagesTest extends BaseClass {
	String url = "";

	@Test
	public void WebPageLinks_BrokenLinks() {

		// WebPage Links

		driver.navigate().to("https://demoqa.com/links");
		logger.info("We are in Links page ");
		List<WebElement> allURLs = driver.findElements(By.tagName("a"));
		logger.info("Total No. of links on the Web Pages are : " + allURLs.size());
		logger.info("Total links on the Web Pages are : ");
		// We will iterate through the list and will check the elements in the list.
		Iterator<WebElement> iterator = allURLs.iterator();
		while (iterator.hasNext()) {
			url = iterator.next().getText();
			logger.info(url);
		}

		// Broken Links
		driver.navigate().to("https://demoqa.com/broken");
		logger.info("We are in Broken page ");
		ReusableMethods rm = new ReusableMethods();
		// Storing the links in a list and traversing through the links
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// This line will print the number of links and the count of links.
		logger.info("No of links are " + links.size());

		// checking the links fetched.
		for (int i = 0; i < links.size(); i++) {
			WebElement E1 = links.get(i);
			String url = E1.getAttribute("href");
			rm.verifyLinks(url);
		}

		// Broken Images

		// Storing all elements with img tag in a list of WebElements
		List<WebElement> images = driver.findElements(By.tagName("img"));
		logger.info("Total number of Images on the Page are " + images.size());

		// checking the links fetched.
		for (int index = 0; index < images.size(); index++) {
			WebElement image = images.get(index);
			String imageURL = image.getAttribute("src");
			logger.info("URL of Image " + (index + 1) + " is: " + imageURL);
			rm.verifyLinks(imageURL);

			// Validate image display using JavaScript executor
			try {
				boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript(
						"return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);",
						image);
				if (imageDisplayed) {
					logger.info("DISPLAY - OK");
				} else {
					logger.info("DISPLAY - BROKEN");
				}
			} catch (Exception e) {
				logger.info("Error Occured");
			}
		}

	}

}
