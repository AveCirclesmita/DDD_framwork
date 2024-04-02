package com.cjc.webapp.DemoBlaze.page;  //16.01.2023 DDF Frame Work Designing

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.cjc.webapp.DemoBlaze.Utility.CommonUtility;

public class DemoBlaze1Signup {
	//This Data Driven Framework Performed On the Demo Blaze Shop Web site
	// TestNG Data Script Created By The Harshit Bisen TB-18B Offline.
	 WebDriver driver;
	 static Logger log = Logger.getLogger(DemoBlaze1Signup.class.getName()); 
	
	@FindBy(css = "[id='signin2']")
	WebElement signupClick1;
	
	@FindBy(css = "[id='sign-username']")
	WebElement usernameSignup;
	
	@FindBy(css = "[id='sign-password']")
	WebElement passowrdSignup;

	@FindBy(css = "button[onclick='register()']")
	@CacheLookup
	WebElement signUpClick2;
	
	public DemoBlaze1Signup(WebDriver driver) {
		this.driver = driver;
	}
	
	public void DemoBlaze1SignupMethod() throws InterruptedException, IOException {
		
		
		String cv1 = CommonUtility.signUpUsername();
		String cv2 = CommonUtility.signUpPassword();
		System.out.println(cv1);
		System.out.println(cv2);
		
		signupClick1.click();
		Thread.sleep(500);
		
		usernameSignup.sendKeys(cv1);
        Thread.sleep(500);
        
        passowrdSignup.sendKeys(cv2);
        Thread.sleep(1000);
        
        signUpClick2.click();
        Thread.sleep(1500);
        
        driver.switchTo().alert().accept();
        Thread.sleep(500);
        
        log.info("User SignUp");
	}
	
	 
	
}
