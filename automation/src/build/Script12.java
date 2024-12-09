package build;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///F:/mainpage.html");
		WebElement usn= driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("admin");
		//driver.switchTo().frame("f1");
		driver.switchTo().frame(0);
		WebElement fe=driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(f1);
		WebElement psw=driver.findElement(By.xpath("\\input[@type='text']"));
		psw.sendKeys("admin@123");
		
	}

}
