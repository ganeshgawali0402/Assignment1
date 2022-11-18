package com.Assignment1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BillPayment  extends HomePage {

	public BillPayment(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input [@name='payee.name']")
	@CacheLookup
	WebElement PayeeName;
	
	@FindBy(xpath="//input [@name='payee.address.street']")
	@CacheLookup
	WebElement Address;
	
	@FindBy(xpath="//input [@name='payee.address.city']")
	@CacheLookup
	WebElement City;
	
	@FindBy(xpath="//input [@name='payee.address.state']")
	@CacheLookup
	WebElement State;
	
	@FindBy(xpath="//input [@name='payee.address.zipCode']")
	@CacheLookup
	WebElement ZipCode;
	
	@FindBy(xpath="//input [@name='payee.phoneNumber']")
	@CacheLookup
	WebElement phone;
	
	@FindBy(xpath="//input [@name='payee.accountNumber']")
	@CacheLookup
	WebElement AccountNumber;
	
	@FindBy(xpath="//input [@name='verifyAccount']")
	@CacheLookup
	WebElement VerifyAccountNumber;
	
	
	
	@FindBy(xpath="//input [@name='amount']")
	@CacheLookup
	WebElement Amount;
	
	@FindBy(xpath="//input [@type='submit']")
	@CacheLookup
	WebElement btnSendPayment;
	
	public void EnterName() {
		PayeeName.sendKeys("Gan");
	}
	
	public void Address() {
		Address.sendKeys("India");
	}
	
	public void City() {
		City.sendKeys("Pune");
	}
	
	public void State() {
		State.sendKeys("Maharastra");
	}
	
	
	public void ZipCode() {
		ZipCode.sendKeys("126123");
	}
	
	public void Phone() {
		phone.sendKeys("988117");
	}
	
	public void AccountNum() {
		AccountNumber.sendKeys("12345");
	}
	
	public void VerifyAccountNum() {
		VerifyAccountNumber.sendKeys("12345");
	}
	
	public void Amount() {
		Amount.sendKeys("50");
	}
	public void Sendpament() {
		btnSendPayment.click();
	}
}
