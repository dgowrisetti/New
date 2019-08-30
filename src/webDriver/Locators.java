package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		// Create a Webdriver Object/Reference
		WebDriver driver;

		// Launch Chrome browser
		String path = ".\\browserDrivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();

		// Open URL
		driver.get("https://www.facebook.com/");

		// Maximize the current window
		driver.manage().window().maximize();

		//Link text
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.partialLinkText("?")).click();
		
		
		//to close current window
		//driver.close();
		//close all the related windows
		driver.quit();
		
	}

}
