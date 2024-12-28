package grpngtestng;

import org.testng.annotations.Test;

public class Paymnttests {
	
	@Test(priority=1,groups= {"regression","sanity","functional"})
	void Paymntinrups()
	{
		System.out.println("This is paymnt in rupees");
	}
	
	
	@Test(priority=2,groups= {"regression","sanity","functional"})
	void Paymntindollars()
	{
		System.out.println("This is paymnt in dollars");
		
	}
	
	
	

}
