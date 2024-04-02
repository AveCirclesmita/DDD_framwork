package com.cjc.webapp.DemowebShop.Utility;

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
		fi = new FileInputStream("src//test//resources//Excel//DemoWebShop.xlsx");
		return fi;
	}

	public static String firstName() throws IOException {
		fi = new FileInputStream("src//test//resources//Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(0);
		String fname = cl.getStringCellValue();
		return fname;
	}

	public static String lastName() throws IOException {
		fi = new FileInputStream("src//test//resources//Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(1);
		String lname = cl.getStringCellValue();
		return lname;
	}
	
	public static String email() throws IOException {
		fi = new FileInputStream("src//test//resources//Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(2);
		String em = cl.getStringCellValue();
		return em;
	}
	
	public static String password() throws IOException {
		fi = new FileInputStream("src//test//resources//Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(3);
		String pass = cl.getStringCellValue();
		return pass;
	}
	
	public static String confirmPassword() throws IOException {
		fi = new FileInputStream("src//test//resources//Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(4);
		String cpass = cl.getStringCellValue();
		return cpass;
	}
}
