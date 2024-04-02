package com.cjc.webapp.DemowebShop.page;  //DemowebShop1 16.01.2023 DDF Framework designing


import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.cjc.webapp.DemowebShop.Utility.CommonUtility;


public class RegistrationPage {

	 WebDriver driver;
			
		static Logger log = Logger.getLogger(RegistrationPage.class.getName());

		@FindBy(css = "input#gender-male")
		WebElement gender1;
		@FindBy(css = "input#FirstName")
		WebElement firstName1;
		@FindBy(css = "input[name^='L']")
		WebElement lastName1;
		@FindBy(css = "input[name='Email']")
		WebElement email1;
		@FindBy(css = "input[name$='d']")
		WebElement password1;
		@FindBy(css = "input[name*='C']")
		WebElement cpassword;
		@FindBy(css = "input[name*='re']")
		@CacheLookup
		WebElement registration1;

		public RegistrationPage(WebDriver driver)throws IOException{
			this.driver = driver;
		}

		public void registerCheckTest() throws InterruptedException, IOException {
			
			String cv1 = CommonUtility.firstName();
//			System.out.println(cv1);
			String cv2 = CommonUtility.lastName();
//			System.out.println(cv2);
			String cv3 = CommonUtility.email();
//			System.out.println(cv3);
			String cv4 = CommonUtility.password();
//			System.out.println(cv4);
			String cv5 = CommonUtility.confirmPassword();
//			System.out.println(cv5);
			
			gender1.click();
			Thread.sleep(500);
			firstName1.sendKeys(cv1);  
			Thread.sleep(500);
			lastName1.sendKeys(cv2);     
			Thread.sleep(500);
			email1.sendKeys(cv3);           
			Thread.sleep(500);
			password1.sendKeys(cv4);         
			Thread.sleep(500);
			cpassword.sendKeys(cv5);           
			Thread.sleep(500);

			registration1.click();
			log.info("Registration Check Is Successful");
		}
}
