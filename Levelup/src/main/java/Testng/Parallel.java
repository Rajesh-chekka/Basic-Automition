package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	
	@Test(invocationCount = 2,invocationTimeOut=10000,threadPoolSize = 2)
	public void chiranjeevi() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 //driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.close();
	}

}
