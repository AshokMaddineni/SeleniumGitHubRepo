package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Robot_Demo {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException  {
		
		 System.setProperty("webdriver.gecko.driver","G:\\geckodriver.exe");
		 
		 // Create a new instance of the Firefox driver
		 WebDriver driver = new FirefoxDriver();
		 String URL = "https://demoqa.com/keyboard-events/";
		 
		 //Start Browser
		 driver.get(URL);
		 
		 //maximize browser
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 // Specify the file location with extension
		 StringSelection sel = new StringSelection("C:\\Users\\maddi\\Downloads\\4095186_Scores.html");
		 
		   // Copy to clipboard
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		 System.out.println("selection" +sel);
		 
		 // This will click on Browse button
		 WebElement webElement = driver.findElement(By.id("browseFile")); 
		 //click  Browse button 
		 
		 webElement.sendKeys("ENTER");
		 
		 //Create object of Robot class
		/* Robot robot = new Robot();
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 
		// Release Enter
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(1000);
		        
		        
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 //This is just a verification part, accept alert
		        webElement = driver.findElement(By.id("uploadButton"));
		 
		 webElement.click(); 
		 WebDriverWait wait = new WebDriverWait(driver, 10); 
		 Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());        
		 //Accept the Alert 
		 myAlert.accept();
		 
		 //Close the main window 
		 driver.close();*/
		 }
		 
		}


