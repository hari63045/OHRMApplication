package com.OrangeHRMClassTest;

import org.testng.annotations.Test;

import com.OHRMApplicationPages.Loginpage;

public class LoginpageTest extends Loginpage {

	Loginpage loginobject= new Loginpage();
	
	@Test(priority=1)
	public void loginTest ()
	{
		loginobject.login("HAri63045", "Hari@63045");
		
	}
	
	@Test(priority=2)
	public void loginPannelValidationTest()
	{
		loginobject.loginPannelValidation();
	}
	
	@Test(priority=3)
	public void logoValidationTest()
	{
		loginobject.logoValidation();
	}
	
	@Test(priority=4)
	public void tittleValidationTest()
	{
		loginobject.tittleValidation();
	}
	
	@Test(priority=5)
	public void urlAddressTest()
	{
		loginobject.urlAddress();
	}
}
