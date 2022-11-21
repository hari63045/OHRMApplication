package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) throws IOException, InterruptedException {
		String application="https://www.timeanddate.com/worldclock/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(application);
	
	//driver.manage().window().maximize();
		
//		WebElement worldclock=driver.findElement(By.xpath("//body/div[@id='header__wrapper']/div[@id='header__inner']/nav[@id='nav']/div[1]/div[2]/ul[1]/li[2]/a[1]"));
//		Actions action = new Actions(driver);
//		action.moveToElement(worldclock).build().perform();
//		worldclock.click();
		
		// xpath of first cell = /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		//xpath of last row = /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
	// important for J	// last row last cell =/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		WebElement webTable =driver.findElement(By.xpath("/html/body/div[5]/section[1]/div"));

		FileInputStream file=new FileInputStream("C:\\Users\\Krish\\Desktop\\dtaeandtime.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet2");
		List<WebElement>tablesRows=webTable.findElements(By.tagName("tr"));
		
	Thread.sleep(1000);
		for(int i=0;i<tablesRows.size();i++) 
		{	
			Row row=sheet.createRow(i);
			List<WebElement>tablesRowofcells=tablesRows.get(i).findElements(By.tagName("tr"));
			
			for(int j=1;j<tablesRowofcells.size();j++)
			{
				Cell cell= row.createCell(j);

				String tabledata =tablesRowofcells.get(j).getText();
				cell.setCellValue(tabledata);
				System.out.print(tabledata);
				FileOutputStream file2=new FileOutputStream("C:\\Users\\Krish\\Desktop\\dtaeandtime.xlsx");
						workBook.write(file2)	;
						
			}
			System.out.println();
		}
		driver.close();
	}
}
