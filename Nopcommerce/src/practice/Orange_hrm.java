package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_hrm {

	public static void main(String[] args) {
		String application="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(application);		
		
	     String	Title=driver.getTitle();
		System.out.println("tittle"+Title);
		
		String currentURL=driver.getCurrentUrl();
		System.out.println("current url"+currentURL);
		
	WebElement userNameTxtBox=	driver.findElement(By.name("username"));
	userNameTxtBox.sendKeys("admin");
	
	WebElement PasswordTxtBox=driver.findElement(By.name("password"));
	PasswordTxtBox.sendKeys("admin23");
	
	WebElement  LoginButton =driver.findElement(By.xpath(" Login "));
	LoginButton.click(); 
	
	}
}
