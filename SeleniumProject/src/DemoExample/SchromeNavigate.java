package DemoExample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver;
public class SchromeNavigate {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}

		public static void main(String[]args)
		{ 
			//open the browser
			ChromeDriver driver=new ChromeDriver();
			//maximize the browser
			driver.manage().window().maximize();
			//Enter the URL
			driver.get("http://www.youtube.com");
			System.out.println(driver.getTitle());
			//we can use Enter the URLwithout using get()
			driver.navigate().to("http://www.facebook.com");
			System.out.println(driver.getTitle());
			driver.navigate().back();
			System.out.println(driver.getTitle());
			driver.navigate().forward();
			System.out.println(driver.getTitle());
			//to close the current browser
			driver.close();
			
			
		}
}
