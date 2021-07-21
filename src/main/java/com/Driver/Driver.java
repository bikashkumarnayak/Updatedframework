package com.Driver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Enum.ConfigProperty;
import com.FrameworkConfig.Config;

import propertyfile.Jsonutiles;
import propertyfile.PropetyFile;

public final class Driver {

	
	
	private Driver() {
		
	}

	public static void initDriver() throws Exception {
		if (Objects.isNull(DriverManager.getDriver())) {
			String browserName=PropetyFile.get(ConfigProperty.BROWSER);
			if(browserName.equalsIgnoreCase(Config.getChrome())) {
			System.setProperty(Config.getChromedrive(), Config.getChromedriverpath());
			
			DriverManager.setDriver(new ChromeDriver());
			
		}
			else if(browserName.equalsIgnoreCase(Config.getFirefox())) {
				System.setProperty(Config.getGicodriver(), Config.getGicodriverpath());
				DriverManager.setDriver(new FirefoxDriver ());
			}
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().manage().deleteAllCookies();
			DriverManager.getDriver().manage().timeouts().implicitlyWait(Config.getExplecitywait(), TimeUnit.SECONDS);
			DriverManager.getDriver().get(Jsonutiles.get(ConfigProperty.URL));
			
		}
	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}
