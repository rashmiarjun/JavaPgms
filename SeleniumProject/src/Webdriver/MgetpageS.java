package Webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MgetpageS 
{
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
	  //get the current browser source code
	  String CPSource=driver.getPageSource();
	  System.out.println(CPSource);
	  //close parent and child browser
	  driver.quit();

}
}
