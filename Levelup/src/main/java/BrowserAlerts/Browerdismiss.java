package BrowserAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;	

public class Browerdismiss {
	WebDriver driver;	
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}
	@Test
	public void alert() throws InterruptedException
	{
		WebElement button =driver.findElement(By.id("promptAlert"));
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		 js.executeScript("arguments[0].click();", button);
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Yes");
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	}

	@AfterTest
	public void close()
	{
		driver.close();
	}

}
