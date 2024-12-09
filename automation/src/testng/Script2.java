package testng;

import java.sql.Driver;
import java.sql.DriverAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class Script2 {
	public WebDriver driver
	@Parameters("browsernmae");
	@BeforeMethod
	public void browsersetup(String browsername)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		ChromeDriver driver;
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else  if (browsername.equals("fire"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
@AfterMethod
public void classdrowser()throws InterruptedException
{
	Thread.sleep(2000);
WebDriver driver;
driver.quit();
}
}
