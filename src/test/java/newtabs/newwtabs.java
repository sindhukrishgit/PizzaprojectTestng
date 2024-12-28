package newtabs;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class newwtabs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		WebElement reglink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		System.out.println("link is "+reglink);
	     Actions act = new Actions(driver);
	     act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
	     List<String> ids=new ArrayList(driver.getWindowHandles());
	     driver.switchTo().window(ids.get(1));
	     String url=driver.getCurrentUrl();
	     System.out.println("current url is"+url);

	
	
	
	}
	
}
