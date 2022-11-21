package Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		String application="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(application);
		
	WebElement userNameTxtBox =	driver.findElement(By.id("txtUsername"));
	userNameTxtBox.sendKeys("HAri63045");
	
	WebElement passwordTxtBox=driver.findElement(By.id("txtPassword"));
	passwordTxtBox.sendKeys("Hari@63045");
		
	WebElement loginButton=driver.findElement(By.name("Submit"));
	loginButton.click();
	
	WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
	Actions act=new Actions(driver);
	act.moveToElement(pim).build().perform();
	pim.click();
	
	WebElement addemployee= driver.findElement(By.id("menu_pim_addEmployee"));
	addemployee.click();
	
	WebElement firstNameBox=driver.findElement(By.name("firstName"));
	firstNameBox.sendKeys("sri");
	
	//Actions act=new Actions(driver);
	act.sendKeys(Keys.TAB).build().perform();
	act.sendKeys("rama").build().perform();
	
	act.sendKeys(Keys.TAB).build().perform();
	act.sendKeys("krishna").build().perform();
	
	WebElement employeeId=driver.findElement(By.name("employeeId"));
	employeeId.getAttribute("employeeId");
	System.out.println(employeeId);
	
	
//	
//	WebElement photoUpload=driver.findElement(By.id("file-upload-button"));
//	photoUpload.click();
//	
//	Runtime.getRuntime().exec("C:\\Users\\Krish\\Desktop\\image.au3");
	
	act.sendKeys(Keys.TAB).build().perform();
	act.sendKeys(Keys.TAB).build().perform();
	
	WebElement saveButton = driver.findElement(By.id("btnSave"));
	saveButton.click();
	
	}

	}
	

