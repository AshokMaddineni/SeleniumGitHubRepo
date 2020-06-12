import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTesting {

	

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		XSSFWorkbook wbk;
		XSSFSheet sht;
		XSSFCell cell;
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		File src = new File("C:\\Users\\maddi\\Desktop\\Selenium\\TestNG-master\\TestNG-master\\MercuryTestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		wbk = new XSSFWorkbook(fis);
		sht = wbk.getSheetAt(0);
		for (int i = 1; i <= sht.getLastRowNum(); i++) {
			cell = sht.getRow(i).getCell(0);
			WebElement tagName = driver.findElement(By.name("userName"));
			tagName.sendKeys(cell.getStringCellValue());

			cell = sht.getRow(i).getCell(1);
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys(cell.getStringCellValue());

			WebElement signin = driver.findElement(By.name("login"));
			signin.click();
		}
	}

}
