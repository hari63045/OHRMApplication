package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DateandTime {
	public static void main(String[] args) throws IOException, InterruptedException {
		String application="https://www.timeanddate.com/worldclock/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(application);
		driver.manage().window().maximize();
		
	
		
		// 	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		// xpath of first cell = /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		//xpath of last row = /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
		
		FileInputStream file=new FileInputStream("C:\\Users\\Krish\\Desktop\\dtaeandtime.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
	   XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		Thread.sleep(1000);
		for(int i=1;i<=36;i++)
		{
			WebElement firstRowElement=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]/a"));
			String cityName=firstRowElement.getText();
			System.out.println(cityName);
				Row row=sheet.createRow(i);
		        Cell cell=row.createCell(0);
		     	cell.setCellValue(cityName);
			
			System.out.println(cityName);
			FileOutputStream file1=new FileOutputStream("C:\\Users\\Krish\\Desktop\\dtaeandtime.xlsx");
			workBook.write(file1);
					
		}

	}

}
