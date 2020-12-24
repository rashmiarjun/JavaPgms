package InterviewAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actihomepageverify {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//driver.get("http://192.168.56.1:82/login.do");
	driver.navigate().to("http://192.168.56.1:82/login.do");
	String Actiwindow = driver.getTitle();
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement( By.name("pwd")).sendKeys("manager");
    driver.findElement(By.id("loginButton")).click();
    Thread.sleep(2000);
    WebElement s = driver.findElement(By.xpath("//td[contains(.,'Enter Time-Track')]"));
    String homepagewindow = driver.getTitle();
    if(Actiwindow.equals(homepagewindow))
    {
    	
    }
    else 
    {
    	driver.findElement(By.id("logoutLink")).click();
	}
    
}
}
