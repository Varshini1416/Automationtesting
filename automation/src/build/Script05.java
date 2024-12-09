package build;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script05 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///F:/Demo.html");
	WebElement usn=driver.findElement(By.xpath("//input[@type =\"text\"][1]"));
	if(usn.isDisplayed())
	{
		if(usn.isEnabled())
		{
			usn.sendKeys("admin");
		}
		else
		{
			System.out.println("usn is disabled");
		}
	}
	else
		{
			System.out.println("usn is not disabled");
		}
	}
}
