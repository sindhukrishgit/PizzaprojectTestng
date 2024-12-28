package Day42testng;

import org.testng.annotations.Test;

public class Myfirtestcase {
	
	
	@Test(priority=3)
	void logoutmode() {
	
		System.out.println("Do logout");
		
     }

	
    @Test(priority=1)
	void appopen() {
		System.out.println("opening app");
		
	}
	//@Test(priority=2)
	void loginmode() {
		
		System.out.println("Do login");
	}
	
	
	
	
	
	
}
