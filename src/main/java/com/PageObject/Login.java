package com.PageObject;

import org.openqa.selenium.By;

import com.Report.ExtentLogger;


public final  class Login extends Utilityclass {
	
	
	

	private final By user=By.xpath("//input[@type='text']");
	private final By pass=By.xpath("//input[@id='password']");
	private final By login=By.xpath("//button[@class='login100-form-btn']");
	
	public Login getPassword(String Password) throws Exception{
		sendKeys(pass, Password,"password");
		return this;
		
	}
	public Login getusername(String username) throws Exception {
		 sendKeys(user, username,"username");
		return this;
	}
	public Login getLogin() throws Exception {
		click(login,"login button");
		return this;
	}
	
	
	
	

}
