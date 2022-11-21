
3package screenst;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void takePicture(WebDriver driver,String image) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://in.bookmyshow.com/");
		System.out.println("livetech");
		TakesScreenshot ts=(TakesScreenshot)driver1;	
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Krish\\Pictures\\Saved Pictures"));
System.out.println("Amazon");
	}

}
