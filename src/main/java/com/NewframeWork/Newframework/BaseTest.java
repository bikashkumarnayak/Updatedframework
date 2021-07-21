package com.NewframeWork.Newframework;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Driver.Driver;
import com.Report.ExtentReport;
import com.aventstack.extentreports.ExtentReports;

public class BaseTest {
	
	protected BaseTest() {
		
	}  
	@BeforeMethod
	protected void setUP() throws Exception {
		
		Driver.initDriver();
		
	}
	
	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();
	}

}
