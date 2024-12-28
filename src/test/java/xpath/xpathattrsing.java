package xpath;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class xpathattrsing {

	public static void main(String[] args) {
	
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.com/");
      
      driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("dress");
   
    
		
		
		
		
	}

}
