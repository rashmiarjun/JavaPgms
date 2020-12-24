package HandlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printmultilink
{
	
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	 List<WebElement> links = driver.findElements(By.name("//a"));
	int count=links.size();
	System.out.println("number of weblinks on application are"+count);
	for(WebElement weblink:links)
	{
		String Link=weblink.getText();
		System.out.println(Link);
}
}
}
