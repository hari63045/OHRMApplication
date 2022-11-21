+

package practice1;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;ss
import org.testng.annotations.Test;

public class New {
	Logger log = Logger.getLogger(LogInTest.class);

	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	@BeforeTest
	public void orangeHRMApplicationLaunch()
	{
	PropertyConfigurator.configure("Log4j.properties");

	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	 
	driver = new ChromeDriver();
	// System.out.println(" Chrome Browser Opened Successfully");
	log.info("Chrome Browser Opened Successfully");

	driver.get(applicationUrlAddress);
	//System.out.println(" Naviagted to OrangeHRM Application Successfully  ");

	log.info("Naviagted to OrangeHRM Application Successfully");

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}


	@Test(priority=1)
	public void logInTest()
	{
	WebElement userName=driver.findElement(By.id("txtUsername"));
	userName.clear();
	userName.sendKeys("srini");

	//System.out.println(" Entered UserName Successfully ");
	log.info("Entered UserName Successfully");

	WebElement password=driver.findElement(By.name("txtPassword"));
	password.clear();
	password.sendKeys("Q@Trainer7");

	//System.out.println(" Entered Password Successfully ");
	log.info("Entered Password Successfully");

	WebElement logInButton=driver.findElement(By.className("button"));
	logInButton.click();

	//System.out.println(" Clicked on LogIn Button Successfully ");
	log.info("Clicked on LogIn Button Successfully");

	}

	@Test(priority=2)
	public void welComeAdminTest() throws InterruptedException
	{
	WebElement welComeAdminElement=driver.findElement(By.id("welcome"));
	welComeAdminElement.click();

	//System.out.println(" Clicked on WelCome Addmin link ");
	log.info("Clicked on WelCome Admin link");
	// Thread.sleep(10000);

	}

	@Test(priority=3)
	public void logOutTest() throws InterruptedException
	{

	WebElement logOut=driver.findElement(By.linkText("Logout"));
	logOut.click();

	//System.out.println(" Successfully LogOut from the Application ");
	log.info("Successfully LogOut from the Application");
	}

	@AfterTest
	public void OrangeHRMApplicationClose()
	{
	driver.close();

	//System.out.println(" OrangeHRM Application Closed Successfully ");
	log.info("OrangeHRM Application Closed Successfully");
	}

}
