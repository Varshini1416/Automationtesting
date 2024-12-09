package testng;

import org.testng.annotations.Test;

public class Script {
	@Test(priority = 0)
	public void singup()
	{
		System.out.println("singup is succesfull");
	}
	@Test(priority = 1)
	public void login()
	{
		System.out.println("login is succesfull");
	}
@Test(priority = 2)
public void homepage()
{
	System.out.println("homepage is sucessfull");
}
@Test(priority = 3)
public void logout()
{
	System.out.println("logout is sucessfull");
}
}
