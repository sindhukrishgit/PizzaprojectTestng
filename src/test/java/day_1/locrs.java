package day_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

		

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locrs {
	public static void main(String args[]) {

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.opencart.com/");
	driver.findElement(By.linkText("Desktops")).click();
	
List<WebElement>headerlinks = driver.findElements(By.className("list-inline-item"));
	System.out.println("size is " + headerlinks.size());
	List<WebElement>links = driver.findElements(By.tagName("a"));	
	System.out.println("no. of links is " + links.size());
	List<WebElement>images = driver.findElements(By.tagName("img"));	
	System.out.println("no. of images is " + images.size());

		
		//driver.close();
  }
}