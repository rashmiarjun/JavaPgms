package Webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MgetcurrentURL 
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
  //Thread.sleep(1000);
  //get the current browser URL
  String Curl=driver.getCurrentUrl();
  System.out.println(Curl);
  driver.close();//it will close only current/parent browser
  driver.quit();//close the parent as well as child browser


}
}
