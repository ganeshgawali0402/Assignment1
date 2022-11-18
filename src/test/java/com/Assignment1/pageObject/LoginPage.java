package com.Assignment1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver ldriver;
public LoginPage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
@FindBy(xpath="//input [@name='username']")
@CacheLookup
WebElement textUserName;

@FindBy(xpath="//input [@type='password']")
@CacheLookup
WebElement textPassword;

@FindBy(xpath="//input [@type='submit']")
@CacheLookup
WebElement btnLogin;

public void setUSerName(String uname) {
	textUserName.sendKeys(uname);
}

public void setPassword(String pwd) {
	textPassword.sendKeys(pwd);
}

public void clickSubmit() {
	btnLogin.click();
}
}
