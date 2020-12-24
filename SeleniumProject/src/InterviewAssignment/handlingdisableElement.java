package InterviewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingdisableElement {

	
		
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args)
	 {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/HTML/XpathExp.html");
		JavascriptExecutor JSE=(JavascriptExecutor)driver;
		JSE.executeScript("document.getElementById('mss1234').value='Rakshit'");
		WebElement UnTB = driver.findElement(By.id("mss1234"));
		System.out.println(UnTB.getAttribute("value"));
	}
	}


