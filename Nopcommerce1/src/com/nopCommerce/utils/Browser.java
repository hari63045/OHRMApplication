package com.nopCommerce.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	private static WebDriver driver;

	public static void lunchBrowser(String browsername,String drivername, String driverpath) {
		System.setProperty(drivername, driverpath);
		if(browsername.equals("chrome")) 
		{
				driver=new ChromeDriver();
		}
		else 
		{
			driver=new EdgeDriver();
			
		}
	}
	public static void openURL(String URL) {
		driver.get(URL);
	}
	
}
