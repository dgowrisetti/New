package webDriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JRI_AddMobile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		String path = ".\\browserDrivers\\chromedriver.exe";
				
		System.setProperty("webdriver.chrome.driver", path);
		
		driver = new ChromeDriver();
		
		driver.getTitle();
		driver.manage().window().maximize();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
        	
		
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
		
			
		driver.findElement(By.className("addMobileLink")).click();
		driver.findElement(By.name("txtpopMobileNo")).sendKeys("9940831312");
		Select sp = new Select(driver.findElement(By.id("ddlpopMobileSP")));
		sp.selectByVisibleText("BSNL");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id ='txtpopMobileNickname']")).sendKeys("Deepu");
		
		Select lc = new Select(driver.findElement(By.xpath("//*[@id='ddlpopMobileLocation']")));
		lc.selectByVisibleText("Chennai");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='btnPopupAddMobile']")).click();
		
			
	
	}

}
