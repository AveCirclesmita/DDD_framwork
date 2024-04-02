package com.cjc.webapp.DemoBlaze.page;    //16.01.2023 DDF Frame Work Designing
 
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DemoBlaze2Login {
	//This Data Driven Framework Performed On the Demo Blaze Shop Web site
	// TestNG Data Script Created By The Harshit Bisen TB-18B Offline.
	WebDriver driver;
	static Logger log = Logger.getLogger(DemoBlaze2Login.class.getName());
	@FindBy(css = "[id='login2']")
	WebElement loginClick1;
	
	@FindBy(css = "[id='loginusername']")
	WebElement usernameLogin;
	
	@FindBy(css = "[id='loginpassword']")
	WebElement passowrdLogin;

	@FindBy(css = "button[onclick='logIn()']")
	@CacheLookup
	WebElement loginClick2;
	
	public DemoBlaze2Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void DemoBlaze2LoginMethod(String loginuname, String loginpass) throws InterruptedException {
		loginClick1.click();
		Thread.sleep(500);
		
		usernameLogin.sendKeys(loginuname);
        Thread.sleep(500);
        
        passowrdLogin.sendKeys(loginpass);
        Thread.sleep(500);
        
        loginClick2.click();
        Thread.sleep(1000);
        
        log.info("User Login");
	}
}
