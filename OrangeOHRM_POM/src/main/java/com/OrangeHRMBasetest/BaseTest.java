package com.OrangeHRMBasetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	
	public String Application=" ";
	public WebDriver driver;
	
	@BeforeMethod
	public void Browser()
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Application);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@AfterMethod
	public void closeBroser()
	{
		driver.quit();
	}
		

	}
