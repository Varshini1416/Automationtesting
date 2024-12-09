package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script01 
{
	@Test
	public void testcase()
	{
		Reporter.log("hello",true);
	}
	@Test
	public void testcase1()
	{
		Reporter.log("goodmorning",true);
	}


}
