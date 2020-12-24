package Webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MgetTitle1
{
static 
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[]args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
	//get the title of the browser
	String aTitle=driver.getTitle();
	System.out.println(aTitle);
	driver.close();
}
}
