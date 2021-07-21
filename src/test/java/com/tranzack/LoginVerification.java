package com.tranzack;

import org.testng.annotations.Test;

import com.NewframeWork.Newframework.BaseTest;
import com.PageObject.Login;

import dataProvaider.DataprovaiderTestData;

public class LoginVerification extends BaseTest {
	
	private LoginVerification() {
		
	}
	
	@Test(testName="Verifayed login page",dataProvider = "Tranzacklogin",dataProviderClass = DataprovaiderTestData.class,description="Verifayed the login page in valid data" ) 
	public void loginTranzack(String Username,String password) throws Exception {
		Login l=new Login();
		l.getusername(Username);
		l.getPassword(password);
		
		Thread.sleep(3000);
		
	}
	
	
}
