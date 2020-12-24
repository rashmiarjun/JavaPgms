package com.autodesk.crm.Generic;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Gaurav
 *
 */
public class WebDriverUtils {

	/**
	 * wait and check if element is active and clickable or not using explicitly
	 * 
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementStatus(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * wait until get the title of the page
	 * 
	 * @param driver
	 * @param title
	 */
	public void waitForPagetitle(WebDriver driver, String title) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains(title));
	}

	/**
	 * wait and check if element is there or not
	 * 
	 * @param driver
	 */
	public void implicitlywaitForElement(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * select the element in the dropdown box using value of the element
	 * 
	 * @param element
	 * @param value
	 */
	public void selectbyvalue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	/**
	 * select the element in the dropdown box using visibleText of the element
	 * 
	 * @param element
	 * @param value
	 */
	public void selectbyvisibletext(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByVisibleText(value);
	}

	/**
	 * select the element in the dropdown box using index of the element
	 * 
	 * @param element
	 * @param index
	 */
	public void selectbyindex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * select the all the visibleText in the dropdown
	 * 
	 * @param element
	 */
	public void allselectbyoptions(WebElement element) {
		Select sel = new Select(element);
		List<WebElement> option = sel.getAllSelectedOptions();
		Iterator<WebElement> it = option.iterator();
		while (it.hasNext()) {
			String list = it.next().getText();
			System.out.println("Selected option from the dropdown ---> " + list);
		}
	}

	/**
	 * Deselect an Element by value
	 * 
	 * @param element
	 * @param value
	 */
	public void deselectbyvalue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.deselectByValue(value);
	}

	/**
	 * Deselect an Element by index
	 * 
	 * @param element
	 * @param index
	 */
	public void deselectbyindex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.deselectByIndex(index);
	}

	/**
	 * Deselect an Element by visible text
	 * 
	 * @param element
	 * @param text
	 */
	public void deselectbyvisibletext(WebElement element, String text) {
		Select sel = new Select(element);
		sel.deselectByVisibleText(text);
	}

	/**
	 * it is used to hover the mouse to the element/target
	 * 
	 * @param driver
	 * @param target
	 */
	public void moveMouse(WebDriver driver, WebElement target) {
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}

	/**
	 * used for drag and drop a file
	 * 
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target);
	}

	/**
	 * used to double click on an Element
	 * 
	 * @param driver
	 * @param target
	 */
	public void doubleClick(WebDriver driver, WebElement target) {
		Actions act = new Actions(driver);
		act.doubleClick(target);
	}

	/**
	 * used to Right click on an Element
	 * 
	 * @param driver
	 * @param target
	 */
	public void rightClick(WebDriver driver, WebElement target) {
		Actions act = new Actions(driver);
		act.contextClick(target);
	}

	/**
	 * used to left click on an Element
	 * 
	 * @param driver
	 */
	public void leftClick(WebDriver driver, WebElement target) {
		Actions act = new Actions(driver);
		act.click(target);
	}

	/**
	 * used to switch between window to perform the task and verify the title
	 * 
	 * @param driver
	 * @param pagetitle
	 */
	public void switchToNewTab(WebDriver driver, String pagetitle) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			String actpagetitle = driver.getTitle();
			if (actpagetitle.contains(pagetitle)) {
				break;
			}
		}
	}

	/**
	 * to accept the alertpopups
	 * 
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	/**
	 * to dismiss alertpopups
	 * 
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * used to maximize window
	 * 
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void verification(WebDriver driver, String actuallogintitle, String pageName) {
		String exptdlogintitle = driver.getTitle();
		if (actuallogintitle.contains(exptdlogintitle))
			System.out.println(pageName + " is verified --> " + exptdlogintitle);
		else
			System.err.println(pageName + " is not verified --> " + exptdlogintitle);
	}

	public boolean elementDisplayedValidation(WebElement element, String elementName) {
		if (element.isDisplayed())
			System.out.println(elementName + " Element is Displayed");
		else
			System.err.println(elementName + " Element is not Displayed");
		return element.isDisplayed();
	}

	public void scrollupAndDown(WebDriver driver, WebElement element) {
		int yaxis = element.getLocation().getY();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0," + yaxis + ")");
	}

}
