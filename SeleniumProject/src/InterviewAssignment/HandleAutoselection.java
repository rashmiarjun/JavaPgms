package InterviewAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.LineListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.nashorn.internal.ir.Optimistic;

public class HandleAutoselection {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	WebElement searchbox = driver.findElement(By.name("q"));
	searchbox.sendKeys("LTE");
	List<WebElement> opt = driver.findElements(By.xpath("//span[contains(.,'lte')"));
	int count=opt.size();
	for(WebElement ah:opt)
	{
		System.out.println(ah.getText());
	}
	opt.get(6).click();
}
}
