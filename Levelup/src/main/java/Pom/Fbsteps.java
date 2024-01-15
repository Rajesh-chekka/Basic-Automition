package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Fbsteps {
	WebDriver driver;
	ChromeOptions p = new ChromeOptions();
	public void operation() throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		p.addArguments("--incognito");
		p.addArguments("--disable-notifications");

		   driver = new ChromeDriver(p );
			driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
				
		 Fblogin f = new Fblogin(driver);
		 f.login("rajesh143702@gmail.com", "Rajesh0007@");
		 Fblogout l = new Fblogout(driver);
		 l.logout();
				
	
	
	driver.close();
 
		

	}
}
