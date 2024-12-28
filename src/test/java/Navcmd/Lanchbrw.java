package Navcmd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lanchbrw {

  	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
		////input[@placeholder='Username']
		
		//driver.findElements(By.xpath("//input[@placeholder='Username']"));//
		
		////select[@id='input-country']
		
		  
		
		//Selector sel = new Selector();https://sindhukrish0009sl0038
		
		
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
	WebElement drp = 	driver.findElement(By.xpath("//select[@id='input-country']"));
	Select sel = new Select(drp);
	sel.selectByVisibleText("Algeria");
		
		
		
		
		
		
		
		
		
		

	}

}
