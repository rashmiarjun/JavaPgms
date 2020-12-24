package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MgetWindowH {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
  public static void main(String[] args)
{
	//throws InteruptedException
  WebDriver	driver=new ChromeDriver();
  //open the browser
  driver.get("http://www.naukri.com");
  driver.manage().window().maximize();
  //get the current browser address
  String wh=driver.getWindowHandle();
  System.out.println(wh);
  //close parent and child browser
  driver.quit();
}
}
