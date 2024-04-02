package Com.cjc.Magento_shopping_page;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddtoCard 
{
	WebDriver driver;
	static Logger log=Logger.getLogger(AddtoCard.class);
	public AddtoCard(WebDriver driver)
	{
		this.driver=driver;
		
	}

	@CacheLookup
	@FindBy(css="#ui-id-4")
	WebElement women;
	
	@CacheLookup
	@FindBy(css="#ui-id-9")
	WebElement top;
	
	@CacheLookup
	@FindBy(css="#ui-id-11")
	WebElement jackest;
	
	@CacheLookup
	@FindBy(css="#maincontent > div.columns > div.column.main > div.products.wrapper.grid.products-grid > ol > li:nth-child(2) > div > a > span > span > img")
	WebElement jackest_select;
	
	@CacheLookup
	@FindBy(css="#option-label-size-143-item-166")
	WebElement jac_size;
	
	@CacheLookup
	@FindBy(css="#option-label-color-93-item-50")
	WebElement color_prod;
	
	@CacheLookup
	@FindBy(css="#qty")
	WebElement produ_conti;
	
	@CacheLookup
	@FindBy(css="button[id=\"product-addtocart-button\"]")
	WebElement Add_cart_button;
	
	 @CacheLookup
	 	@FindBy(css="a[href=\"https://magento.softwaretestingboard.com/checkout/cart/\"]")
	 	WebElement Add_to_cart;
	 	
	 	@CacheLookup
	 	@FindBy(xpath ="//button[@class=\"action primary checkout\"]")
	 	WebElement Proceed_to_Checkout;
	 	
	 
	public void Product_Add() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Thread.sleep(1000);
		Actions act= new Actions(driver);
		WebElement list=women;
		act.moveToElement(list).build().perform();
		
		Thread.sleep(1000);
		WebElement top_select=top;
		act.moveToElement(top_select).build().perform();
		 
		     Thread.sleep(1000);
		WebElement jackest_sel=jackest;
		act.moveToElement(jackest_sel).click().build().perform();
		

	     Thread.sleep(1000);
	      JavascriptExecutor js=(JavascriptExecutor)driver ;
	      //method of javaScript
	     js.executeScript("scrollBy(0, 250)");
	     
	     Thread.sleep(1000);
	     WebElement selejacket=jackest_select;
	     act.moveToElement(selejacket).click().build().perform();
	     
	     Thread.sleep(1000);
	     jac_size.click();
	     
	     Thread.sleep(1000);
	     color_prod.click();
	     
	     Thread.sleep(1000);
	     produ_conti.clear();
	     
	     Thread.sleep(1000);
	     produ_conti.sendKeys("1");
	     
	     Thread.sleep(1500);
	     Add_cart_button.click();
	     
	     Thread.sleep(1000);
	     Add_to_cart.click();
	     
	     //Thread.sleep(1000);
	     Proceed_to_Checkout.click();
	    
	    
	}
	
}
