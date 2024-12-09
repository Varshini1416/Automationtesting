package build;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script01 {

	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");;
			WebDriver driver=new ChromeDriver();
			//driver.get("www.amazon.com");
		}
	}

}
