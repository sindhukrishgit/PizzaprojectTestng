package Pageobjmod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageoModLoginpg {

	WebDriver driver;
	
	//constructr
	PageoModLoginpg(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	//Locrs
	
	/*By uusr = By.xpath("//input[@placeholder='Username']");
	By psd = By.xpath("//input[@placeholder='Password']");
	By logn = By.xpath("//button[@type='submit']");
	*/
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement uusr;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement psd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement logn;
	
	
	
	//Actnmethods
	public void setusername(String user)
	{
		 uusr.sendKeys(user);
	}
	 
    public void setpasswrd(String pwd)
	{
		psd.sendKeys(pwd);
	}	
	public void lognclick()
	{
		logn.click();
	}
	
}
