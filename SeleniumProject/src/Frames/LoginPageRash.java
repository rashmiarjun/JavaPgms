package Frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageRash {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("http://192.168.56.1:82/login.do");
	EncapTest EN=new EncapTest(driver);
	EN.setUname("admin");
	EN.settpass("Manager");
	EN.Login();
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	EN.setUname("");
	EN.settpass("Manager");
	EN.Login();
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	EN.setUname("admin");
	EN.settpass("");
	EN.Login();
}

}
