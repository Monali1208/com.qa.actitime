package com.qa.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.acti.base.DriverScript;

public class LoginPage extends DriverScript {
	
	@FindBy(id="username")WebElement usernameTb;
	@FindBy(name="pwd")WebElement passwordTb;
	@FindBy(xpath="//a[@id='loginButton' ]")WebElement loginButton;
	@FindBy(xpath="//div[@class='atLogoImg']")WebElement actiLogoImg;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fn_login(String username,String password)
	{
		usernameTb.sendKeys(username);
		passwordTb.sendKeys(password);
		loginButton.click();
	}
	
	public boolean fn_VerifyActiLogo()
	{
		return actiLogoImg.isDisplayed();
	}
	
	public String fn_VerifyLoginPageTitle()
	{
		return driver.getTitle();
	}

	

}
