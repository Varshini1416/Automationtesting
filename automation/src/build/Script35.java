package build;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script35 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//button[.='prompt Alert Box']"));
		ele.click();
		Alert popup=driver.switchTo().alert();
		popup.sendKeys("yes");
		String msg=popup.getText();
		System.out.println(msg);
		driver.quit();
	}

}
