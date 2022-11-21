package Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_com {
	public static void main(String[] args) throws InterruptedException {
		String application="https://register.rediff.com/register/register.php?FormName=user_details";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(application);
		////*[@id="tblcrtac"]/tbody/tr[3]/td[3]/input//div
		///html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input//div
	//WebElement fullNamePath=	driver.findElement(By.linkText("Full Name"));
	Thread.sleep(1000);	
	WebElement nameFiled=driver.findElement(By.xpath("//*[starts-with(@name,'name')]"));
		nameFiled.sendKeys("Harikrishna");
	}
}
