package InterviewAssignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdownwebpage {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args)
 {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeAsyncScript("window, scrollBy(0,1000)");
}
}



