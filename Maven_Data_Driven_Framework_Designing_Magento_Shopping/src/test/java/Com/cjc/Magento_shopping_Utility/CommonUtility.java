package Com.cjc.Magento_shopping_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class CommonUtility 
{	
	
	
public static WebDriver driver;
public static FileInputStream fis;
public static XSSFWorkbook wb;
public static XSSFSheet sheet;
public static XSSFRow row;
public static XSSFCell cell;
public static String firstName;
public static String lastName;
public static String email;
public static String password;
public static String cpassword;
public static String L_name;
public static String L_pass;


public static Properties pro=new Properties();
public static FileInputStream finecall() throws FileNotFoundException
{
	fis=new FileInputStream("src//test//resources//resources//Excel//Magento_onlineshopping.xlsx");
	return fis;
}
static List<String>l=new ArrayList<String>();
public static void registerData() throws IOException
{
	fis=new FileInputStream("src//test//resources//resources//Excel//Magento_onlineshopping.xlsx");
    wb=new XSSFWorkbook(fis);
    sheet=wb.getSheet("Sheet1");
    int rowCount=sheet.getLastRowNum();
    
    for(int i=1;i<rowCount+1;i++)
    {
    	for(int j=0;j<7;j++)
    	{
    		String field=sheet.getRow(i).getCell(j).getStringCellValue();
    		l.add(field);
    		System.out.println(l);
        }
    	
    	firstName=l.get(0);
    	lastName=l.get(1);
    	email=l.get(2);
    	password=l.get(3);
    	cpassword=l.get(4);
    	L_name=l.get(5);
    	L_pass=l.get(6);
    }
	
}




}