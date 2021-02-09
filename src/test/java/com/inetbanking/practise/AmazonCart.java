package com.inetbanking.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonCart {

	public WebDriver driver;

	@Parameters("browser")

	@BeforeClass

	// Passing Browser parameter from TestNG xml

	public void beforeTest(String browser) {

		// If the browser is Firefox, then do this

		if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");

			// Initialize Gecko Driver using Desired Capabilities Class
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver(capabilities);

		} else if (browser.equalsIgnoreCase("chrome")) {

			// Initialize the chrome driver

			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		// Enter the website address in the browser

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

	}

	// Once Before method is completed, Test method will start

	@Test
	public void login() throws InterruptedException {

		// click on hamburger menu
		WebElement Ele = driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
		Ele.click();
		Actions act = new Actions(driver);
		act.moveToElement(Ele).build().perform();
		Thread.sleep(7000);

		System.out.println("Clicked on Amazon Menu");

		// Under Digital Content And Devices click on Echo & Alexa
		driver.findElement(By.xpath("//div[text()='Echo & Alexa']")).click();
		System.out.println("Under Digital Content And Devices clicked on Echo & Alexa");

		// Under Echo & Alexa click on Echo Dot(3rd Gen)
		driver.findElement(By.linkText("Echo Dot (3rd Gen)")).click();
		System.out.println("Under Echo & Alexa clicked on Echo Dot(3rd Gen)");

		// To print items in cart before adding
		String cartValue = driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();
		System.out.println("Items in cart before adding are " + cartValue);

		// Add to Cart
		driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button')]")).click();
		System.out.println("Items added into cart");

		// To print items in cart after adding
		String cartValueUpdated = driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();
		System.out.println("Items in cart after adding are " + cartValueUpdated);

	}

	@AfterClass
	public void afterTest() {

		driver.quit();

	}

}
