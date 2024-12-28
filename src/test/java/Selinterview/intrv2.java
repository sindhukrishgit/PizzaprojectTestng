package Selinterview;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class intrv2 {
	public static void main(String[] args) { 
		WebDriver driver= new ChromeDriver();
      
	driver.get("https://www.google.com/");   
       String tit = driver.getTitle();
       System.out.println(tit);
		
   //  driver.get("https://www.geeksforgeeks.org/");
     //  System.out.println(driver.getTitle());
       		
		//driver.navigate().back();
		 //System.out.println(driver.getTitle());
		  
		 driver.navigate().to("https://www.vethathiri.edu.in/");
		 System.out.println(driver.getTitle());
		 
		 Set whs = driver.getWindowHandles();//91786A5BEF2305F73DAFE826AA598921
		   System.out.println(whs);
		 //driver.navigate().refresh();
		
	}
}
