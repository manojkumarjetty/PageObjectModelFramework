package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoTours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("swathi");
		driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("siddi");
		driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("8834284321");
		driver.findElement(By.id("userName")).sendKeys("nagaswathi97@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'address1')]")).sendKeys("Teachers Colony");
		driver.findElement(By.xpath("//input[contains(@name,'city')]")).sendKeys("Rajamundry");
		driver.findElement(By.xpath("//input[contains(@name,'state')]")).sendKeys("Andhra");
		driver.findElement(By.xpath("//input[contains(@name,'postalCode')]")).sendKeys("567823");
		Select country=new Select(driver.findElement(By.xpath("//select[contains(@name,'country')]")));
		country.selectByVisibleText("INDIA");
		driver.findElement(By.cssSelector("#email")).sendKeys("nagaswathi97@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@name,'password')]")).sendKeys("Swathi123");
		driver.findElement(By.xpath("//input[starts-with(@name,'confirmPassword')]")).sendKeys("Swathi123");
		WebDriverWait wait=new WebDriverWait(driver,5);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[starts-with(@name,'submit')]"))));
		element.click();
		driver.findElement(By.linkText("sign-in")).click();
		driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("nagaswathi97@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Swathi123");
		driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("//input[contains(@value,'oneway')]")).click();
		WebElement passengers=driver.findElement(By.xpath("//select[contains(@name,'passCount')]"));
		Select s1=new Select(passengers);
		s1.selectByIndex(0);
		Select departingFrom= new Select(driver.findElement(By.xpath("//select[contains(@name,'fromPort')]")));
		departingFrom.selectByVisibleText("London");
		Select on=new Select(driver.findElement(By.xpath("//select[contains(@name,'fromMonth')]")));
		on.selectByVisibleText("August");
		Select on1=new Select(driver.findElement(By.xpath("//select[contains(@name,'fromDay')]")));
		on1.selectByIndex(12);
		Select arrivingIn=new Select(driver.findElement(By.xpath("//select[contains(@name,'toPort')]")));
		arrivingIn.selectByVisibleText("Paris");
		Select returning=new Select(driver.findElement(By.xpath("//select[contains(@name,'toMonth')]")));
		returning.selectByVisibleText("August");
		Select returning1=new Select(driver.findElement(By.xpath("//select[contains(@name,'toDay')]")));
		returning1.selectByIndex(13);
		WebElement serviceClass=driver.findElement(By.xpath("//input[contains(@value,'First')]"));
		serviceClass.click();
		WebElement airline=driver.findElement(By.xpath("//select[contains(@name,'airline')]"));
		Select s2=new Select(airline);
		s2.selectByVisibleText("Blue Skies Airlines");
		WebElement continue1=driver.findElement(By.xpath("//input[contains(@name,'findFlights')]"));
		continue1.click();
		driver.findElement(By.xpath("//img[starts-with(@src,'images/home.gif')]")).click();
	}

}
