package InterviewAssignment;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closespecificbrowse {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.naukri.com");
	String pw = driver.getWindowHandle();
	Set<String> browsers= driver.getWindowHandles();
	int count=browsers.size();

}
}