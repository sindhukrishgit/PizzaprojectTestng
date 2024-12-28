package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselnium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://testautomationpractice.blogspot.com/");  
		  driver.manage().window().maximize();
		  
		  WebElement drpdownElement = driver.findElement(By.xpath("//select[@id='country']"));
		  Select drpobj = new Select(drpdownElement);
		  
		  drpobj.selectByVisibleText("France");
		 // drpobj.selectByValue("japan");
		  
		  drpobj.selectByIndex(3);
		  
		 List<WebElement> options=drpobj.getOptions();
		 System.out.println("Num of options"+options.size());
		 
		  for(WebElement op:options)
		  {
			  System.out.println(op.getText());
			  
		  }
		  
		  
		  
		  
		  
		  
		   
		  
		  
		  
		  
		  
		  
		  
	}

}
