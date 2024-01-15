package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshotimage {
	
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
@ Test
public void shot() throws IOException, InterruptedException {
	driver.findElement(By.id("email")).sendKeys("rajesh143702@gmail.com");
	Thread.sleep(5000);
	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshot, new File("C:\\Users\\Ram\\eclipse-workspace\\Levelup\\screenshot\\PageScreenshot.png"));
     System.out.println("the pic is captured  ");
	
}
@AfterTest 
public void close()
  {
	driver.close();
  }
}
