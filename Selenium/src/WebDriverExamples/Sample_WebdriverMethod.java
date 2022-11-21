package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_WebdriverMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	
	By googleSearchBoxL=By.name("q");
	WebElement googleSearchBox =	driver.findElement(googleSearchBoxL);
	googleSearchBox.sendKeys("Selenium");
	
	Thread.sleep(3000);
	for(int i=1;i<=3;i++) {
		googleSearchBox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
	    }
	
	googleSearchBox.sendKeys(Keys.ENTER);
	}
}
