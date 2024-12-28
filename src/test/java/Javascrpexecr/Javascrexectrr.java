package Javascrpexecr;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascrexectrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 //driver.findElement(By.xpath("//input[@id='name']")).sendKeys("sindhuuu");	
		 
		// WebElement inpbx = driver.findElement(By.xpath("//input[@id='name']"));
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;

		// js.executeScript("arguments[0].setAttribute('value','sindhuu')",inpbx);
		 
		 WebElement radbutn = driver.findElement(By.xpath("//input[@id='male']"));
		 js.executeScript("arguments[0].click()",radbutn);
		 

	}

}
