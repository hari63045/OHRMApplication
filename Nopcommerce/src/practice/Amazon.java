package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	/*public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
*/
	
	public static void main(String[] args) throws InterruptedException, IOException {
		String application="https://www.amazon.in/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(application);
     
     Thread.sleep(1000);
    
   WebElement signinXpathL=  driver.findElement(By.id("nav-link-accountList"));
   Actions action=new Actions(driver);
   action.moveToElement(signinXpathL).build().perform();
   
 WebElement your_Orders=  driver.findElement(By.linkText("Your Orders"));
 your_Orders.click();
 
 //File takeScreenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 //	FileUtils.copyDirectory(takeScreenshot, new File("C:\\Users\\Krish\\Pictures\\venni.jpg"));
 
// driver.close();

	}

}
