package day_1;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class css2 {
	public static void main(String[] args) {
	   WebDriver drv = new ChromeDriver();
	   drv.get("https://www.orangehrm.com/");
	   	//driver.manage().window().maximize();
//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
	   
//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts")
drv.findElement(By.cssSelector("input.email text tryit-email[placeholder='Enter your email address here']")).sendKeys("sindu@gmail.com");	

	}
}