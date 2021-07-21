package com.PageObject;

import org.openqa.selenium.By;

import com.wait.ExplicitWaitFactory;



public class Airfacelogin extends Utilityclass{
	
	
	  private final  By select_lang=By.id("navbarDropdown2");
      private final  By language=By.id("En");
	   private final  By username=By.xpath("//input[@id='useremail']");
	   private final  By password=By.xpath("//input[@id='userpassword']");
	   private final  By admin=By.xpath("//div[3]//div[1]//input[1]");
	   private final  By user=By.xpath("//div[@class='form-group text-center']//div[2]//input[1]");
	   private final  By login=By.xpath("//input[@id='submit_login']");

		
		public  Airfacelogin getSelect_lang() throws Exception {
			ExplicitWaitFactory.explicitWaitForElementToBePresent(select_lang);
			 click(select_lang, "click language button");
			 return this;
		}
		public  Airfacelogin getlanguage() throws Exception {
			ExplicitWaitFactory.explicitWaitForElementToBeClickable(language);
			click(language, "select language");
			 return this;
		}
		public  Airfacelogin getuser(String user) throws Exception {
			ExplicitWaitFactory.explicitWaitForElementToBePresent(username);
			 sendKeys(username, user, "username");
			 return this;
		}
		public  Airfacelogin getpass(String Pass) throws Exception {
			ExplicitWaitFactory.explicitWaitForElementToBePresent(password);
			sendKeys(password, Pass, "username");
			 return this;
		}
		public Airfacelogin getAdmin() throws Exception {
			ExplicitWaitFactory.explicitWaitForElementToBeClickable(admin);
			click(admin, "admin button");
			return this;
		}
		public Airfacelogin getLogin() throws Exception {
			ExplicitWaitFactory.explicitWaitForElementToBeClickable(admin);
			click(login, "login button");
			return this;
		}

}
