package JavaScriptExecutorDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

public class ScrolldownpgusingJS {
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
