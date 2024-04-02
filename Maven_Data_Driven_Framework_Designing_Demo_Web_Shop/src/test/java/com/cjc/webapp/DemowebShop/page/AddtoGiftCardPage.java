package com.cjc.webapp.DemowebShop.page;  //DemowebShop4 16.01.2023 DDF Framework Design.

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddtoGiftCardPage {

	 //This Is Data Driven Framework Performed On The Demo Web Shop Website.
	// TestNG Data Driven Framework Script Created By The Harshit Bisen TB-18B Offline.
			WebDriver driver;
			Logger log = Logger.getLogger(AddtoGiftCardPage.class.getName());

			@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")
			WebElement addtocartclick;
			@FindBy(xpath = "//input[@class='recipient-name']")
			WebElement recipientname;
			@FindBy(xpath = "//input[@class='recipient-email']")
			WebElement recipientemail;
			@FindBy(xpath = "//input[@id='add-to-cart-button-2']")
			WebElement addtocartclick2;
			public AddtoGiftCardPage(WebDriver driver)throws IOException{
				this.driver = driver;	
			}
//	        @DataProvider(name = "getAddToCartData")
			public void addToCartGiftCard(String rn, String rem) throws InterruptedException, IOException {
				Thread.sleep(500);
				addtocartclick.click();
				Thread.sleep(500);
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("scrollBy(0,300)");
				Thread.sleep(500);
				recipientname.sendKeys(rn);
				Thread.sleep(500);
				recipientemail.sendKeys(rem);
				Thread.sleep(500);
				addtocartclick2.click();
				Thread.sleep(500);
				log.info("Add To Gift Card Successfully");
			}
			
}
