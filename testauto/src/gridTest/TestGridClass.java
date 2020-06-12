package gridTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

class TestGridClass{
	
	static WebDriver driver;
	static String ndUrl;
	public static void main(String[] args)
	
	{
		try {
			ndUrl=" http://192.168.43.193:41719/wb/hub";
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WIN10);
			driver =new RemoteWebDriver(new URL(ndUrl),capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);
			driver.get("https://www.amazon.in");
		} catch (MalformedURLException e)
		{
			
			e.printStackTrace();
		}
	}
}
