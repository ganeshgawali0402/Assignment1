package com.Assignment1testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Assignment1.pageObject.BillPayment;
import com.Assignment1.pageObject.HomePage;
import com.Assignment1.pageObject.LoginPage;

public class TC_LoginTest_Checking_001 extends BaseClass {
	@Test
	public void loginTestChecking() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		HomePage hp=new HomePage(driver);
		BillPayment bp=new BillPayment(driver);
		
		
		lp.setUSerName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("ParaBank | Accounts Overview")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		hp.clickOpenNewAcc();
		hp.selectCheckingAccounttype();
		hp.selectExistingAccounttype();
		Thread.sleep(1000);
		hp.btnclickOpenNewAcc();
		Thread.sleep(1000);
		hp.AccountDetails();
		Thread.sleep(1000);
		hp.NewAccID();
		hp.NewAccountDetails();
		Thread.sleep(2000);
		hp.BillpayLink();
		bp.EnterName();
		bp.Address();
		bp.City();
		bp.State();
		bp.ZipCode();
		bp.Phone();
		bp.AccountNum();
		bp.VerifyAccountNum();
		bp.Amount();
		bp.Sendpament();
}
}
/*driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();
Select AccType=new Select(driver.findElement(By.id("type")));
AccType.selectByVisibleText("CHECKING");
Thread.sleep(1000);

Select AcceExis=new Select(driver.findElement(By.id("fromAccountId")));
AcceExis.selectByIndex(0);
Thread.sleep(1000);
driver.findElement(By.xpath("//input [@type='submit']")).click();*/
