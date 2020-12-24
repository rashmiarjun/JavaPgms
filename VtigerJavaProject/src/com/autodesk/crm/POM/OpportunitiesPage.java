package com.autodesk.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage {

	@FindBy(linkText = "Opportunities")
	private WebElement oppLink;

	@FindBy(xpath = "//img[@title='Create Opportunity...']")
	private WebElement createOppLink;

	@FindBy(name = "potentialname")
	private WebElement oppNameTextField;

	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement relatedToTextField;

	@FindBy(name = "sales_stage")
	private WebElement selectSalesStage;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement clicksavebutton;

	public WebElement getOppLink() {
		return oppLink;
	}

	public WebElement getCreateOppLink() {
		return createOppLink;
	}

	public WebElement getOppNameTextField() {
		return oppNameTextField;
	}

	public WebElement getRelatedToTextField() {
		return relatedToTextField;
	}

	public WebElement getSelectSalesStage() {
		return selectSalesStage;
	}

	public WebElement getClicksavebutton() {
		return clicksavebutton;
	}

	public OpportunitiesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
