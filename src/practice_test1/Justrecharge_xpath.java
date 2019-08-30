package practice_test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Justrecharge_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
       String path = ".\\browserDrivers\\chromedriver.exe";
       
       System.setProperty("webdriver.chrome.driver", path);
       
       driver = new ChromeDriver();
       
       driver.get("https://www.justrechargeit.com/SignUp.aspx");
       
       //driver.quit();"
       
        driver.manage().window().maximize();
        
        //driver.findElement(By.xpath("//*[@type='text']")).click();
        
      //*[@id="signup_name"]
       
	
	driver.findElement(By.xpath("//*[@id='signup_name']")).click();
	driver.findElement(By.xpath("//*[@id='signup_name']")).sendKeys("Deepak");
	driver.findElement(By.xpath("//*[@name='signup_mobileno']")).sendKeys("9940118755");
	driver.findElement(By.xpath("//*[@type='text' and @maxlength='75']")).sendKeys("dgowrisetti@gmail.com");
	driver.findElement(By.xpath("(//*[@type='password' and @maxlength='6'])[1]")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id = 'checkbox']")).click();
	driver.findElement(By.xpath("//*[@id = 'checkbox1']")).click();
	//driver.findElement(By.xpath("//*[@id='imgbtnSubmit']")).click();
	
	
	
	//*[@id="imgbtnSubmit"]
	
	
	//*[@id="signup_password"]
	
}
}
//*[@id="signup_name"]