package Genericscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Script1 extends genericscript {
	@Test
	public void usn()
	{
		boolean displayed=driver.findElement(By.id("email")).isDisplayed();
		boolean enabled=driver.findElement(By.id("email")).isEnabled();
		System.out.println(displayed+""+enabled);
		
	}

}
