package build;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script07 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/button?sublist=0");
		WebElement bt=driver.findElement(By.xpath("//button[@id =\"btn\"]"));
		bt.click();
	}

}