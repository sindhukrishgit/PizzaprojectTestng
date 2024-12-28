package Autosuggdrpdwn;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Autosuggdrpdwnn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		Thread.sleep(5000);
		

      List<WebElement>lst =driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']")); 
      System.out.println("No. of Autosuggs "+lst.size());  
      
      for(int i=0;i<lst.size();i++)
      {
    	  //System.out.println(lst.get(i).getText());selenium dev
    	  
    	  if(lst.get(i).getText().equals("selenium dev"))
    	  {
    		  lst.get(i).click();
    		  break;
            }
      }
	}
}


  