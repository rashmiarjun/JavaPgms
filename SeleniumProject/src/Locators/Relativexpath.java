package Locators;
//Relative Xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[]args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Lenovo/Desktop/HTML/XpathExp.html");
    WebElement  Un1=driver.findElement(By.xpath("//div[1]/input[1]"));//using Relative Xpath expression
    Un1.clear();
    Un1.sendKeys("Rashmi");
    WebElement  Ps1=driver.findElement(By.xpath("//div[1]/input[2]"));//using  Relative Xpath expression
    Ps1.clear();
    Ps1.sendKeys("Arjunagi");
    WebElement  Un2=driver.findElement(By.xpath("//div[2]/input[1]"));//using  Relative Xpath expression
    Un2.clear();
    Un2.sendKeys("India");
    WebElement  Ps2=driver.findElement(By.xpath("//div[2]/input[2]"));//using  Relative Xpath expression
    Ps2.clear();
    Ps2.sendKeys("Karnataka");
    
    driver.close();
}
}
