package Navcmd;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windhand {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//String wind =  driver.getWindowHandle();
		//Sytem.out.println(driver.getWindowHandle());
	//	driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		//System.out.println(wind);
		  
driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		Set <String> windowss = driver.getWindowHandles();
		
		List<String> windowids= new ArrayList(windowss);
		
		String parentwin = windowids.get(0);
		String childwin = windowids.get(1);
		System.out.println(parentwin);
		System.out.println(childwin); //a[normalize-space()='OrangeHRM, Inc']
		
		

	}

}
