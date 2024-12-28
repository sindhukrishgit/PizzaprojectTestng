package Chechbx;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class keybrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");	
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Krish");
		Actions act = new Actions(driver);
        
		 
		 act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		// act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		// act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
 		// act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		 
		 
		 
	}

}
 