package Selectclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {
	
	
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Lenovo/Desktop/HTML/singlesel.html");
		WebElement Ele= driver.findElement(By.id("country"));
		Select sel=new Select(Ele);
		sel.deselectAll();

}
}
