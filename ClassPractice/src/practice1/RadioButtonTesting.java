package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonTesting extends BaseTest {

	@Test
	public void radioButtonTesting() {
WebElement radioButtonTable=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));

	//<input type="radio" name="group1" value="Milk">	
	//<input type="radio" name="group1" value="Butter" checked="">
	//<input type="radio" name="group1" value="Cheese">
	List<WebElement> radiobutton=driver.findElements(By.name("group1"));
	List<WebElement>radioButtonGroup2=driver.findElements(By.name("group2"));
	
	System.out.println("no of buttons" +radiobutton.size());
	
	for(int i=0;i<radiobutton.size();i++) 
	{
		radiobutton.get(i).click();
		for(int j=0;j<radiobutton.size();j++)
		{
			System.out.println( radiobutton.get(j).getAttribute("value")+" "+radiobutton.get(j).getAttribute("checked"));
		}
		System.out.println();
	}
	
	for(int i=0;i<radioButtonGroup2.size();i++) {
		radioButtonGroup2.get(i).click();
		for(int j=0;j<radioButtonGroup2.size();j++) {
			System.out.println(radioButtonGroup2.get(j).getAttribute("value")+ "  "+radioButtonGroup2.get(j).getAttribute("checked"));
		}
		System.out.println();
		
	}
	}
	
}
