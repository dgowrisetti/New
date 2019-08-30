package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected_sample{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		
		String path = ".\\browserDrivers\\chromedriver.exe";
				
		System.setProperty("webdriver.chrome.driver", path);
		
		driver = new ChromeDriver();
		
		driver.getTitle();
		driver.manage().window().maximize();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
        	
		
		//driver.findElement(By.name("txtUserName")).sendKeys("dgowrisetti@gmail.com");
		//driver.findElement(By.name("txtPasswd")).sendKeys("123456");
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(5000);
		
		
		
		if (driver.findElement(By.id("checkbox1")).isSelected()) {
			System.out.println("The Checkbox is selected by default");
		} else {
			System.out.println("The Checkbox is NOT selected by default");

		}
		    driver.findElement(By.id("checkbox1")).click();
		    Thread.sleep(5000);
			
			
			
			if (driver.findElement(By.id("checkbox1")).isSelected()) {
				System.out.println("The Checkbox is selected by default :-)");
			} else {
				System.out.println("The Checkbox is NOT selected by default");

			}
		
		
	}
	
	

}
