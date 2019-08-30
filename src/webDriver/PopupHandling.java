package webDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws Exception {

		WebDriver driver;

		String path = ".\\browserDrivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();

		// Open URL
		driver.get("https://retail.onlinesbi.com/retail/login.htm");

		// Maximize the current window
		driver.manage().window().maximize();
		// click on CONTINUE TO LOGIN
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(5000);
		//Get the title of parent window
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent Window: "+parentwindow );
		
		// click on Forgot account link
		driver.findElement(By.linkText("Forgot Login Password")).click();

		Thread.sleep(5000);
		
		//Popup handle
		Set<String> s = driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		
		while (i.hasNext()) {
			String childWindow = i.next();
			System.out.println("childWindow : "+childWindow);
			if (!parentwindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				Thread.sleep(3000);
			
				//close  the child window
				driver.close();
			}
			
		}
		//Move cursor to parent window
		driver.switchTo().window(parentwindow);
		//click on Login button on parent window to confirm whether parent window
		Thread.sleep(5000);
		driver.findElement(By.id("Button2")).click();		
		

	}
}
