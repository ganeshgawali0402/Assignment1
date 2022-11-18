package comAssignment.Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		//Invoking the browser using WebDriver Manager
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//Go to the required URL
	driver.get("https://parabank.parasoft.com");
	//Finding WebElemt of USername
	WebElement Username=driver.findElement(By.xpath("//input [@type='text']"));
	Username.sendKeys("john");

	WebElement Password=driver.findElement(By.xpath("//input [@type='password']"));
	Password.sendKeys("demo");
	
	driver.findElement(By.xpath("//input [@type='submit']")).click();
	System.out.println(driver.getTitle());
	
	String actual=driver.getCurrentUrl();
	String expected="https://parabank.parasoft.com/parabank/overview.htm";
	
	if(expected.equals(actual)) {
		System.out.println("Login Successful");
	}else {
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
	//To fill the Bill Pay form
	driver.findElement(By.xpath("//a[contains(text(),'Bill Pay')]")).click();
	
	}

}
