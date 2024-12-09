package build;

public class Script34 {

	
		import java.awt.AWTException;
		import java.awt.Robot;
		import java.awt.event.KeyEvent;
		import java.util.ArrayList;
		import java.util.Set;

		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.interactions.Actions;

		{

			public static void main(String[] args) throws InterruptedException, AWTException {
				System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.selenium.dev/downloads/");
				WebElement ele1 = driver.findElement(By.xpath("(//a[@class='card-link'])[1]"));

				Actions a=new Actions(driver);
				Thread.sleep(2000);
				a.contextClick(ele1).perform();
				
				Robot r= new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		WebElement ele2 = driver.findElement(By.xpath("(//a[@class='card-link'])[4]"));

		Actions a1=new Actions(driver);
		Thread.sleep(2000);
		a1.contextClick(ele2).perform();

		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);


		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<2;i++)
		{
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
		}




		WebElement ele3 = driver.findElement(By.xpath("(//a[@class='card-link'])[10]"));
		Actions a2=new Actions(driver);
		Thread.sleep(2000);
		a2.contextClick(ele3).perform();

		Robot r2= new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);


		WebElement ele4 = driver.findElement(By.xpath("(//a[@class='card-link'])[13]"));
		Actions a3=new Actions(driver);
		Thread.sleep(2000);
		a3.contextClick(ele4).perform();

		Robot r3= new Robot();
		r3.keyPress(KeyEvent.VK_DOWN);
		r3.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r3.keyPress(KeyEvent.VK_ENTER);
		r3.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
				
		Set<String> wins = driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(wins);
		int count=arr.size();
		for(int i=0;i<count;i++)
		{
			String win=arr.get(i);
			driver.switchTo().window(win);
			String title=driver.getTitle();
			System.out.println(title);
			Thread.sleep(1000);
			if(title.equals("NuGet Gallery | Selenium.WebDriver 4.26.1"))
			{
			driver.close();
			Thread.sleep(1000);
			}
			if(title.equals("selenium-webdriver | RubyGems.org | your community gem host"))
					{
				driver.close();
				Thread.sleep(1000);
					}
			if(title.equals("selenium · PyPI"))
			{
				driver.close();
				Thread.sleep(1000);
			}
			if(title.equals("selenium-webdriver - npm"))
			{
				driver.close();
				Thread.sleep(1000);
			}
			
			
		}

				
				
			}

		
}
}
