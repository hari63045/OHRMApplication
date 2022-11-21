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

public class Jqueryui_com {
	public static void main(String[] args) throws InterruptedException, IOException {
		String application="https://jqueryui.com/droppable/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(application);
		
	WebElement webpageFrame =	driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(webpageFrame);
		System.out.println("Identify the frame of webpage");
		
	WebElement DragElement=	driver.findElement(By.id("draggable"));
	System.out.println("Identify the dragElement");
	
	WebElement dropHereElement =driver.findElement(By.id("droppable"));
	System.out.println("Identify the dropElement");
	Actions act=new Actions(driver);
	
	//perform drag and drop operation
	act.dragAndDrop(DragElement, dropHereElement).build().perform();
	
	driver.switchTo().defaultContent(); //switching to back actual page

	WebElement resizableElement=driver.findElement(By.linkText("Resizable"));
	
	String resizableTitle=driver.getTitle();
	resizableElement.click();
	System.out.println("resizableTitle Actual:"+resizableTitle);
	
//	File screenshotAs_resizableTitle=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(screenshotAs_resizableTitle, new File("C:\\Users\\Krish\\Pictures\\resizableTitle.jpg"));
//	Thread.sleep(1000);
	
	driver.navigate().forward();
	driver.get("https://www.osmania.ac.in/");
	//driver.quit();
	}

}
