package com.autodesk.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createContactsButton;

	@FindBy(linkText = "Contacts")
	private WebElement contactslink;

	@FindBy(name = "firstname")
	private WebElement firstnametextfield;

	@FindBy(name = "lastname")
	private WebElement lastnametextfield;

	@FindBy(id = "email")
	private WebElement emailtextfield;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement clicksavebutton;

	@FindBy(name = "search_text")
	private WebElement searchfortextfield;

	@FindBy(id = "bas_searchfield")
	private WebElement searchintextfield;

	@FindBy(name = "submit")
	private WebElement searchsubmit;

	public WebElement getCreateContactsButton() {
		return createContactsButton;
	}

	public WebElement getContactslink() {
		return contactslink;
	}

	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getClicksavebutton() {
		return clicksavebutton;
	}

	public WebElement getSearchfortextfield() {
		return searchfortextfield;
	}

	public WebElement getSearchintextfield() {
		return searchintextfield;
	}

	public WebElement getSearchsubmit() {
		return searchsubmit;
	}

	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
