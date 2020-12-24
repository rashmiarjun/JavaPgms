package Popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileuploadpopup {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.MICROSECONDS);
	driver.get("http://192.168.56.1:82/login.do");
	WebElement link = driver.findElement(By.xpath("//a[@target='_blank']"));
	link.click();
	String pw = driver.getWindowHandle();
	Set<String> tabs = driver.getWindowHandles();
	int count=tabs.size();
	System.out.println(count);
	for(String tab:tabs)
	{
		driver.switchTo().window(tab);
		if(pw.equals(tab))
		{
			System.out.println(driver.getTitle());
		}
		else 
		{
			WebElement helpC=driver.findElement(By.xpath("//a[text()='Help centre'])"));
			Actions act=new Actions(driver);
				
			}
		}
	}
		
}
	

