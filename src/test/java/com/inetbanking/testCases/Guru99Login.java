package com.inetbanking.testCases;

import org.testng.annotations.Test;
import com.inetbanking.pageObjects.DataProviderExcelReader;
import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.ReusableMethods;

public class Guru99Login extends BaseClass 
{

	@Test(dataProvider="LoginData",dataProviderClass=ReusableMethods.class)
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		DataProviderExcelReader dper = new DataProviderExcelReader("sheet1");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		logger.info("user name provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();
	}
		
}
	
