package build;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script33 {


	public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.selenium.dev/downloads/");
Thread.sleep(2000);
WebElement net=driver.findElement(By.xpath( "//a[.='4.26.1 (October 30, 2024)']"));
Actions act=new Actions(driver);
act.contextClick(net).perform();
act.moveToElement(net).perform();
net.click();
Thread.sleep(3000);
Robot r= new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyPress(KeyEvent.VK_ENTER);

String wins=driver.getWindowHandle();
Set<String> a=driver.getWindowHandles();
ArrayList<String>arr=new ArrayList<String>(a);
int count=arr.size();
for(int i=0;i<count;i++)
{
	String b=arr.get(i);
	driver.switchTo().window(b);
	String title=driver.getTitle();
	System.out.println(title);
Thread.sleep(2000);
driver.close();
	
}
	}

}
