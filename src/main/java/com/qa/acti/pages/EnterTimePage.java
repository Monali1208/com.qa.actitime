package com.qa.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.acti.base.DriverScript;

public class EnterTimePage extends DriverScript {
	
	@FindBy(id="logoutLink")WebElement logoutLink;
	
	public EnterTimePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fn_logout()
	{
		logoutLink.click();
	}

}
