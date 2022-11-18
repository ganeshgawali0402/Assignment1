package comAssignment.Assignment1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgAnnotations {
	WebDriver driver = null;
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com");
		WebElement Username = driver.findElement(By.xpath("//input [@type='text']"));
		Username.sendKeys("john");
		WebElement Password = driver.findElement(By.xpath("//input [@type='password']"));
		Password.sendKeys("demo");
		driver.findElement(By.xpath("//input [@type='submit']")).click();
	}

	@Test(priority = 1)
	public void savings() {
		String actual = driver.getCurrentUrl();
		String expected="https://parabank.parasoft.com/parabank/overview.htm";
		if (expected.equals(actual)) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login Falied.");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();
		Select AccType=new Select(driver.findElement(By.id("type")));
		AccType.selectByVisibleText("SAVINGS");
		
		Select AcceExis=new Select(driver.findElement(By.id("fromAccountId")));
		AcceExis.selectByIndex(0);
		
		driver.findElement(By.xpath("//input [@type='submit']")).click();
		driver.findElement(By.xpath("//a [@class='ng-binding']")).click();
		//WebElement newAcc=driver.findElement(By.id("newAccountId"));
		//System.out.println(newAcc);
	}
	
	@Test(priority = 2)
	public void checking() throws InterruptedException {
		String actual = driver.getCurrentUrl();
		String expected="https://parabank.parasoft.com/parabank/overview.htm";
		if (expected.equals(actual)) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login Falied.");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();
		Select AccType=new Select(driver.findElement(By.id("type")));
		AccType.selectByVisibleText("CHECKING");
		Thread.sleep(1000);
		
		Select AcceExis=new Select(driver.findElement(By.id("fromAccountId")));
		AcceExis.selectByIndex(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input [@type='submit']")).click();
		driver.findElement(By.xpath("//a [@class='ng-binding']")).click();
	}
	@Test(priority = 3)
	public void BillPay() {
	//To fill the Bill Pay form
			driver.findElement(By.xpath("//a[contains(text(),'Bill Pay')]")).click();
		
	}
		
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
		WebDriverManager.chromedriver().setup();
	}

	@AfterSuite
	public void afterSuite() {
	}

}
