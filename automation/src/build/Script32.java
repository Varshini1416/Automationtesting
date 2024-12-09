package build;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script32 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/apple-iphone-15-pink-128-gb/p/itm7579ed94ca647?pid=MOBGTAGPNMZA5PU5&lid=LSTMOBGTAGPNMZA5PU5AVZNIR&marketplace=FLIPKART&q=iphone&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_3&otracker=AS_Query_PredictiveAutoSuggest_1_0_na_na_na&otracker1=AS_Query_PredictiveAutoSuggest_1_0_na_na_na&fm=search-autosuggest&iid=48d31cd2-88dd-4818-a422-b81ee3482c9f.MOBGTAGPNMZA5PU5.SEARCH&ppt=sp&ppn=sp&ssid=ap4wb6evmel807401732081451378&qH=0b3f45b266a97d70");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@title='search for products,brand and more']"));
		search.sendKeys("iphone");
	}

}
