package grpngtestng;

import org.testng.annotations.Test;

public class SignupTests {

	
	@Test(priority=1,groups= {"regression"})
	void SignupByEmail()
	{
		System.out.println("This is signup by email");
	}
	
	
	@Test(priority=1,groups= {"regression"})
	void SignupbyByFacebuk()
	{
		System.out.println("This is signup by facebook");
		
	}
	
	@Test(priority=1,groups= {"regression"})
	void SignupByTwitter()
	{
		System.out.println("This is signup by twitter");
	}
	
	
	
	
	
	
	
	
}
