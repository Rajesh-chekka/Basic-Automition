package BrowserAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browserok {
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
	}
	@Test
	public void alert() throws InterruptedException
	{
		  driver.findElement(By.id("searchBtn")).click();
	      String value = driver.switchTo().alert().getText();
	      System.out.println(value);
	      Thread.sleep(3000);
	      driver.switchTo().alert().accept();
	      Thread.sleep(3000);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
