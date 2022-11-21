package WebDriverExamples;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
public WebDriver driver;
public void lunchbrowser() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 driver = new ChromeDriver();
}
public void openUrl(String url) {
	driver.get(url);
}
public WebElement setTextInGoogleSearchBox(String searchText) {
By googleSearchBoxL=By.name("q");
WebElement googleSearchBox =	driver.findElement(googleSearchBoxL);
googleSearchBox.sendKeys(searchText);
return googleSearchBox;
}

public void selectThirdOptionAndHitEnterKey(WebElement googleSearchBox) throws InterruptedException	{
	int i;
	for(i=1;i<=3;i++) {
		Thread.sleep(3000);
		
	}
	Thread.sleep(3000);
	googleSearchBox.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);

}
googleSearchBox.sendkeys(keys.ENTER);

}
