package day_1;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class css1 {
	public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://demo.nopcommerce.com");
	   	driver.manage().window().maximize();
//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
	   
driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
		
	
		
		
	}
}
