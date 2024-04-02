package com.cjc.webapp.DemowebShop.page;  //DemowebShop6 16.01.2023 DDF Framework Design

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class BillingAdressPage {

	 //This Is Data Driven Framework Performed On The Demo Web Shop Website.
	// TestNG Data Driven Framework Script Created By The Harshit Bisen TB-18B Offline.
		WebDriver driver;
		Properties ps = new Properties();
		static Logger log = Logger.getLogger(BillingAdressPage.class.getName());

		{
		FileInputStream fi = new FileInputStream("src//test//resources//PropertiesFile//DemowebShop.properties");
		ps.load(fi);
		}
		
		@FindBy(xpath = "//input[@id='BillingNewAddress_Company']")
		WebElement companyname;
		@FindBy(xpath = "//select[@name='BillingNewAddress.CountryId']")
		WebElement country;
		@FindBy(xpath = "//input[@id='BillingNewAddress_City']")
		WebElement city;
		@FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
		WebElement address1;
		@FindBy(xpath = "//input[@id='BillingNewAddress_Address2']")
		WebElement address2;
		@FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
		WebElement zipcode;
		@FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
		WebElement phoneno;
		@FindBy(xpath = "//input[@name='BillingNewAddress.FaxNumber']")
		WebElement faxno;
		@FindBy(xpath = "//input[@title='Continue']")
		WebElement continues;
		@FindBy(css = "#PickUpInStore")
		WebElement pickupinstore;
		@FindBy(css = "#shipping-buttons-container > input")
		WebElement con;
		@FindBy(xpath = "//*[@id='payment-method-buttons-container']/input")
		WebElement continue1;
		@FindBy(xpath = "//*[@id='payment-info-buttons-container']/input ")
		WebElement continue2;
		@FindBy(xpath = "//*[@id='confirm-order-buttons-container']/input")
		WebElement confirm;
		@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]")
		WebElement ordernumber;
		@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
		WebElement continue3;

		public BillingAdressPage(WebDriver driver)throws IOException {
			this.driver = driver;
		}

		public void billingAdrress() throws InterruptedException, IOException {

			Thread.sleep(500);
			companyname.sendKeys(ps.getProperty("cname"));
			Thread.sleep(500);
			WebElement ddc = country;
			Select select = new Select(ddc);
			select.selectByIndex(25);
			Thread.sleep(500);
			city.sendKeys(ps.getProperty("cname1"));
			Thread.sleep(500);
			address1.sendKeys(ps.getProperty("addr1"));
			Thread.sleep(500);
			address2.sendKeys(ps.getProperty("addr2"));
			Thread.sleep(500);
			zipcode.sendKeys(ps.getProperty("zip"));
			Thread.sleep(500);
			phoneno.sendKeys(ps.getProperty("pn"));
			Thread.sleep(500);
			faxno.sendKeys(ps.getProperty("fn1"));
			Thread.sleep(500);
			continues.click();
			Thread.sleep(1500);
			pickupinstore.click();
			Thread.sleep(500);
			con.click();
			Thread.sleep(500);
			continue1.click();
			Thread.sleep(500);
			continue2.click();
			Thread.sleep(500);
			confirm.click();
			Thread.sleep(1500);
			WebElement oc = ordernumber;
			String s1 = oc.getText();
			log.info(s1);
			continue3.click();
			Thread.sleep(500);
			log.warn("Please Make Billing & Payment Carefully");
		}
}
