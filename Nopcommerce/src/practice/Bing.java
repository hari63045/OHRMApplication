package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing {

	public static void main(String[] args) {
	String application="https://www.bing.com/";
	System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(application);
	
//	String actul_tittle=driver.getTitle();
//	System.out.println("Actual tittle:"+actul_tittle);
	
//	String Expected_tittle="Bing";
//	System.out.println("Expected:"+Expected_tittle);
//	if(actul_tittle.equals(Expected_tittle)) {
//		System.out.println("pass");
//		
//	}
//	else {
//		System.out.println("fail");
//	}
	}
}
