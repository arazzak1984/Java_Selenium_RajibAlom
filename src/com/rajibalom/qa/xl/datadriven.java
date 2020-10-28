package com.rajibalom.qa.xl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadriven {
	static XSSFCell cel;
	public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Driver Latest/chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.get("https://wellsfargo.com/");
	      driver.manage().window().maximize();
	      
	      File src = new File("C:\\Users\\Sumon\\Desktop\\Class Stuff\\DDFramework Selenium\\DDF1.xlsx");
          FileInputStream fis = new FileInputStream(src);
          
          XSSFWorkbook wb =new XSSFWorkbook(fis);
          
          XSSFSheet sheet=wb.getSheetAt(0);
	      for(int i=1; i<=sheet.getLastRowNum(); i++) {
	    	  cel=sheet.getRow(i).getCell(1);
	    	  cel.setCellType(CellType.STRING);
	    	 driver.findElement(By.id("userid")).sendKeys(cel.getStringCellValue());
	    	  
	    	  
	      }
	      
	      
	      
	}

}
