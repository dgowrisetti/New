package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class CrossBrowserTesting {
	WebDriver driver;

	@Test
	public void f() {
		driver.get("https://www.aakruthicollections.com");
		// Functionality
		System.out.println("Test F");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
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

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(@Optional("Chrome") String browser) {

		try {
			if (browser.equalsIgnoreCase("Chrome")) {
				String path = ".\\browserDrivers\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path);
				driver = new ChromeDriver();
			}
			if (browser.equalsIgnoreCase("Firefox")) {
				// Launch IE browserIEDriverServer
				String path = ".\\browserDrivers\\geckodriver.exe";
				System.setProperty("webdriver.gecko.driver", path);
				driver = new FirefoxDriver();
			}
			if (browser.equalsIgnoreCase("IE")) {
				// Launch IE browserIEDriverServer
				String path = ".\\browserDrivers\\IEDriverServer.exe";
				System.setProperty("webdriver.ie.driver", path);
				driver = new InternetExplorerDriver();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
