package pageFactoryWithoutAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindBy {
	
	public static WebElement username;
	public static WebElement password;
	public static WebElement submit;
	
	
	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
		
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		
		//only name and id use cannot another locators 
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		
		
		
		
		
	}
	

}
