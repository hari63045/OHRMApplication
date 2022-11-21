package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	String appllication="https://echoecho.com/htmlforms10.htm";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverFiles//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(appllication);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void testdown()
	{
		driver.close();
	}
}
