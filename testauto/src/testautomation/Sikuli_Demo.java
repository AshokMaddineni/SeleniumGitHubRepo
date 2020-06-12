package testautomation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_Demo {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
		String inputFilePath = "C:\\Users\\maddi\\Desktop\\Selenium\\Sikuli_Images\\";
		Screen s = new Screen();
		Pattern SkipLogin = new Pattern(inputFilePath + "Skip_Sign_In.PNG");
		s.click(SkipLogin);

	}

}
