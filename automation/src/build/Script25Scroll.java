package build;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Script25Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[.='facebook]"));
	Point p=ele.getLocation();
		System.out.println(p);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
			js.executeScript("window.scrollBy(0,4892)");
			ele.click();
			Thread.sleep(2000);
	}
}
		

		
	


