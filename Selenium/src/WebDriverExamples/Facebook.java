package WebDriverExamples;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
	
		By facebookTxboxl	= By.name("email");
			WebElement facebook	=driver.findElement(facebookTxboxl);
			facebook.sendKeys("8185977091");
			
		By FbPasswordl=	By.id("pass");
		WebElement Fbpass	=driver.findElement(FbPasswordl);
  Fbpass.sendKeys("jhgsjsd");
  
  By LoginL = By.name("//button[text()='Log in']");
  		WebElement Login=driver.findElement(LoginL);
  		Login.click();	

	    
}
}