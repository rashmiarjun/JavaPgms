package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class Amazondemo {
		
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	  public static void main(String[] args)throws InterruptedException
	{
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.amazon.com");
		  System.out.println(driver.getTitle());
		  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple Iphone XR",Keys.ENTER);
        WebElement S=driver.findElement(By.xpath("//span[text()='Simple Mobile Prepaid - Apple iPhone XR (64GB) - Black']"));
		S.click();
    }
	}	  