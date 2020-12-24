package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EncapTest {
	private WebElement UNTB;
	private WebElement Pass;
	private WebElement login;
	 
	public EncapTest(WebDriver driver) 
	{
		 
		UNTB=driver.findElement(By.name("username"));
		Pass=driver.findElement( By.name("pwd"));
		login=driver.findElement(By.id("loginButton"));
	}
	public void setUname(String uname) 
	{
		UNTB.sendKeys(uname);
	}
	public void settpass(String pass) 
	{
		Pass.sendKeys(pass);
	}
	public void Login() 
	{
	login.click();
	}
		
		
	
}
