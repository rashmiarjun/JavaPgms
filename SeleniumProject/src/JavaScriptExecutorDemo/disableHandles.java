package JavaScriptExecutorDemo;
//Enter the value into textBox using Java Script

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disableHandles
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException
 {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Lenovo/Desktop/HTML/XpathExp.html");
	//WebElement UnTB = driver.findElement(By.id("mss1234"));
	//UnTB.sendKeys("Rashmi");//to get the Exception 
	JavascriptExecutor JSE=(JavascriptExecutor)driver;
	JSE.executeScript("document.getElementById('mss1234').value='Arjun'");
	WebElement UnTB = driver.findElement(By.id("mss1234"));
	System.out.println(UnTB.getAttribute("value"));
}
}
