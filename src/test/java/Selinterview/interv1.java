package Selinterview;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class interv1 {
	public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
	   
	   String myurl = driver.getCurrentUrl();
	   System.out.println(myurl);
	   
	   String pgtit = driver.getTitle();
	   System.out.println(pgtit);
	   
	   String pgsrc = driver.getPageSource();
	   System.out.println(pgsrc);
	   
	   String wh = driver.getWindowHandle();
	   System.out.println(wh);//E58698A38BF621E420E36708026B4C17
	   
	   
		   
	   	//driver.manage().window().maximize();
//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
	   
//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts")
//drv.findElement(By.cssSelector("input.email text tryit-email[placeholder='Enter your email address here']")).sendKeys("sindu@gmail.com");	

	}
}