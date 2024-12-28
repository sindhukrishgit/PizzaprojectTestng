package Selinterview;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class dispmeth {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com/"); 
		//WebElement searchelement = driver.findElement(By.id("APjFqb"));
		//searchelement.sendKeys("cow");
	    driver.get("https://www.vethathiri.edu.in/");
	    WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Privacy Policy'"));
		
		System.out.println(ele.getText());
		
		//System.out.println(searchelement.isDisplayed());
		//System.out.println(searchelement.isEnabled());	
		//List <WebElement> links = driver.findElements(By.cssSelector("a[aria-label='Gmail ']"));
		//System.out.println(links.size());//
		
		//link link--text list-menu__item list-menu__item--link
		
		
		
		
	}
	

}
 
 


		