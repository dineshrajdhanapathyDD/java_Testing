package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactoryloginpageobject {

	//without findelement
	
		@FindBy(how=How.NAME,using="username")
		public static WebElement username;
		
		@FindBy(name="password")
		public static WebElement password;
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
		public static WebElement button;
		
	
}
