package com.nopCommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.nopCommerce.utils.ReadData;

public class loginPage {
	private WebDriver  driver;
	
private void setEmail(String email) throws Exception {
	String emailLocator = ReadData.getLoactor("loginpage", "email");
	By emailTxtBoxl=By.xpath(emailLocator);
	WebElement emailTxtBox=driver.findElement(emailTxtBoxl);
	emailTxtBox.sendKeys(email);
}
private void password(String password) throws Exception {
	String passwordLocator = ReadData.getLoactor("loginpage", "passwordbox");
	By passwordTxtBoxl=By.xpath(passwordLocator);
	WebElement passwordTxtBox=driver.findElement(passwordTxtBoxl);
	passwordTxtBox.sendKeys(password);
}
private void clickLoginButton() throws Exception {
	String loginButtonL = ReadData.getLoactor("loginpage", "login");
	By loginBtnL=By.xpath(loginButtonL);
	WebElement loginBtn=driver.findElement(loginBtnL);
	loginBtn.click();
}
public void nopCommerceLogin(String email, String pass) throws Exception {
	Reporter.log("nopCommerce login method Execution started");
	this.setEmail(email);
	this.password(pass);
	this.clickLoginButton();
	Reporter.log("nopCommerce login page login button clicked");
}
private String  getWelcomeTittle () throws Exception {
	String welcomeTittleLocator = ReadData.getLoactor("loginpage", "welocme");
	By welcomeTittleL=By.xpath(welcomeTittleLocator);
	WebElement welcomeTittle=driver.findElement(welcomeTittleL);
	return welcomeTittle.getText();
}
private String  getInvalidLoginErrorMsg () throws Exception {
	String invalidLoginMsgLocator = ReadData.getLoactor("loginpage", "welocme");
	By loginInvalidErrorMsgL=By.xpath(invalidLoginMsgLocator);
	WebElement loginInvalidErrorMsg=driver.findElement(loginInvalidErrorMsgL);
	return loginInvalidErrorMsg.getText();
}

}
