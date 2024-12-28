package day_1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locrsorange {
	public static void main(String args[]) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");//a[@id='nav-logo-sprites']
	
	// WebElement ele = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	 
	  //  Boolean  val= ele.isDisplayed();
	   // System.out.println(val);
	    
	
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
	 driver.navigate().back();
	 
	
	
	
//	driver.findElement(By.id("twotabsearchtextbox"));
//	WebElement idvalue = driver.findElement(By.id("twotabsearchtextbox"));
	//System.out.println("value of ID attribute is " + idvalue);
	//.sendKeys("dress");

 //  boolean vals = driver.findElement(By.id("navbarSupportedContent")).isDisplayed();
 //  System.out.println(vals);
	//driver.findElement(By.linkText("Mobile App")).click();
	//List<WebElement> links = driver.findElements(By.tagName("a"));	
	//System.out.println("no. of links in orange hrm is " + links.size());
	
	
/*List<WebElement>headerlinks = driver.findElements(By.className("list-inline-item"));
	System.out.println("size is " + headerlinks.size());
	List<WebElement>links = driver.findElements(By.tagName("a"));	
	System.out.println("no. of links is " + links.size());
	List<WebElement>images = driver.findElements(By.tagName("img"));	
	System.out.println("no. of images is " + images.size());
	//driver.close();*/
  }
}