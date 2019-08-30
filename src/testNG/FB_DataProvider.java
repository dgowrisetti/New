package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

public class FB_DataProvider {

	// Create a Webdriver Object/Reference
	WebDriver driver;

	@Test(dataProvider = "dp")
	public void f(String un, String psd) throws Exception {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(psd);
		//driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(8000);
	}

	@AfterMethod
	public void afterMethod() {
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] { "test123@gmsil.com", "a2345sdftg41" },
			new Object[] { "deepak@gmail.com", "b534fdgfdg" }, };
	}

	@BeforeClass
	public void beforeClass() {
		// Launch Chrome browser
		String path = ".\\browserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();

		// Open URL
		driver.get("https://www.facebook.com/");
		// Maximize the current window
		driver.manage().window().maximize();
	}

}
