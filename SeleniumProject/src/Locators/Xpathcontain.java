package Locators;
import org.openqa.selenium.By;
//do it for ActiTime
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcontain {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
  public static void main(String[] args) throws InterruptedException
{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://192.168.56.1:82/login.do");
	  
	  String text=driver.findElement(By.xpath("//img[contains(@src,'actiTime')]")).getText();
	 Thread.sleep(1000);
	  System.out.println(text);
	  
	  String logo=driver.findElement(By.xpath("//img[contains(@src,'timer')]")).getText();
	  System.out.println(logo);
}
}
