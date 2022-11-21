package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Youtube {
	WebDriver driver;
	String appllication="https://www.youtube.com/";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverFiles//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(appllication);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void SearchBox() throws InterruptedException
	{
	WebElement Searchtxt=	driver.findElement(By.name("search_query"));
	Thread.sleep(1000);
	Searchtxt.sendKeys("songs");
	Actions act= new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
	
	}
	
	
	
	
//	@AfterTest
//	public void testdown()
//	{
//		driver.close();
//	}
}


