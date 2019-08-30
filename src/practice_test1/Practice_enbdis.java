package practice_test1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_enbdis {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver;
        Scanner scan = new Scanner(System.in);
		String path = ".\\browserDrivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		driver = new ChromeDriver();

		driver.getTitle();

		driver.get("https://www.seleniumeasy.com/test/generate-file-to-download-demo.html");

		driver.manage().window().maximize();

		// driver.getTitle();

		if (driver.findElement(By.id("create")).isEnabled()) {
			System.out.println("Button is Enabled");
		} else {
			System.out.println("Button is disabled!! To enable enter text in the above textbox");
			System.out.println("Please enter the text to the edit box");
			String text = scan.next();
			driver.findElement(By.id("textbox")).sendKeys(text);
			
		}
		if (driver.findElement(By.id("create")).isEnabled()) {
			System.out.println("Button is Enabled***");
		} else {
			System.out.println("Button is disabled!! To enable enter text in the above textbox");
		
			
		}
		
		// I want a input or a console window to take my input

		Thread.sleep(2000);

		// driver.findElement(By.id("create")).click();
		driver.findElement(By.xpath("//*[@id='create']")).click();
		// driver.findElement(By.partialLinkText("downl")).click();
		driver.findElement(By.id("link-to-download")).click();

	}

}
