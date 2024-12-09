package build;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		WebElement f1= driver.findElement(By.xpath("//iframe[@class='w-full h-96'][1]"));
		driver.switchTo().frame(f1);
		WebElement b=driver.findElement(By.xpath("//input[@type='email']"));
	     b.sendKeys("admin");
	 
		
	}

}
