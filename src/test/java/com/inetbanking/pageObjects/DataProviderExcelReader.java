package com.inetbanking.pageObjects;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.testCases.BaseClass;
import com.inetbanking.utilities.XLUtils;

public class DataProviderExcelReader {

	public String user;
	public String pwd;
	public static String sheetName;
	
	public DataProviderExcelReader(String sheetName){
		this.sheetName=sheetName;
	}

	@DataProvider(name = "LoginData")
	public static String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/inetbanking/testData/LoginData.xlsx";

		int rownum = XLUtils.getRowCount(path, sheetName);
		int colcount = XLUtils.getCellCount(path, sheetName, 1);

		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, sheetName, i, j);// 1 0
			}

		}
		return logindata;
	}

}
