package com.cjc.webapp.DemoBlaze.page;  //16.01.2023 DDF Frame Work Designing

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DemoBlaze4PlaceOrder {
	//This Data Driven Framework Performed On the Demo Blaze Shop Web site
	// TestNG Data Script Created By The Harshit Bisen TB-18B Offline.
	WebDriver driver;
	Properties ps = new Properties();
	static Logger log = Logger.getLogger(DemoBlaze4PlaceOrder.class.getName());
	
	@FindBy(css = "[class='btn btn-success']")
	WebElement placeOrderClick1;
	
	@FindBy(css = "[id='name']")
	WebElement placeOrderName;
	
	@FindBy(css = "[id='country']")
	WebElement placeOrderCountry;
	
	@FindBy(css = "[id='city']")
	WebElement placeOrderCity;
	
	@FindBy(css = "[id='card']")
	WebElement placeOrderCard;
	
	@FindBy(css = "[id='month']")
	WebElement placeOrderMonth;
	
	@FindBy(css = "[id='year']")
	WebElement placeOrderYear;
			
	@FindBy(css = "[onclick='purchaseOrder()']")
	WebElement purchaseClick;	
	
	@FindBy(css = "[class='lead text-muted ']")
	WebElement orderingDeatils;
	
	@FindBy(css = "[class='confirm btn btn-lg btn-primary']")
	WebElement lastOkayClick;
	
	public DemoBlaze4PlaceOrder(WebDriver driver) {
		this.driver = driver;
	}
	
	public void DemoBlaze4PlaceOrderMethod() throws InterruptedException, IOException {
		
		FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//demoBlaze.properties");
		ps.load(fi);
		
		placeOrderClick1.click();
		Thread.sleep(500);
		
		placeOrderName.sendKeys(ps.getProperty("name"));
		Thread.sleep(500);
		
		placeOrderCountry.sendKeys(ps.getProperty("country"));
		Thread.sleep(500);
		
		placeOrderCity.sendKeys(ps.getProperty("city"));
		Thread.sleep(500);
		
		placeOrderCard.sendKeys(ps.getProperty("creditCard"));
		Thread.sleep(500);
		
		placeOrderMonth.sendKeys(ps.getProperty("month"));
		Thread.sleep(500);
		
		placeOrderYear.sendKeys(ps.getProperty("year"));
		Thread.sleep(500);
		
		purchaseClick.click();
		Thread.sleep(1000);
		
		String orderDetail = orderingDeatils.getText();
		System.out.println(orderDetail);
		Thread.sleep(300);
		
		lastOkayClick.click();
		
		log.info("Place The Order");
	}
}
