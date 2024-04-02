package com.cjc.webapp.DemoBlaze.page;  //16.01.2023 DDF Frame Work Designing

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoBlaze3AddToCart {
	//This Data Driven Framework Performed On the Demo Blaze Shop Web site
	// TestNG Data Script Created By The Harshit Bisen TB-18B Offline.
	WebDriver driver;
	static Logger log = Logger.getLogger(DemoBlaze3AddToCart.class.getName());
	@FindBy(css = "#tbodyid > div:nth-child(1) > div > div > h4 > a")
	WebElement productLinkClick1;

	@FindBy(css = "[onclick='addToCart(1)']")
	WebElement addToCartLinkClick1;
	
	@FindBy(css = "#navbarExample > ul > li.nav-item.active > a")
	WebElement homeClick1;
	
	@FindBy(css = "#tbodyid > div:nth-child(2) > div > div > h4 > a")
	WebElement productLinkClick2;
	
	@FindBy(css = "[onclick='addToCart(2)']")
	WebElement addToCartLinkClick2;
	
	@FindBy(css = "[id='cartur']")
	WebElement CartLinkClick1;
	
//	@FindBy(css = "[class='btn btn-success']")
//	WebElement placeOrderClick1;
	
	public DemoBlaze3AddToCart(WebDriver driver) {
		this.driver = driver;
	}
	
	public void DemoBlaze3AddToCartMethod() throws InterruptedException {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,200)");
		Thread.sleep(300);
		
		productLinkClick1.click();
		Thread.sleep(500);
		
		addToCartLinkClick1.click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		homeClick1.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js1 = ((JavascriptExecutor)driver);
		js1.executeScript("scrollBy(0,200)");
		Thread.sleep(300);
		
		productLinkClick2.click();
		Thread.sleep(500);
		
		addToCartLinkClick2.click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		CartLinkClick1.click();
		Thread.sleep(1000);
		
//		placeOrderClick1.click();
//		Thread.sleep(500);
		
		log.info("Product Add To Cart");
	}
}
