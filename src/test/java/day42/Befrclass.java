package day42;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Befrclass {

		@BeforeClass
		void login() {
		
			System.out.println("Do login....... ");
			
	     }
		@AfterClass
		void logout() {
			
			System.out.println("Logout......");
		}	
		
		
	    @Test(priority=1)
		void search() {
			System.out.println("Search...afterclass.");
			
		}
		@Test(priority=2)
		void advsearch() {
			System.out.println("Adv.Search..afterclass..");
		}
}		
