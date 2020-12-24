package JavaScriptExecutorDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingscollingpage {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException
 {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://192.168.56.1:82/login.do");
	Set<String> pw=driver.getWindowHandles();
	driver.findElement(By.linkText("view License")).click();
	Set<String> whs=driver.getWindowHandles();
	int count=whs.size();
	System.out.println(count);
	for(String w:whs)
	{
		driver.switchTo().window(w);
		if(pw.equals(w))
		{
			driver.close();
		}
		else
		{
			driver.manage().window().maximize();
			WebElement parg=driver.findElement(By.xpath("//h2[text()='7.Termination']"));
			int yaxis=parg.getLocation().getY();
			System.out.println(yaxis);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			Thread.sleep(2000);
			js.executeScript("window.scollTo(0,"+yaxis+")");
			driver.close();
		}
	}

}
}
