package grpngtestng;

import org.testng.annotations.Test;

public class loginTests {

	@Test(priority=1,groups= {"sanity"})
	void loginByEmail()
	{
		System.out.println("This is login by email");
	}
	
	
	@Test(priority=1,groups= {"sanity"})
	void loginByFacebuk()
	{
		System.out.println("This is login by facebook");
		
	}
	
	@Test(priority=1,groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("This is login by twitter");
	}
	
	
	
}
