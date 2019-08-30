package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {
	public static void main(String[] args) throws Exception {
		WebDriver driver;

		// Launch Chrome browser
		String path = ".\\browserDrivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();

		// Open URL
		driver.get("https://www.facebook.com/");

		// Maximize the current window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Validate Login button is displayed or not?
		if (driver.findElement(By.id("loginbutton")).isDisplayed()) {
			if (driver.findElement(By.id("loginbutton")).isEnabled()) {
				driver.findElement(By.id("loginbutton")).click();
			} // isenabled
			else {
				System.out.println("Element is disable state, please check*****");
			}

		} // isdisplayed
		else {
			System.out.println("Element is not displayed, please check*****");
		}

	}

}
