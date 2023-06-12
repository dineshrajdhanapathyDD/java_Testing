package testcase;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;

	public class LoginTestCase {
		@Test
		public void login() throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(10000);
			
			
			
			
			//normal testcase design
			
			/*WebElement username = driver.findElement(By.name("username"));
			username.sendKeys("Admin");
			
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("admin123");
			
			WebElement button = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			button.click();
			
			driver.quit();*/
			
			//LoginPageObjects loginPageObjects = new LoginPageObjects(); //obj 
			
			//method refer from LoginPageObjects
			
			LoginPageObjects.username(driver).sendKeys("Admin");
			LoginPageObjects.password(driver).sendKeys("admin123");
			LoginPageObjects.button(driver).click();
			
			
		}

	}



