package Webdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MgetWindowHs {
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
  String pwh = driver.getWindowHandle();
  //get the current browser address
  Set<String> whs = driver.getWindowHandles();
  System.out.println(whs);
  int count=whs.size();// to get size of set
  System.out.println(count);
  for(String wh:whs)// for each loop to traverse set
  {
	  driver.switchTo().window(wh);
	  if(pwh.equals(wh))// if current window is equal to parent window 
	  {
		  String s = driver.getTitle();
		  System.out.println(s);
	  }
	  else
	  {
	driver.close();  
	  }
  }
  }
}


