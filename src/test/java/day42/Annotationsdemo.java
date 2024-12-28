package day42;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationsdemo {
	@BeforeMethod
	void login() {
	
		System.out.println("Do login....... ");
		
     }

	
    @Test(priority=1)
	void search() {
		System.out.println("Search....");
		
	}
	@Test(priority=2)
	void advsearch() {
		
		System.out.println("Adv.Search....");
	}
	
	
	@AfterMethod
	void logout() {
		
		System.out.println("Logout......");
	}
	
	
	
	
	
	
	
}
