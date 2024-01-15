package Testng;

import org.testng.annotations.AfterTest; 
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	WebDriver driver;
@BeforeTest
public void open() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}   
@Test
public void emaildetails() throws InterruptedException 
{
	driver.findElement(By.id("email")).sendKeys("###############");
	Thread.sleep(5000);
	
}
@Test(priority = 1)
public void passworddetails() throws InterruptedException
{
	driver.findElement(By.id("pass")).sendKeys("$$$$$$$$$$");
	Thread.sleep(2000);
	System.out.println("the is email is captured");
}
@Test(priority = 2)
public void login() throws InterruptedException 
{
	driver.findElement(By.name("login")).click();
	Thread.sleep(10000);
	System.out.println("the password is captured");
}

@AfterTest
public void close()
  {
	driver.close();
  }
}
