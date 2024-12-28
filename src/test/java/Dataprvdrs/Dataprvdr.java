package Dataprvdrs;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprvdr {

	WebDriver driver;
	@BeforeClass
	void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}	
	@Test(dataProvider="dp")
	void testlogin(String email,String pswd) throws InterruptedException
	{
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pswd);
	  driver.findElement(By.xpath("//input[@value='Login']")).click();	
	  Thread.sleep(2000);
	  
boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
   if(status==true)
   {

	   driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click(); 
	   Assert.assertTrue(true); 
   }
   else
   {
	   Assert.fail();
   }

}	
	
   @AfterClass
   void teardown()
   {
	   driver.close();
   }
   
   @DataProvider(name="dp")
   Object[][] loginData(){
    Object data[][]={
          {"abc@gmail.com","test11234"},
          {"abc@gmail.com","1234"},
          {"sindhukrish0009@gmail.com","test1124"},
          {"sindhukrish0009@gmail.com","1234"},
          {"abcdd@gmail.com","test5647"}
          };
        return data;
   }
  
}  
   
   
   
