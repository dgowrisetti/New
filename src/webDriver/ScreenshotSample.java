package webDriver;

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
import org.testng.reporters.jq.Main;

public class ScreenshotSample {
	public static void main(String[] args) throws IOException, InterruptedException {
		// Date : Tue Aug 06 21:23:34 EDT 2019
		Date d = new Date();
		System.out.println(d);
		// dd_MMM_yyyy_HH_mm_ss
		DateFormat df = new SimpleDateFormat("dd_MMM_yyyy_HH_mm_ss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);// 06_Aug_2019_21_29_01

		String screenshotPath = ".\\screenshots\\";
		WebDriver driver;

		String path = ".\\browserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		driver = new ChromeDriver();

		driver.get("https://www.aakruthicollections.com");
		
		//Take screenshot
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//it will takescreenshot and store it into RAM location
		//From RAM location will move to Specific loaction
		FileHandler.copy(f, new File(screenshotPath+"Test"+timeStamp+".PNG"));
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
