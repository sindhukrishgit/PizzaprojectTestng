package day_1;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class testcasesindhu1 {
	public static void main(String args[]) {

	WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.amazon.com/");
	
	String tit=driver.getTitle();

	System.out.println(tit);

	//String urlchk = "Amazon.com";
	if(tit.equals("Amazon.com"))
	{
		System.out.println("tst pass");  
	}
	else
	{
		System.out.println("tst fail");
	}
	
		driver.close();
  }
}