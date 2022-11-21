package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tsrtc {
public static void main(String[] args) {
	String application="https://www.tsrtconline.in/oprs-web/";
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(application);
	
		WebElement	hearderBLock=driver.findElement(By.className("menu-wrap"));
		List<WebElement>headerblocklinks=hearderBLock.findElements(By.tagName("a"));
	int headerBlockLinks_Count=	headerblocklinks.size();
	System.out.println("count "+headerBlockLinks_Count);
	
	for(int i=0;i<headerBlockLinks_Count;i++) {
		String headerBlockLinkName=headerblocklinks.get(i).getText();
		System.out.println(i+" "+headerBlockLinkName);
		
		headerblocklinks.get(i).click();
		
	String	webpageTittle = driver.getTitle();
	System.out.println(webpageTittle);
		
		String webpageURL=driver.getCurrentUrl();
		System.out.println(webpageURL);
		
		driver.navigate().back();
		
			hearderBLock=driver.findElement(By.className("menu-wrap"));
		headerblocklinks=hearderBLock.findElements(By.tagName("a"));
			}
	
}
}

package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DateandTime1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		String application="https://www.timeanddate.com/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(application);
	
	//driver.manage().window().maximize();
		
		WebElement worldclock=driver.findElement(By.xpath("//body/div[@id='header__wrapper']/div[@id='header__inner']/nav[@id='nav']/div[1]/div[2]/ul[1]/li[2]/a[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(worldclock).build().perform();
		worldclock.click();
		
		// xpath of first cell = /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		//xpath of last row = /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
	// important for J	// last row last cell =/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		FileInputStream file=new FileInputStream("C:\\Users\\Krish\\Desktop\\dtaeandtime.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet2");
		WebElement webTable =driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/"));
		List<WebElement>tablesRow=driver.findElements(By.tagName("tr"));
		
	Thread.sleep(1000);
		for(int i=0;i<=36;i++) 
		{	
			Row row=sheet.createRow(i);
			List<WebElement>tablesRowofcells=tablesRow.get(i).findElements(By.tagName("tr"));
			for(int j=1;j<=8;j++)
			{
				WebElement webTableElement =driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]"));
				String data =webTableElement.getText();
				Cell cell= row.createCell(j);
				System.out.print(data); // its store in singleline total information
				
			}
			System.out.println();
		}
	}
}
package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DateandTime1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		String application="https://www.timeanddate.com/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(application);
	
	//driver.manage().window().maximize();
		
		WebElement worldclock=driver.findElement(By.xpath("//body/div[@id='header__wrapper']/div[@id='header__inner']/nav[@id='nav']/div[1]/div[2]/ul[1]/li[2]/a[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(worldclock).build().perform();
		worldclock.click();
		
		// xpath of first cell = /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		//xpath of last row = /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
	// important for J	// last row last cell =/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		FileInputStream file=new FileInputStream("C:\\Users\\Krish\\Desktop\\dtaeandtime.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet2");
		WebElement webTable =driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/"));
		List<WebElement>tablesRow=driver.findElements(By.tagName("tr"));
		
	Thread.sleep(1000);
		for(int i=0;i<=36;i++) 
		{	
			Row row=sheet.createRow(i);
			List<WebElement>tablesRowofcells=tablesRow.get(i).findElements(By.tagName("tr"));
			for(int j=1;j<=8;j++)
			{
				WebElement webTableElement =driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]"));
				String data =webTableElement.getText();
				Cell cell= row.createCell(j);
				System.out.print(data); // its store in singleline total information
				
			}
			System.out.println();
		}
	}
}
/*public static void main(String[] args) throws IOException, InterruptedException {
		String application="https://www.timeanddate.com/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(application);
	
	//driver.manage().window().maximize();
		
		WebElement worldclock=driver.findElement(By.xpath("//body/div[@id='header__wrapper']/div[@id='header__inner']/nav[@id='nav']/div[1]/div[2]/ul[1]/li[2]/a[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(worldclock).build().perform();
		worldclock.click();
		
		// xpath of first cell = /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		//xpath of last row = /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
	// important for J	// last row last cell =/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		FileInputStream file=new FileInputStream("C:\\Users\\Krish\\Desktop\\dtaeandtime.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet2");
		WebElement webTable =driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/"));
		List<WebElement>tablesRow=driver.findElements(By.tagName("tr"));
		
	Thread.sleep(1000);
		for(int i=0;i<=36;i++) 
		{	
			Row row=sheet.createRow(i);
			List<WebElement>tablesRowofcells=tablesRow.get(i).findElements(By.tagName("tr"));
			for(int j=1;j<=8;j++)
			{
				WebElement webTableElement =driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]"));
				String data =webTableElement.getText();
				Cell cell= row.createCell(j);
				System.out.print(data); // its store in singleline total information
				
			}
			System.out.println();
		}
	}*/
