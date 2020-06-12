package JavaScriptExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//WebElement Skills = driver.findElement(By.id("Skills"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("arguments[0].scrollIntoView()", Skills);
		
		//js.executeScript("document.getElementById('Skills').scrollIntoView()");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		
		
		
		
		
		
		
		
		
		//js.executeScript("document.getElementById('email').value='ashok@gmail.com'");
			/*String Tittle =js.executeScript("return document.title").toString();
			System.out.println("Title Name"+Tittle);*/
			
			
			/*String ButtonNAME =js.executeScript("return document.getElementById('btn2').innerHTML").toString();
			System.out.println("Button Name"+ButtonNAME);*/
		
		//Thread.sleep(5000);

		//js.executeScript("history.go(0)");
		//js.executeScript("document.getElementById('enterimg').click()");
		

	}

}
