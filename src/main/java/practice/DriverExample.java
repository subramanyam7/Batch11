package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(practice.ScreenshotListener.class)
public class DriverExample extends BaseClass{
	@BeforeTest()
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test(priority = 1)
	public void performGoogleSearch() {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Apple Iphone 13" + Keys.ENTER);
		Assert.assertTrue(driver.getTitle().contains("Apple Iphone 14"));
		Reporter.log("Google search for Iphone 13 done successfully");
	}
	@Test(priority = 2)
	public void performWikiSearch() {
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone 13" + Keys.ENTER);
		Reporter.log("Wiki search for Iphone 13 done successfully");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}


//public void takeScreenshot1(WebDriver driver) {
//	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
//	LocalDateTime now = LocalDateTime.now();
//	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	try {
//		String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
//				+ "/target/surefire-reports";
//		File destFile = new File(reportDirectory + "/failure_screenshots/screenshot_" + dtf.format(now) + ".png");
//		FileUtils.copyFile(scrFile, destFile);
//		Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath()
//				+ "' height='100' width='100'/> </a>");
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//}
