package InterviewAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class verifytheActiTimeissuedate {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException
 {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://192.168.56.1:82/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement( By.name("pwd")).sendKeys("manager");
    driver.findElement(By.id("loginButton")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[contains(text(),'Settings')]")).click();
    driver.findElement(By.xpath("//a[contains(.,'Licenses')]")).click();
    WebElement issueDate = driver.findElement(By.className("//td[contains(.,'Jul 14, 2017')]"));
    Thread.sleep(1000);
    System.out.println(issueDate.getText());
  	
  
}
}
