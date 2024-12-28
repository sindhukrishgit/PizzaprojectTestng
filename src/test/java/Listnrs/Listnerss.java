package Listnrs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(Listnrs.Mylistrnrs.class)
public class Listnerss {

	WebDriver driver;

	  @BeforeClass
	 
	  void setup() throws InterruptedException
	  {
		  	  	  
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	  }

	  @Test(priority=1)
	  void testlogo() 
	  {
		  
		 boolean status = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']")).isDisplayed();
	      Assert.assertEquals(status, true);
		  
	   }
	  
	 
	  
	  @Test(priority=2)
	  void testUrl() 
	  {
		  Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangemlive.com/web/index.php/auth/login");
		 

	   }
	  
	  
	  @Test(priority=3,dependsOnMethods= {"testUrl"})
	  void testhomepageTitle() 
	  {
		  Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		 

	   }
	  
	  @AfterClass
	  void teardown()
	  {
		  driver.close();
	  }
	
}


