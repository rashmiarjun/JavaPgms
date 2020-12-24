package InterviewAssignment;

import java.io.File;
import org.apache.commons.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import sun.applet.Main;

public class TakesScrshotdemo 
{

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File des=new File("./Photos/G1.png");
	FileUtils.copyFile(src,des);
	
}
}
