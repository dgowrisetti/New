package practice_test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		WebDriver driver;
		
		String Path = ".\\browserDrivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", Path);
		driver = new ChromeDriver();
		
		driver.get("https://www.aakruthicollections.com/");
		
		driver.manage().window().maximize();*/
		
	
		WebDriver driver;
		
		String path = ".\\browserDrivers\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver", path);
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Select month = new Select(driver.findElement(By.id("month")));
		
		month.selectByVisibleText("Feb");
		
		Select dd = new Select(driver.findElement(By.id("day")));
		dd.selectByVisibleText("26");
		
	    driver.quit();
	
		
	    
	}

}
