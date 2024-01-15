package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fblogin {
	@FindBy(id="email")
	WebElement user;
	
	//creating POM for password	
	@FindBy(id="pass")
	WebElement password;

	//creating POM for login button
	
	@FindBy(name="login")
	WebElement ok;
	public  Fblogin(WebDriver driver) //page name
	{
		PageFactory.initElements(driver, this);
	}
	   public void login(String u,String p)
		{
			user.clear();
			user.sendKeys(u);
			password.clear();
			password.sendKeys(p);
			ok.click();

	} 



}
