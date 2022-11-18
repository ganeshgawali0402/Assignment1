package com.Assignment1.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends LoginPage {
	public HomePage(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[contains(text(),'Open New Account')]")
	@CacheLookup
	WebElement OpenNewAcc;
	
	@FindBy(id="type")
	@CacheLookup
	WebElement SelectAcc;
	
	@FindBy(id="fromAccountId")
	@CacheLookup
	WebElement ExistingAcc;

	@FindBy(xpath="//input [@type='submit']")
	@CacheLookup
	WebElement BtnOpenNewAcc;
	
	@FindBy(xpath="//h1 [@class='title']")
	@CacheLookup
	WebElement AccOpened;
	
	@FindBy(xpath="//a [@id='newAccountId']")
	@CacheLookup
	WebElement NewAccId;
	
	@FindBy(xpath="//h1 [@class='title']")
	@CacheLookup
	WebElement AccDetails;
	
	@FindBy(xpath="//a[contains(text(),'Bill Pay')]")
	@CacheLookup
	WebElement BillpayLink;
	
	public void clickOpenNewAcc() {
		OpenNewAcc.click();
	}
	
	public void selectSavingAccounttype() {
		Select AccType=new Select(SelectAcc);
		AccType.selectByVisibleText("SAVINGS");
	}
	
	public void selectCheckingAccounttype() {
		Select AccType=new Select(SelectAcc);
		AccType.selectByVisibleText("CHECKING");
	}
	
	public void selectExistingAccounttype() {
		Select AcceExis=new Select(ExistingAcc);
		AcceExis.selectByIndex(0);
	}
	
	public void btnclickOpenNewAcc() {
		BtnOpenNewAcc.click();
	}
	
	public void AccountDetails() {
		AccOpened.isDisplayed();
	}
	
	public void NewAccID() {
		NewAccId.click();
	}
	public boolean NewAccountDetails() {
		return AccDetails.isDisplayed();
	}
	public void BillpayLink() {
		BillpayLink.click();
	}
}
