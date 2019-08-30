package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	// Launh chrome browser
	// Type URL
	// Type UN & PWD
	// click on Login button

	public static void main(String[] args) {

		// Create a Webdriver Object/Reference
		WebDriver driver;
		
		//Launch Chrome browser
		String path = ".\\browserDrivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.facebook.com/");
		
		
		//Maximize the current window
		driver.manage().window().maximize();
		
		
		//type UN

		//driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
		driver.findElement(By.xpath("html/body/div/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test123");
		driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.xpath("//*[@name='signup_name']")).sendKeys("Deepak");
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("asdfs");
		
		
		

	}

}
