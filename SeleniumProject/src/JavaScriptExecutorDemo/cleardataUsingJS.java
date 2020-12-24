package JavaScriptExecutorDemo;
//remove the textbox content without using clear() and shortcuts
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class cleardataUsingJS {
   static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args)
	 {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/HTML/XpathExp.html");
		WebElement UnTB = driver.findElement(By.id("r1"));
		UnTB.sendKeys("Rash");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('r1').value=''");
}
}
