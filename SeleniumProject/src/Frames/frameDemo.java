package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameDemo {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Lenovo/Desktop/HTML/frame2.html");
	WebElement UN = driver.findElement(By.id("t1"));
	UN.sendKeys("Rashmi");
	driver.switchTo().frame(0);
	WebElement PW = driver.findElement(By.id("t2"));
	PW.sendKeys("Arjunagi");
	PW.clear();
	driver.switchTo().parentFrame();//to switch to parent frame 
	UN.clear();
	UN.sendKeys("Rakshitshetty");
	
}
}