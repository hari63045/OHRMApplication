package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DomesticAnimals1 {
	@BeforeTest
	public void welcome()
	{
	System.out.println("Wild Animals starts from here BE carefull.....Before Test");	
	}
	@AfterTest
	public void visitagain()
	{
		System.out.println("Thank you.....After Test");	

	}

	@Test(priority=1)
	public void dog() {
		System.out.println("Dog --> DomesticAnimals1 ");
		
	}
	@Test(priority=2)
public void cow() {
	System.out.println("Cow --> DomesticAnimals1 ");
}
}
