package practice_test1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AakruthiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       WebDriver driver;
       
       String path = ".\\browserDrivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
       
        driver = new ChromeDriver();
        
        driver.get("https://www.aakruthicollections.com");

        driver.getTitle();
        
        driver.manage().window().maximize();
        
    
        //String parentwindow = driver.getWindowHandle();
        //System.out.println("Parentwidow: "+parentwindow);
       
       // driver.findElement(By.xpath("//*[@class = 'site-nav__label']")).click();
        
        driver.findElement(By.partialLinkText("All")).click();
        

        
       
       
        
        
	}

}
