package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DomesticAnimals2 {
	@BeforeClass
	public void welcome()
	{
	System.out.println("Domestic Animals 2 starts from here.....Before Class");	
	}
	@AfterClass
	public void visitagain()
	{
		System.out.println("Thank you.....After Class");	

	}
	
     @Test(priority=2)
	public void cat() {
		System.out.println("cat");
		
	}
	@Test(priority=1)
	public void hen()
	{
		System.out.println("Hen --> DomesticAnimals2 ");
	}
}
