package slidr;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//span[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-hover ui-state-focus']

public class selslidrs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();
       WebElement str =  driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]]"));
       System.out.println(str);
	
	}

}
