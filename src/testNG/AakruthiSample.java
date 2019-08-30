package testNG;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class AakruthiSample {
	WebDriver driver;

	@Test
	public void f() {

		driver.get("https://www.aakruthicollections.com");
		// Functionality
		System.out.println("Test F");
	}

	@Test
	public void r() {

		driver.get("https://www.fb.com");
		// Functionality
		System.out.println("Test r");
	}

	@AfterMethod
	public void afterMethod() throws IOException, Exception {

		Date d = new Date();
		System.out.println(d);
		// dd_MMM_yyyy_HH_mm_ss
		DateFormat df = new SimpleDateFormat("dd_MMM_yyyy_HH_mm_ss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);// 06_Aug_2019_21_29_01

		String screenshotPath = ".\\screenshots\\";

		// Take screenshot
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// From RAM location will move to Specific loaction
		FileHandler.copy(f, new File(screenshotPath + "Test" + timeStamp + ".PNG"));

		Thread.sleep(2000);
	}

	@BeforeClass
	public void beforeClass() {
		String path = ".\\browserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		driver = new ChromeDriver();

	}

}
