package ActionClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Contextlink 
{
		static 
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://192.168.56.1:82/login.do");
		WebElement Link = driver.findElement(By.linkText("Actimind Inc."));
		Actions act=new Actions(driver);
	    act.sendKeys(Keys.CONTROL).click(Link).perform();
	    Robot rb=new Robot();
	    rb.keyPress(KeyEvent.VK_W);
	
	}

}
