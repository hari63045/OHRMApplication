package com.OHRMApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.OrangeHRMBasetest.BaseTest;

public class Loginpage extends BaseTest {
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	//WebElement username=driver.findElement(By.id("txtUsername"));


	// Object Repository Class
	// Identification of the Element of the Webpage - based on its Properties
	
    @FindBy(id="logInPanelHeading")
    WebElement logInPanelTextE;
    
    @FindBy(id="txtUsername")
    WebElement usernameE;
    
    @FindBy(id="txtPassword")
    WebElement passwordE;
    
    @FindBy(name="Submit")
    WebElement loginbuttonE;
    
    @FindBy(id="divLogo")
    WebElement logoE;
    
 // Business Logics / User Defined Methods to Perform the Operation on the Elements
    
    public void login(String userName, String password)
    {
    	usernameE.sendKeys(userName);
    	passwordE.sendKeys(password);
    }
    
    public void loginPannelValidation() {
    	
     	String loginpanel_expected="LOGIN Panel";
    	String loginpanel_Actual=logInPanelTextE.getText();
    	
//    	if(loginpanel_expected.equals(loginpanel_Actual))
//    	{
//    		System.out.println("pass");
//    	}
//    	else
//    	{
//    		System.out.println("fail");
//    	}
    	
    	Assert.assertEquals(loginpanel_Actual, loginpanel_expected, "loginPannel not matched");

    }
    
    public void logoValidation()
    {
   	
    boolean	flag=logoE.isDisplayed();
   
    }
    
    public void tittleValidation() {
    	String expected_Tittle="OrangeHRM";
    	String	Actual_Tittle=driver.getTitle();
    	
    	Assert.assertEquals(expected_Tittle, Actual_Tittle, "Tittle not matched");
    	
    }
    
    public void urlAddress() {
     String expected_urlAddress="orangehrm-4.2.0.1";
     String actual_urlAddress=driver.getCurrentUrl();

    // Assert.assertTrue(true, actual_urlAddress.contains("expected_urlAddress");
     Assert.assertTrue(actual_urlAddress.contains(expected_urlAddress));
    }
    
    
    
    
}
