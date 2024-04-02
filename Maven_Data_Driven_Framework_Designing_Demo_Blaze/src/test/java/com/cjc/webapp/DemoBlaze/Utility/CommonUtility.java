package com.cjc.webapp.DemoBlaze.Utility; 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class CommonUtility {
	public static WebDriver driver;
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow ro;
	public static XSSFCell cl;

	public static FileInputStream filenalCall() throws FileNotFoundException {
		fi = new FileInputStream("src//test//resources//Excel//DemoBlaze.xlsx");
		return fi;
	}

	public static String signUpUsername() throws IOException {
		fi = new FileInputStream("src//test//resources//Excel//DemoBlaze.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(0);
		String signupusern = cl.getStringCellValue();
		return signupusern;
	}

	public static String signUpPassword() throws IOException {
		fi = new FileInputStream("src//test//resources//Excel//DemoBlaze.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(1);
		String signupPass = cl.getStringCellValue();
		return signupPass;
	}

}
