package Genericscript;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class genericscript {
	WebDriver driver;
	@BeforeMethod
	public void Browsersetup()
	{
		System.setProperty("webdriver.chrome.driver", "./software.chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
