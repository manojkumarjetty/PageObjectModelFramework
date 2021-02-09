package com.inetbanking.pageObjects;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inetbanking.testCases.BaseClass;

public class LoginPage extends BaseClass {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	@CacheLookup
	WebElement clickMyAccount;

	@FindBy(xpath = "//a[@id='signInBtn']")
	@CacheLookup
	WebElement clickLogin;

	@FindBy(xpath = "//img[@id='google-login-btn']")
	@CacheLookup
	WebElement googleLogin;

	@FindBy(xpath = "//input[@id='identifierId']")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//a[contains(text(),'Hi Manoj')]")
	@CacheLookup
	WebElement userLogin;

	@FindBy(xpath = "//a[@id='logOut']")
	@CacheLookup
	WebElement lnkLogout;
	
	@FindBy(xpath = "//input[@name='uid']")
	@CacheLookup
	WebElement guru99UserName;
	
	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement guru99Password;
	
	@FindBy(xpath = "//input[@name='btnLogin']")
	@CacheLookup
	WebElement guru99Login;

	public void clickMyAccount() throws InterruptedException {
		clickMyAccount.click();
		Thread.sleep(3000);
	}

	public void clickMyLogin() throws InterruptedException {
		clickLogin.click();
		Thread.sleep(3000);
	}

	public void loginWithGoogle() throws InterruptedException {

		// Sign In with Google button
		googleLogin.click();
		logger.info("Check for Google Click button");
		Thread.sleep(3000);

		// Pop up for Google Sign In
		String parentWindow = ldriver.getWindowHandle();
		System.out.println("Parent Window ID is : " + parentWindow);
		WebDriverWait wait = new WebDriverWait(ldriver, 5);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> s1 = ldriver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String next_tab = i1.next();
			if (!parentWindow.equalsIgnoreCase(next_tab)) {
				ldriver.switchTo().window(next_tab);
				System.out.println("Working on Google Login Box");
				ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement email_phone = txtUserName;
				email_phone.sendKeys(username);
				ldriver.findElement(By.id("identifierNext")).click();
				WebElement pwd = txtPassword;
				WebDriverWait wait1 = new WebDriverWait(ldriver, 10);
				wait1.until(ExpectedConditions.elementToBeClickable(pwd));
				pwd.sendKeys(password);
				ldriver.findElement(By.id("passwordNext")).click();
				System.out.println(ldriver.getTitle());
			}
		}
		logger.info("Login Successfully");
		ldriver.switchTo().window(parentWindow);
		Thread.sleep(10000);
	}

	public void clickLogout() {
		userLogin.click();
		lnkLogout.click();
		logger.info("Logout Successfully");
	}
	
public void setUserName(String uname) {
	guru99UserName.sendKeys(uname);
	logger.info("Entered user name is "+uname);
	}

public void setPassword(String pwd) {
	guru99Password.sendKeys(pwd);
	logger.info("Entered Password is "+pwd);
}

public void clickSubmit() {
	guru99Login.click();
}



}
