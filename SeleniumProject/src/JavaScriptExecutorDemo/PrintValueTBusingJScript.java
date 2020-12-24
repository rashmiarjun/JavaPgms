package JavaScriptExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintValueTBusingJScript 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/HTML/XpathExp.html");
		WebElement UnTB = driver.findElement(By.id("mss267 "));
		//UnTB=document.getElementById('mss267');
		
		
	
	
	}

}
