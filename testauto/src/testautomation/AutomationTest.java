package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\maddi\\Desktop\\Selenium\\chromedriver.exe" );
		 WebDriver	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.google.com");
			WebElement Gamil=driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a"));
			Gamil.click();
		driver.close();
		
		
	
	}

}
