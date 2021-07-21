package com.tranzack;

import java.util.Map;

import org.testng.annotations.Test;

import com.NewframeWork.Newframework.BaseTest;
import com.PageObject.Login;

import excelUtiles.DataprovaiderUtiles;

public class LohinTest extends BaseTest {


	private LohinTest() {
		
	}

@Test(dataProvider = "getData",dataProviderClass = DataprovaiderUtiles.class)
public void loginTest(Map<String,String> data) throws Exception {
	Login l=new Login();
	l.getusername(data.get("Username")).getPassword(data.get("password"));
	
	Thread.sleep(3000);
}




}
