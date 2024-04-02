package Com.cjc.Magento_shopping_page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Logout_page
{
	WebDriver driver;
	static Logger log=Logger.getLogger(Logout_page.class);

	public Logout_page(WebDriver driver)
	{
		this.driver=driver;
	}
	@CacheLookup
	@FindBy(css="body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.customer-welcome > span > button")
	WebElement lout;
	@CacheLookup
	@FindBy(css = "body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.customer-welcome.active > div > ul > li.authorization-link > a")
	WebElement lonin;
	
	
	public void l_out_Check() throws InterruptedException
	{
		//Thread.sleep(1000);
		lout.click();
		//Thread.sleep(1000);
		lonin.click();
		
	}
	
	
}
