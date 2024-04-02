package com.cjc.webapp.DemowebShop.page;  //DemowebShop3 16.01.2023 DDF Framework Designing

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	 //This Is Data Driven Framework Performed On The Demo Web Shop Website.
	// TestNG Data Driven Framework Script Created By The Harshit Bisen TB-18B Offline.
		WebDriver driver;
		Logger log = Logger.getLogger(LoginPage.class.getName());

		@FindBy(xpath = "//a[@class='ico-login']")
		WebElement login;
		@FindBy(xpath = "//input[@class='email']")
		WebElement email1;
		@FindBy(xpath = "//input[@name='Password']")
		WebElement password1;
		@FindBy(css = "#RememberMe")
		WebElement RememberMe;
		@FindBy(xpath = "//input[@class='button-1 login-button']")
		WebElement loginClick;

		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}

		public void loginCheck(String em, String pass) throws InterruptedException {
			Thread.sleep(1500);
			login.click();
			Thread.sleep(1500);
			email1.sendKeys(em);
			Thread.sleep(500);
			password1.sendKeys(pass);
			Thread.sleep(500);
			RememberMe.click();
			Thread.sleep(1000);
			loginClick.click();
			Thread.sleep(500);
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("scrollBy(0,500)");
			log.info("Login Check Is Successful");
		}
}
