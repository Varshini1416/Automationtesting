package build;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///F:/mainpage.html");
		WebElement usn= driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("admin");
		driver.switchTo().frame("f2");
		//driver.switchTo().frame(0);
		WebElement fe=driver.findElement(By.xpath("//iframe[@id='f2']"));
		driver.switchTo().parentFrame();
		WebElement mobno=driver.findElement(By.xpath("\\input[@type='text']"));
		mobno.sendKeys("admin@123");
		driver.switchTo().parentFrame();
		WebElement email=driver.findElement(By.xpath("\\input[@type='text']"));
		email.sendKeys("admin123@gmail.com");
		
	}

	}


