package HandlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAutoSuggesion {
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
    WebElement searchBox=driver.findElement(By.name("q"));
    searchBox.sendKeys("famous");
    List<WebElement> auto = driver.findElements(By.xpath("//span[contains(text(),'famous')]"));
    int c=auto.size();
    System.out.println(c);
    for(WebElement Ah:auto)
    {
    	System.out.println(Ah.getText());
    }
    auto.get(6).click();
}
}
