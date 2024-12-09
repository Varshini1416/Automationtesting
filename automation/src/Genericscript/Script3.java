package Genericscript;

import org.testng.annotations.Test;

public class Script3 extends genericscript {
@Test
public void title()
{
	System.out.println(driver.getTitle());
}
}
