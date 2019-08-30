package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class Toyota_Sample {
	public static void main(String[] args) {
		WebDriver driver;

		// Launch Chrome browser
		String path = ".\\browserDrivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		//clear the chache
		//driver.manage().deleteAllCookies();

		// Open URL
		driver.get("https://www.toyota.co.uk/order-a-brochure");
		// Maximize the current window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("tgbgdpr-overlay-accept")).click();
	
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.switchTo().defaultContent();
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are: " + numberOfFrames);
		
		//move to defalut frame
		driver.switchTo().defaultContent();
		//move to element frame
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("(//*[contains(text(),'Download')])[1]")).click();

	}
	
	
}
