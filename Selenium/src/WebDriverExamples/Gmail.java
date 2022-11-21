package WebDriverExamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
	By emailTxtBoxL =	By.id("identifierId");
	WebElement emailTxtBox =	driver.findElement(emailTxtBoxL);
	emailTxtBox.sendKeys("harikrishna555");
	System.out.println(emailTxtBox);
   // By nextPathl=By.xpath("//span[text()='next']");
	//WebElement nextPath=driver.findElement(nextPathl);
	TakesScreenshot ts=(TakesScreenshot)driver;	
	File f=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\Krish\\Pictures\\venni.jpg"));
	System.out.println("livetech");
	driver.close();
	//nextPath.click();
	
	}

}

    