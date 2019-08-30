package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbrowserLaunch {
	public static void main(String[] args) {

		// Create a Webdriver Object/Reference
		WebDriver driver;

		// Launch IE browserIEDriverServer
		String path = ".\\browserDrivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", path);
		driver = new InternetExplorerDriver();

		// Open URL
		driver.get("https://www.facebook.com/");

		// Maximize the current window
		driver.manage().window().maximize();

		// type UN

		driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test123");
		driver.findElement(By.id("loginbutton")).click();

	}

}
