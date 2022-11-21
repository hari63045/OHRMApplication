package WebDriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class webDriverMethodsTest {
	WebDriver driver;
	public void lunchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	public void openUrl(String url) {
		driver.get(url);
	}
	
	WebElement alertBtn;
	public void clickOnAlertPageButtons(String alertBtnText) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	By alertBtnL =	By.xpath("[contains(text(),'"+alertBtnText+"')]");
    alertBtn=driver.findElement(alertBtnL);
    alertBtn.click();
    Thread.sleep(3000);
	}
     public void handleConfrimAlertBox() throws InterruptedException {
    	 this.clickOnAlertPageButtons("Alert with Textbox ");
 		this.clickOnAlertPageButtons("click the button to demonstrate the prompt box ");	
 		Alert hello=driver.switchTo().alert();
 		System.out.println("Alert Confrim Msg :"+hello.getText());
	    Thread.sleep(3000);
	    hello.accept();
	By alertMsg1L=    By.id("demo");
	WebElement alertMsg1=driver.findElement(alertMsg1L);
	Assert.assertTrue(alertMsg1.getText().equals("You pressed Ok"), "Test script Failed as expected msg not displayed");
	    

}
public static void main(String[] args) throws InterruptedException {
	webDriverMethodsTest obj=new webDriverMethodsTest();
	obj.lunchbrowser();
	obj.openUrl("https://demo.automationtesting.in/Alerts.html");
	obj.handleConfrimAlertBox();
	
}
}
