package Pageobjmod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class logntest {
    WebDriver driver;
	@BeforeClass
	void setup()
	{
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
		  driver.manage().window().maximize();
	}

	@Test
	void testlogin()
	{

		PageoModLoginpg lp = new PageoModLoginpg(driver);
	     lp.setusername("Admin");
	     lp.setpasswrd("admin123"); 		
	     lp.lognclick();
	     Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}

	@AfterClass
	void teardown()
	{
	  driver.close();
	}

}
