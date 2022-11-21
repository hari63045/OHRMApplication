package WebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagaram {
public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https:///www.instagram.com");
     By  Instaidl=  By.name("text");
       WebElement Insta =driver.findElement(Instaidl);
       Insta.sendKeys("harik");
	
}
}