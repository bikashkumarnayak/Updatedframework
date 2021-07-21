package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.Driver.DriverManager;
import com.google.common.util.concurrent.Uninterruptibles;

public class Tranzackloginpage {

	private final By togel=By.xpath("//i[@class='icon-menu']");
	private final By clkservice=By.xpath("//body/div[2]/div[1]/div[1]/div[2]/ul[1]/li[11]/a[1]/i[1]");
	private final By logout=By.xpath("//body/div[2]/div[1]/div[1]/div[2]/ul[1]/li[11]/ul[1]/li[2]/a[1]");
	
	public Tranzackloginpage gettoggel() {
		DriverManager.getDriver().findElement(togel).click();
		return this;
	}
	public void getAbsService() {
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		DriverManager.getDriver().findElement(clkservice).click();
		return ;
	}
	public Tranzackloginpage getlogout() {
		DriverManager.getDriver().findElement(logout).click();
		return this;
		
	}
}
