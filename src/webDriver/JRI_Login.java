package webDriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JRI_Login {

	public static void main(String[] args) throws Exception {

		WebDriver driver;

		String path = ".\\browserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();

		driver.findElement(By.name("txtUserName")).sendKeys("dgowrisetti@gmail.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("123456");

		System.out.println(" Please enter integer values: ");
		System.out.println("********************************");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String captcha = Integer.toString(a);
		Thread.sleep(15000);

		driver.findElement(By.name("txtCaptcha")).sendKeys(captcha);

		driver.findElement(By.id("imgbtnSignin")).click();
		

	}
}
