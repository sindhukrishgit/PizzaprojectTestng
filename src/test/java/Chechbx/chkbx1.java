package Chechbx;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chkbx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub { <WebElement> String
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");	
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		//WebElement ele= driver.findElement(By.xpath("//input[@id='sunday']"));
		//System.out.println("elemnt is"+ele);
		//System.out.println(ele.getText());
		List<WebElement>chks = driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
		System.out.println("no. of chkboxes"+chks.size());
		for(WebElement elem:chks)		
		{
			elem.click();
		}
    }
}