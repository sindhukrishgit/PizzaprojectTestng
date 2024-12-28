package Statabl;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statabble {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		
		
		List<WebElement> rows =driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println("No. of rows "+rows.size());  
String txt = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		
System.out.println("No. of rows "+txt); 
	}

}
