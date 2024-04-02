package com.cjc.webapp.DemowebShop.page; //DemowebShop2 16.01.2023 DDF Framework Design

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogoutPage {

	 //This Is Data Driven Framework Performed On The Demo Web Shop Website.
	// TestNG Data Driven Framework Script Created By The Harshit Bisen TB-18B Offline.
		WebDriver driver;
		static Logger log = Logger.getLogger(LogoutPage.class.getName());

		@FindBy(xpath = "//a[@class='ico-logout']")
		WebElement logout;

		public LogoutPage(WebDriver driver) {
			this.driver = driver;
		}

		public void logout() throws InterruptedException {
			// driver = new ChromeDriver();
			Thread.sleep(1500);
			logout.click();
			log.info("Logout Check Is Successful");
		}
}
