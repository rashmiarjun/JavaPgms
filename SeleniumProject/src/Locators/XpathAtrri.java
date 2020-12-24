package Locators;
//Xpath by Attribute
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAtrri {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[]args)

{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Lenovo/Desktop/HTML/XpathExp.html");
    WebElement  UN1=driver.findElement(By.xpath("//input[@value='A']")); 
    UN1.clear();
    UN1.sendKeys("Sagar");
    WebElement  PSW1=driver.findElement(By.xpath("//input[@value='B']")); 
    PSW1.clear();
    PSW1.sendKeys("Arjunagi");
    WebElement  UN2=driver.findElement(By.xpath("//input[@value='C']")); 
    UN2.clear();
    UN2.sendKeys("sarika");
    WebElement  PSW2=driver.findElement(By.xpath("//input[@value='D']")); 
    PSW2.clear();
    PSW2.sendKeys("Arjunagi");
    
}
}
