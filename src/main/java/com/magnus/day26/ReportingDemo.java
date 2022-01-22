package com.magnus.day26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportingDemo {
	
	WebDriver driver = null;
	@BeforeTest()
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test (priority=1)
	public void performGoogleSearch() {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone 14" + Keys.ENTER);
		Reporter.log("Completed Google search for iphone 14");
		
	}
	@Test (priority=0)
	public void performWikiSearch()  {
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Iphone 14" + Keys.ENTER);
		
		Reporter.log("Completed Wiki search for iphone 14");
	}
	
	@AfterTest
	public void dismiss() {
		driver.close();
		driver.quit();
	}

}
