package Selinterview;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class findelms {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoblaze.com/");
		
		WebElement ele = driver.findElement(By.xpath("//b[normalize-space()='Get in Touch']"));
     	System.out.println(ele.getText());//
		
     	List<WebElement> links = driver.findElements(By.xpath("//div[@class='col-lg-3']//a"));
     	System.out.println(links.size());
     	
		for(WebElement elem:links)
		{	
			System.out.println(elem.getText());
		}

	}

}
