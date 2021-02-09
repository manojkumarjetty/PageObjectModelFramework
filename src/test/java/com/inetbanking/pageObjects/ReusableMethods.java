package com.inetbanking.pageObjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

import com.inetbanking.testCases.BaseClass;
import com.inetbanking.utilities.XLUtils;

public class ReusableMethods extends BaseClass {

	Actions act = new Actions(driver);

	// Scroll Down

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	// Scroll Down till a particular element

	public void scrollDownParticularElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

	// Double Click a button

	public void doubleClick(WebElement doubleClick) {
		act.doubleClick(doubleClick).perform();
	}

	// Right Click a button

	public void rightClick(WebElement rightClick) {
		act.contextClick(rightClick).perform();
	}

	// Compare two Elements
	
	public void compareTwoStrings(WebElement ele, String str) {
		WebElement strValue = ele;
		String strExpected = str;
		String strActual = strValue.getText();
		logger.info("Test Box value is " + strActual);
		// System.out.println(strActual);
		if (strExpected.equals(strActual)) {
			logger.info("Test Passed");
		} else {
			logger.info("Test Failed");
		}

	}
	
	// Is Selected

	public void isSelected(WebElement ele, String checkBoxName) {
		boolean status = ele.isSelected();
		if (status)
			logger.info(checkBoxName + " Is Selected");
		else
			logger.info(checkBoxName + " Is Not Selected");

	}

	// Is Enabled

	public void isEnabled(WebElement ele, String checkBoxName) {
		boolean status = ele.isEnabled();
		if (status)
			logger.info(checkBoxName + " is Enabled");
		else
			logger.info(checkBoxName + " is Not Enabled");

	}

	// Is Displayed

	public void isDisplayed(WebElement ele, String checkBoxName) {
		boolean status = ele.isDisplayed();
		if (status)
			logger.info(checkBoxName + " is Displayed");
		else
			logger.info(checkBoxName + " is Not Displayed");

	}

	public boolean isDisplayed(WebElement ele) {
		boolean status = ele.isDisplayed();
		return status;
	}
	
	// Data Provider

	@DataProvider(name = "SearchProvider")
	public static Object[][] getDataFromDataprovider() {
		return new Object[][] { { "Guru99", "India" }, { "Krishna", "UK" }, { "Bhupesh", "USA" } };
	}
	
	// Data Provider

	@DataProvider(name = "LoginData")
	public static String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/inetbanking/testData/LoginData.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);// 1 0
			}

		}
		return logindata;
	}
	
	// Click Radio Button

	public void clickRadioButton(WebElement radioElem, boolean sel) {

		if (sel == false) {
			try {
				radioElem.click();
			} catch (Exception e) {
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", radioElem);
			}
		}

	}
	
	// Working on New Tab
	
	public void newTab() {
		
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    driver.close();
		    driver.switchTo().window(tabs2.get(0));
	}
	
	// Working on New Tab
	
	public void newTabs() {

		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

		// Continue with original browser (first window)
	}
	
	// To verify Broken Links

	public static void verifyLinks(String linkUrl)
    {
        try
        {
            URL url = new URL(linkUrl);

            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
            	logger.info(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
            }    
       
            //Fetching and Printing the response code obtained
            else{
            	logger.info(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
        }catch (Exception e) {
      }
   }
}
