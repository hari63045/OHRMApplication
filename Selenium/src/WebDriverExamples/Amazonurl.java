..........................................................................................................................................................................................................................................................................................................................package WebDriverExamples;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonurl {
	public static void main(String[] args) throws IOException {
		String ExpectedTitle="Amazon";
		System.out.println(ExpectedTitle);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http//amazon.in");
		 String actualTitle=driver.getTitle();
		    System.out.println(actualTitle);
		    if(actualTitle.equals(ExpectedTitle)) {
		    	System.out.println("Test script Pass");
		    }
		    else {
		    	System.out.println("Test script failed");
		    driver.close();
		    }
		    
		    
		    
		    //Assignment
		    //amazon,flipkart
		    //Verify URL:  getCurrentURL()
		
	}

}
