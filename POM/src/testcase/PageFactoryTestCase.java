package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import PageObjects.PageFactoryloginpageobject;

public class PageFactoryTestCase {
	
	
	@Test
	public void login() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
	
	
		
		//page factory method
		
		PageFactory.initElements(driver, PageFactoryloginpageobject.class);
		
		PageFactoryloginpageobject.username.sendKeys("Admin");
		PageFactoryloginpageobject.password.sendKeys("admin123");
		PageFactoryloginpageobject.button.click();
	}
	
}
