package Selectclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sortofElements {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("file:///C:/Users/Lenovo/Desktop/HTML/singlesel.html");
	WebElement Ele= driver.findElement(By.id("country"));
	ArrayList<String> a=new ArrayList<String>();
	Select sel=new Select(Ele);
	List<WebElement> opt = sel.getOptions();
	for(WebElement s:opt)
	{
		String R=s.getText();
		a.add(R);
		Collections.sort(a);
	}
	for(String b:a)
	{
		System.out.println(b);
	}
	
	
	
}}


