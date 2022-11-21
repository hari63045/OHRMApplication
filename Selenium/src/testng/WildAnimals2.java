package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WildAnimals2 {
	@BeforeMethod
	public void welcome()
	{
	System.out.println("Welcome too WildAnimals2.....Before Method");	
	}
	@AfterMethod
	public void visitagain()
	{
		System.out.println("Thank you.....After Method");	

	}
	@Test(priority=2)
	public void cat()
	{
		System.out.println("Cat --> DomesticAnimals2 ");
	}
	@Test(priority=1)
	public void hen()
	{
		System.out.println("Hen --> DomesticAnimals2 ");
	}

}
