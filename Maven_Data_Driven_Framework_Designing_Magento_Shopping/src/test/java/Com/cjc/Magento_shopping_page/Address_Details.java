package Com.cjc.Magento_shopping_page;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class Address_Details
{
     WebDriver driver;
     static Logger log=Logger.getLogger(Address_Details.class);
     
     public Address_Details(WebDriver driver)
     {
    	 this.driver=driver;
     }
    
	
     @FindBy(xpath ="/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[3]/div/input")
     WebElement Add_comp;
     
     @FindBy(xpath =  "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/fieldset/div/div[1]/div/input")
    // @FindBy(css="#XIVIX3Y")
     WebElement Add_Street_Address;
     
     @FindBy(xpath  ="/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input")
     WebElement city;
     
     @FindBy(css = "select[name='region_id'] > option[value='553']")
     WebElement State;
     
     @FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[7]/div/input")
     WebElement Zip;
     
     @FindBy(css = "select[name='country_id'] > option[value=\"IN\"]")
     WebElement Country;
     
     @FindBy(css =  "input[name='telephone']")
     WebElement Phone_Number;
     
     @CacheLookup
     @FindBy(css =  "#shipping-method-buttons-container > div > button")
     WebElement Shipping;
     
     @CacheLookup
     @FindBy(xpath = "//div[@id='checkout-payment-method-load']/div/div/div[2]/div[2]/div[4]/div/button")
     WebElement continious;
//   
//     @FindBy(xpath ="//main[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]/text()[1]")
//     WebElement order_no;
//     
     public void Address_Details_Method(String Add_comp_1,String Add_Street_Address_1,String city_1,String Zip_1,String Phone_Number_1) throws InterruptedException 
     { 
//    	 Add_comp.sendKeys(Add_comp_1);
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
 		js.executeScript("scrollBy(0,100)"); //Scrolldown method
 		
    	 
 		Add_comp.sendKeys(Add_comp_1);
 		
    	 Thread.sleep(1000);
    	 Add_Street_Address.sendKeys(Add_Street_Address_1);
    	 
    	 Thread.sleep(1500);
    	 Country.click();
    	 
    	 Thread.sleep(1000);
    	 State.click();
    	

    	 Thread.sleep(1000);
    	 Zip.sendKeys(Zip_1);
    	 
    	 Thread.sleep(1000);
    	 city.sendKeys(city_1);
    	
//    	 Select s=new Select(Country);
// 		s.selectByValue("IN");
    	
    	 Thread.sleep(1000);
    	 Phone_Number.sendKeys(Phone_Number_1);
    	 
    	 Thread.sleep(1000);
    	 Shipping.click();
    	 //Button is working but Test is fail
//    	  Thread.sleep(1000);
//    	 continious.click();
//    	 String ordnum = order_no.getText();
//		  log.info(ordnum);
   	 
    	 
    	
    	 
     }
}
