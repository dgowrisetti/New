package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws Exception {
WebDriver driver;
		
		//Launch Chrome browser
		String path = ".\\browserDrivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		
		//Maximize the current window
		driver.manage().window().maximize();
		//click on CONTINUE TO LOGIN
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Button2")).click();
		
		Thread.sleep(5000);
		//get the text from alert gettext()
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		
		driver.switchTo().alert().accept();//Ok button 
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		
		
		
		
		
	}
}
