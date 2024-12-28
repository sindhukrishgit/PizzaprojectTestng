package Day42testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orangehrmtestcase {
	WebDriver driver;
	
	
  @Test(priority=1)
  public void openapp() {
	  driver = new ChromeDriver();//launch chrome
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
	  driver.manage().window().maximize();
	  System.out.println("App opened");
  }
  
  @Test(priority=2)
  public void logochk() throws InterruptedException {
	  Thread.sleep(3000);
	  Boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println("logo found "+status);
	   
	  
  }
  
  @Test(priority=3)
  public void login() {
	  driver.findElement(By.xpath("//p[normalize-space()='Username : Admin']"));
	  driver.findElement(By.xpath("//p[normalize-space()='Password : admin123']"));
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  System.out.println("login done");
	//button[normalize-space()='Login']
	  
  }
  
  
  
  
  @Test(priority=4)
  public void close() {
	  
	  driver.close();
	  System.out.println("Applicatn is closed");
  }
  
  
  
}
