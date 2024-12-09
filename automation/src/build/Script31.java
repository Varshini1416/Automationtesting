package build;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script31 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
		Thread.sleep(2000);
		WebElement from=driver.findElement(By.xpath("//input[@type='text']"));
		from.click();
		
		WebElement s1=driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
		Thread.sleep(2000);
		s1.click();
	    WebElement s2=driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
	    Thread.sleep(2000);
	    s2.click();
	    WebElement s3=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	    Thread.sleep(2000);
	    s3.click();
	}

}
