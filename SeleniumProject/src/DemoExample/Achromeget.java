package DemoExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Achromeget 
{
static 
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[]args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.javatpoint.com");
	String aTitle=driver.getTitle();
	System.out.println(aTitle);
	driver.getCurrentUrl();
	//get the current page source code
	driver.getPageSource();
	driver.getWindowHandle();
	driver.close();
}
}
