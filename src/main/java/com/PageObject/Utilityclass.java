package com.PageObject;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Driver.DriverManager;
import com.Report.ExtentLogger;
import com.wait.ExplicitWaitFactory;


public  class Utilityclass {
	
	
	private Select getSelectWebElement(By by) {
		Select select = new Select(DriverManager.getDriver().findElement(by));
		return select;
	}
	protected void wait(By by, int milliSeconds) {
		try {
			DriverManager.getDriver().findElement(by).wait(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected void click(By by, String elementNameForReport) throws Exception {
		ExplicitWaitFactory.explicitWaitForElementToBePresent(by);
		DriverManager.getDriver().findElement(by).click();
		ExtentLogger.pass(elementNameForReport + " - clicked Successfully.",true);
	}

	protected void clear(By by, String elementNameForReport) throws Exception {
		ExplicitWaitFactory.explicitWaitForElementToBePresent(by);
		DriverManager.getDriver().findElement(by).clear();
		ExtentLogger.pass(elementNameForReport + " - cleared Successfully.",true);
	}

	protected void sendKeys(By by, String value, String elementNameForReport) throws Exception {
		DriverManager.getDriver().findElement(by).sendKeys(value);
		ExtentLogger.pass(elementNameForReport + " - '" + value + "' sent successfully.",true);
	}
	
	protected String getText(By by, String elementNameForReport) throws Exception {
		String text = DriverManager.getDriver().findElement(by).getText();
		ExtentLogger.pass(elementNameForReport +" - '" + text + "' obtained successfully.",true);
		return text;
	}

	protected boolean isDisplayed(By by, String elementNameForReport) {
		return DriverManager.getDriver().findElement(by).isDisplayed();
	}

	protected boolean isSelected(By by, String elementNameForReport) {
		return DriverManager.getDriver().findElement(by).isSelected();
	}

	protected boolean isEnabled(By by, String elementNameForReport) {
		return DriverManager.getDriver().findElement(by).isEnabled();
	}
	
	protected WebElement getWebElement(By by, String elementNameForReport) {
		return DriverManager.getDriver().findElement(by);
	}

	protected List<WebElement> getAllElements(By by, String elementNameForReport) {
		return DriverManager.getDriver().findElements(by);
	}

	protected boolean isAllElemetsEmpty(By by, String elementNameForReport) {
		return DriverManager.getDriver().findElements(by).isEmpty();
	}

	protected int getAllElemetsEmpty(By by, String elementNameForReport) {
		return DriverManager.getDriver().findElements(by).size();
	}
	
	protected boolean isStringContains(By by, String value, String elementNameForReport) {
		return DriverManager.getDriver().findElement(by).getText().contains(value);
	}
	
	protected boolean isStringEquals(By by, String value, String elementNameForReport) {
		return DriverManager.getDriver().findElement(by).getText().equals(value);
	}
	
	protected boolean isStringEqualsIgnoreCase(By by, String value) {
		return DriverManager.getDriver().findElement(by).getText().equalsIgnoreCase(value);
	}
	
	protected static void selectDropDown(By by, String type,String value, String elementNameForReport) {
		Select select = new Select(DriverManager.getDriver().findElement(by));
		switch (type) {
		case"index":
			select.selectByIndex(Integer.parseInt(value));
		case"value":
			select.selectByValue(value);
		case"visibletext":
			select.selectByVisibleText(value);
		}
	}
	
	protected List<WebElement> getDropDownOptions(By by, String elementNameForReport) {
		return getSelectWebElement(by).getOptions();
	}
	
	protected List<WebElement> getDropDownAllSelectedOptions(By by, String elementNameForReport) {
		return getSelectWebElement(by).getAllSelectedOptions();
	}
	
	protected WebElement getDropDownFirstSelection(By by, String elementNameForReport) {
		return getSelectWebElement(by).getFirstSelectedOption();
	}
	
	protected void deselectDropDownValueByVisibleText(By by, String value, String elementNameForReport) {
		getSelectWebElement(by).deselectByVisibleText(value);
	}
	
	protected void deselectDropDownValueByIndex(By by, int index, String elementNameForReport) {
		getSelectWebElement(by).deselectByIndex(index);
	}
	
	protected void deselectDropDownValueByValue(By by, String value, String elementNameForReport) {
		getSelectWebElement(by).deselectByValue(value);
	}
	
	protected void deselectAllDropDownValueByValue(By by, String elementNameForReport) {
		getSelectWebElement(by).deselectAll();
	}
	
	protected boolean isMultipleSelectionSupported(By by, String elementNameForReport) {
		return getSelectWebElement(by).isMultiple();
	}

	
	

}
