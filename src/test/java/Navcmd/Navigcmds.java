package Navcmd;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigcmds {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.pizzahut.co.in");
	/*driver.get("https://testautomationpractice.blogspot.com/");	
	
	System.out.println(driver.getCurrentUrl());

	//URL url= new URL("https://testautomationpractice.blogspot.com/");
			//driver.navigate().to(url);
//driver.navigate().to("https://testautomationpractice.blogspot.com/");
driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
System.out.println(driver.getCurrentUrl());

System.out.println(driver.getTitle());
System.out.println(driver.getPageSource());
driver.navigate().back();
System.out.println(driver.getCurrentUrl());

//System.out.println(driver.getCurrentUrl());

//driver.navigate().refresh();*/

	}

}
