package practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Osmania {
public static void main(String[] args) throws IOException {
	
		String application="https://www.osmania.ac.in/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(application);
	driver.manage().window().maximize();
	WebElement selectLanguageDropDownList = driver.findElement(By.xpath("//select[@id='gtranslate_selector']"));

	
List<WebElement> selectlanguagetype=selectLanguageDropDownList.findElements(By.tagName("option"));

	int selectlanguage_count= selectlanguagetype.size();
	System.out.println("count"+selectlanguage_count);
	
	for(int i=0;i<selectlanguage_count;i++) {
		
		String LanguageList=selectlanguagetype.get(i).getText();
		System.out.println(i+"  "+LanguageList);
		
		selectlanguagetype.get(i).click();
		//selectlanguagetype.get(6).click();
		File bringScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bringScreenshot, new File("C:\\Users\\Krish\\Pictures\\venni.jpg"));
	}
}

}
//select[@id='gtranslate_selector']