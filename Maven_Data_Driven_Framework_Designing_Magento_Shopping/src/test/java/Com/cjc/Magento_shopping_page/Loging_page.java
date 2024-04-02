package Com.cjc.Magento_shopping_page;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Com.cjc.Magento_shopping_Utility.CommonUtility;

public class Loging_page 
{
	WebDriver driver;
	static Logger log=Logger.getLogger(Loging_page.class.getName());
	public Loging_page(WebDriver driver)
	{
		this.driver=driver;
	}
    
	@CacheLookup
	@FindBy(css ="body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.authorization-link > a")
	WebElement Loging_Button;
	
	@FindBy(css="#email")
	WebElement email;
	
	@FindBy(css="#pass")
	WebElement L_pass;
	
	@CacheLookup
	@FindBy(css="#send2")
	WebElement loging_button;
	
	
	public void LogingCheckMethod(String name,String pass) throws IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		driver.navigate().to("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
//		Thread.sleep(1000);
//		loging_button.click();
		Thread.sleep(1000);
		email.sendKeys(name);
		Thread.sleep(1000);
		L_pass.sendKeys(pass);
		loging_button.click();
	}
	
	
}
