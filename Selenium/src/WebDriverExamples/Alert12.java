package WebDriverExamples;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dev.failsafe.internal.util.Assert;
public class Alert12 extends WebDriverMethods  {
	
	WebElement alertBtn;
	public void clickonalertpagebutton(String alertBtnText) throws InterruptedException {
	By	alertBtnL	=By.xpath("//*[contains(text(),'"+alertBtnText+"')]");
		
	alertBtn=driver.findElement(alertBtnL);
	 alertBtn.click();
	    Thread.sleep(3000);	
	}
	public void handleConfrimAlertBox() throws InterruptedException
	{
		this.clickonalertpagebutton("Alert with OK & Cancel");
		this.clickonalertpagebutton("click the button to display a confirm box");
	Alert altmessage =	driver.switchTo().alert();
	System.out.println("Alert Confrim Msg :"+altmessage.getText());
	Thread.sleep(3000);
	altmessage.accept();
	By alertMsg1L=By.id("demo");
	WebElement alertMsg1=driver.findElement(alertMsg1L);
	Assert.assertTrue(alertMsg1.getText().equals("You pressed Ok"),"Test script Failed as expected msg not displayed");	
}

public void handlePromptAlertBox() throws InterruptedException
{
	this.clickonalertpagebutton("Alert with Textbox ");
	this.clickonalertpagebutton("click the button to demonstrate the prompt box ");
	Alert alert=driver.switchTo().alert();
	System.out.println("Alert Confrim Msg : "+alert.getText());
    Thread.sleep(3000);
    alert.sendKeys("Livetech");
    alert.accept();
    Thread.sleep(3000);
    By alertMsg1L=By.id("demo1");
	WebElement alertMsg1=driver.findElement(alertMsg1L);
	String actualData=alertMsg1.getText();
	System.out.println(actualData);
	boolean status=actualData.contains("Livetech");
	Assert.assertTrue(status,"Test script failed as Entred text is not visible");	
	}
	

}
