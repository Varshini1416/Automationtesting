package build;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script06 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///F:/Demo.html");
	WebElement cb=driver.findElement(By.xpath("//input[@type =\"checkbox\"]"));
	if(cb.isDisplayed())
	{
		if(cb.isSelected())
		{
			System.out.println("it is selected");
			cb.click();
		}
		else
		{
			System.out.println(" is disabled");
		}
	}
	else
		{
			System.out.println("is not disabled");
		}
	}


}

