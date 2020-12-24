package com.autodesk.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {

	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createleadsButton;

	@FindBy(linkText = "Leads")
	private WebElement leadsLink;

	@FindBy(name = "salutationtype")
	private WebElement nametitledropdown;

	@FindBy(name = "firstname")
	private WebElement firstnametextfield;

	@FindBy(name = "lastname")
	private WebElement lastnametextfield;

	@FindBy(name = "company")
	private WebElement companytextfield;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement clicksavebutton;

	@FindBy(xpath = "(//input[@title='Delete [Alt+D]'])[1]")
	private WebElement deletelead;

	public WebElement getCreateLeadsButton() {
		return createleadsButton;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getNametitledropdown() {
		return nametitledropdown;
	}

	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	public WebElement getCompanytextfield() {
		return companytextfield;
	}

	public WebElement getClicksavebutton() {
		return clicksavebutton;
	}

	public WebElement getDeletelead() {
		return deletelead;
	}

	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
