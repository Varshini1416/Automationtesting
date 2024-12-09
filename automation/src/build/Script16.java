package build;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script16 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///F:/cel.html");
		WebElement dd= driver.findElement(By.id("celebrites"));
		Select s=new Select(dd);
		if(s.isMultiple())
		{
			s.selectByIndex(0);
			s.selectByValue("k");
			s.selectByVisibleText("vijay");
		}
		else
		{
			System.out.println("the dropdown is single select");
		}
	}

}
