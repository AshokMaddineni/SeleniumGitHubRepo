package com.data.driventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Admin
 *
 */
public class DataDriven
{
	WebDriver driver;
	WebDriverWait wait;
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	HSSFCell cell;

 @BeforeTest
 public void TestSetup()
{
	// Set the path of the Chrome driver.
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\maddi\\Desktop\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	
	// Enter url.
	driver.get("https://mail.google.com/mail/u/0/?tab=wm#inbox");
	driver.manage().window().maximize();
	
	wait = new WebDriverWait(driver,30);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
 
 @Test
 public void ReadData() throws IOException
 {
	 // Import excel sheet.
	 File src=new File("C:\\Users\\maddi\\Desktop\\Selenium\\TestData.xls");
	 
	 // Load the file.
	 FileInputStream finput = new FileInputStream(src);
	 
	 // Load he workbook.
	workbook = new HSSFWorkbook(finput);
	 
     // Load the sheet in which data is stored.
	 sheet= workbook.getSheetAt(0);
	 
	 for(int i=1; i<sheet.getLastRowNum(); i++)
	 {
		 // Import data for Email.
		 
		
		cell = sheet.getRow(i).getCell(0);
		//cell.setCellType(Cell.CELL_TYPE_STRING);
		WebElement emailphone =driver.findElement(By.id("identifierId"));
		emailphone.clear();
		emailphone.sendKeys(cell.getStringCellValue());
		 
		 // Import data for password.
		
		WebElement next = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
		next.click();
		
		 cell = sheet.getRow(i).getCell(0);
		//cell.setCellType(Cell.CELL_TYPE_STRING);
		 WebElement password =driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		 password.clear();
		 password.sendKeys(cell.getStringCellValue());
		 
		 
		 WebElement pn=driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span"));
				 pn.click();
		 WebElement signoutst=driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div/div[5]/div[1]/a/span"));
		   		signoutst.click();
		 WebElement signoutend=driver.findElement(By.xpath("//*[@id=\"gb_71\"]"));
		   		signoutend.click();  		
		   		////*[@id="password"]/div[1]/div/div[1]/input
        }
  } 

}