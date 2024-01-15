package Mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Movetoelement {
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void alert() throws InterruptedException
	{
		Actions ac = new Actions(driver);
		WebElement link =driver.findElement(By.linkText("Gmail"));
		ac.moveToElement(link).build().perform();
		Thread.sleep(2000);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
