package Popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserpopup {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("http://www.naukri.com");
	String pw = driver.getWindowHandle();
	Set<String> browsers= driver.getWindowHandles();
	int count=browsers.size();
	System.out.println(count);
	for(String cb:browsers)
	{
		driver.switchTo().window(cb);
		driver.close();
	}

}
}
