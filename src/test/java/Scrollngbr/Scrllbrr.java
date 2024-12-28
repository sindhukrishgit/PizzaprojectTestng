package Scrollngbr;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrllbrr {

	public static void main(String[] args) {
		
	 	 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com/");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1500)","");
		 
		 System.out.println(js.executeScript("return window.pageYOffset;"));
		
		

	}

}
