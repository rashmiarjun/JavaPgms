package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertpopup {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://192.168.56.1:82/login.do");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement( By.name("pwd")).sendKeys("manager");
    driver.findElement(By.id("loginButton")).click();
    Thread.sleep(2000);
    WebDriverWait wait=new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
   driver.findElement(By.xpath("//div[contains(text(),'Settings')]")).click();
   driver.findElement(By.xpath("//a[contains(text(),'Logo & Color Scheme')]")).click();
   driver.findElement(By.id("uploadNewLogoOption")).click();
   driver.findElement(By.id("FormModifiedDivButton")).click();
   driver.switchTo().alert().accept();
	
}
}