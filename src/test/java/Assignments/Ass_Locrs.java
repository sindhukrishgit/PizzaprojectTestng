package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Ass_Locrs {
	public static void main(String[] args) {
		
     WebDriver driver = new ChromeDriver();
     driver.get("https://demoblaze.com/");
   //  List<WebElement> linksnum = driver.findElements(By.tagName("a"));
     //System.out.println("no. of links are " +linksnum.size());
     
     //List<WebElement> numofimages = driver.findElements(By.tagName("img"));
     //System.out.println("no. of images are " + numofimages.size());
     
    // driver.findElement(By.linkText("Laptops")).click();
   List<WebElement> links =   driver.findElements(By.tagName("a"));
   System.out.println("no. of links are " +links.size());
   
  // driver.findElement(By.linkText("Phones")).click();
		
     for(int i=0;i<=links.size();i++)
     {
    	 System.out.println(links.get(i).getText());
   
			
	}

   }
}	
