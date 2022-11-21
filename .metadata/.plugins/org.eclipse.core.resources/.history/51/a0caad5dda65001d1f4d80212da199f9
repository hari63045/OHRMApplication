
package com.OHRM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	
	public String application ="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	public WebDriver driver;
	public FileInputStream file;
	public XSSFWorkbook workBook;
	public XSSFSheet workBooksheet;

	
	@BeforeTest
	public void browserpage() throws IOException
	{
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get(application);
		  
		  
		  
	}
	
	
	@AfterTest
	public void closebrowser() {
		//driver.quit();
		
	}

}

