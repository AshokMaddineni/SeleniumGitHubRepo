package testautomation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assessment {
	WebDriver driver;

	@BeforeTest
	public void Launch() {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("headless");
		driver = new ChromeDriver(opt);
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		driver.manage().window().maximize();
	}

	@Test(priority=0)
	public void SampleText() {
		WebElement text = driver.findElement(By.xpath("//div[@id='idOfDiv']/p"));
		System.out.println(text.getText());

	}

	@Test()
	public void NewTab() throws InterruptedException {
		WebElement link = driver.findElement(By.xpath("//a[text()='This is a link']"));
		link.click();
		List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(1));
		Thread.sleep(5000);
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
		driver.switchTo().window(windowHandles.get(0));
		System.out.println("Entered in NewTab Method");
	}

	@Test(priority=1)
	public void Submit() {
		WebElement texbox = driver.findElement(By.xpath("//input[@name='firstName']"));
		texbox.sendKeys("AshokMaddineni");
		WebElement SubmitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		SubmitButton.click();
		System.out.println("Entered and submitted the button");

	}
	@Test(dependsOnMethods="Submit")
	public void AlertBox() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement AlertBox = driver.findElement(By.xpath("//button[text()='Double-click to generate alert box']"));
		actions.doubleClick(AlertBox).build().perform();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println("AlertBox");
	}
	@Test
	public void RadioButton() throws InterruptedException {
		List<WebElement> l = driver.findElements(By.xpath("//input[@type='radio']"));
		l.get(1).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Vertical scroll - down by 150 pixels
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("RadioButton");
	}
	@Test
	public void CheckBox() throws InterruptedException {
		List<WebElement> l = driver.findElements(By.xpath("//input[@type='checkbox']"));
		l.get(0).click();
		l.get(1).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Vertical scroll - down by 150 pixels
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("CheckBox");
	}
	@Test
	public void DropDown() {
		List<WebElement> list = driver.findElements(By.id("testingDropdown"));
		list.get(2);

	}
	@Test
	public void GenerateAlertBox() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Vertical scroll - down by 150 pixels
		js.executeScript("window.scrollBy(0,150)");
		System.out.println("GenerateAlertBox");

	}
	@Test
	public void GenerateConfirmBox() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println("GenerateConfirmBox");

	}
	@Test(enabled=true)
	public void DragandDrop() {

		WebElement Source = driver.findElement(By.id("sourceImage"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Source);

		WebElement Destination = driver.findElement(By.id("targetDiv"));

		Actions act = new Actions(driver);
		act.dragAndDrop(Source, Destination).build().perform();
		System.out.println("Skipped this Test");
	}
	@AfterTest
	public void QuitBrowser() {
		driver.close();
	}

}
