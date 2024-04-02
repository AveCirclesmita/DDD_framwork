package Com.cjc.Magento_shopping_Test;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.cjc.Magento_shopping_page.Address_Details;
import Com.cjc.Magento_shopping_page.AddtoCard;
import Com.cjc.Magento_shopping_page.Loging_page;
import Com.cjc.Magento_shopping_page.Logout_page;
import Com.cjc.Magento_shopping_page.RegistrationPage;



public class Magento_onlineshopping_Test 
{
	WebDriver driver;
	static Logger log=Logger.getLogger(Magento_onlineshopping_Test.class.getName());
	Properties pro=new Properties();
	@BeforeSuite
	public void openBrowser() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","src//test//resources//resources//Chrome_Exe//chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("open browser sucessfully");
		FileInputStream fis=new FileInputStream("src//test//resources//resources//Properties_File//Magento.Properties");
		pro.load(fis);
	}

	@BeforeTest
	public void enterUrl()
	{
		driver.get(pro.getProperty("url"));
		System.out.println("sucessfully entered");
	}

	@BeforeClass
	public void maximize() 
	{
		driver.manage().window().maximize();
		System.out.println("sucessfully maximize");
	}

	@BeforeMethod
	public void getCookies()
	{
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Set<Cookie> al = driver.manage().getCookies();
//		System.out.println("sucessfully get all cookies" + al.size());
	}
		
 @Test(priority = 1,dataProvider = "Registration_Detailst")
 public void Registration_Test(String fn1, String ln1,String em1,String ps1,String cp1) throws IOException, InterruptedException 
 {
 
		 RegistrationPage rp=PageFactory.initElements(driver, RegistrationPage.class);
	     rp.registerCheck(fn1,  ln1,em1,ps1,cp1);
		    
 }
@DataProvider // Eager Loading.
public Object[][] Registration_Detailst()
{
return new Object[][]
		{
			new Object[]{"smita","pawar","smitapawar8@gmail.com","smita@123","smita@123"}
				
	    };
			
}
 @Test(priority = 2)
 public void Lout_Test() throws IOException, InterruptedException  
 {
	 Thread.sleep(1000);
	 Logout_page lp=PageFactory.initElements(driver, Logout_page.class);
	 lp.l_out_Check();
		    
 }
 
 
 @Test(priority = 3,dataProvider = "Loging_Detailst")
 public void Loging_Test(String name1,String pass1) throws IOException, InterruptedException  
 {
	 Thread.sleep(1000);
	 Loging_page lc=PageFactory.initElements(driver, Loging_page.class);
	 lc.LogingCheckMethod( name1, pass1);
		    
 }
 @DataProvider // Eager Loading.
	public Object[][] Loging_Detailst()
	{
	return new Object[][]
			{
				new Object[]{"smitapawar7@gmail.com","smita@123"}
					
		    };
				
	}
 
 @Test(priority = 4)
 public void Add_to_product_Test() throws IOException, InterruptedException  
 {
	 Thread.sleep(1000);
	 AddtoCard Ac=PageFactory.initElements(driver, AddtoCard.class);
	 Ac.Product_Add();
		    
 } 
 
 @Test(priority = 5,dataProvider = "getAddress_Detailst")
 public void Address_Detailst_Test(String company,String street_add,String city_add,String zip_add,String phon_no ) throws IOException, InterruptedException  
 {
	                                                                         
	
	  Address_Details Ad=PageFactory.initElements(driver, Address_Details.class);
	 Ad.Address_Details_Method(company,street_add, city_add,zip_add,phon_no );
		  											
 }
 
 @DataProvider // Eager Loading.
	public Object[][] getAddress_Detailst()
	{
	return new Object[][]
			{
				new Object[]{"Infosis","old police line","solapur","413001","986756235"}
					//"sandhya","pawar","Maharashtra","India",
		    };
				
	}
 
    @AfterMethod
	public void captureScreen() throws IOException, InterruptedException 
    {
		Thread.sleep(2000);
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src1, new File("src//test//resources//Screenshot"));
		log.info("Screen Shot After Completion The Process");
	}
//
//	@AfterClass
//	public void deleteCookies() {
//		driver.manage().deleteAllCookies();
//		log.info("Delete All Cookies");
//	}
//
//	@AfterTest
//	public void dbclose() {
//		log.info("Data Base Connection Close");
//	}
//
//	@AfterSuite
//	public void browserClose() throws InterruptedException {
//		Thread.sleep(3000);
//		log.error("Carefully Browser Close");
//		driver.close();
//	}
 	
}