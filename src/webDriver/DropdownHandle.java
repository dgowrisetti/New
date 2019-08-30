package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) {
		WebDriver driver;

		// Launch Chrome browser
		String path = ".\\browserDrivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();

		// Open URL
		driver.get("https://www.facebook.com/");

		// Maximize the current window
		driver.manage().window().maximize();
		
		//Dropdown handle
		//1. identify the Tagname is select or not, if select 
		//2. find the locator and which optional value you want to click
		
		Select dd = new Select(driver.findElement(By.id("month")));
		//dd.selectByVisibleText("Mar");
		dd.selectByIndex(5);
		dd.selectByValue("3");
		
		//new Select(driver.findElement(By.id("month"))).selectByVisibleText("Mar");
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByVisibleText("25");
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2012");

	}

}
