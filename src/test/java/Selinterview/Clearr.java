package Selinterview;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clearr {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoblaze.com/");// 
		WebElement ele = driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
     	System.out.println(ele.getAttribute("class"));
		
     	

	}

}
