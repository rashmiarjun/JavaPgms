package InterviewAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra
{
static
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
 public static void main(String[] args)//throws InterruptedException
	
{
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.myntra.com");
		  String  ptab=driver.getWindowHandle();
		  driver.findElement(By.className("desktop-searchBar")).sendKeys("kurtas for women",Keys.ENTER);
		 driver.findElement(By.className("img-responsive")).click();
		  
		 /* Set<String> whs=driver.getWindowHandles();
		  int Count=whs.size();
		  System.out.println(Count);
		  for(String W:whs)*/
		  {
			 
		  }

}
}
