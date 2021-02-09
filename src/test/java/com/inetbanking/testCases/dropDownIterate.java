package com.inetbanking.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class dropDownIterate extends BaseClass{

	@Test
	public void dropDownValues() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		
		lp.clickMyAccount();
		lp.clickMyLogin();
		lp.loginWithGoogle();
		
		WebElement month_dropdown=driver.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/div[1]/div[1]"));
		 
		Select month=new Select(month_dropdown);
		 
		List<WebElement> dropdown=month.getOptions();
		 
		 for(int i=0;i<dropdown.size();i++){
		 
		 String drop_down_values=dropdown.get(i).getText();
		 
		 System.out.println("dropdown values are "+drop_down_values);
		 logger.info("dropdown values are "+drop_down_values);
		 
		 }
	}
	
}
