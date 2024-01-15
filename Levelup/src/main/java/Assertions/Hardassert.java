package Assertions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hardassert {
WebDriver driver;
@BeforeTest
public void open() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\driver\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.amazon.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(1000);
}
@Test
public void hardassertion()
{
	 List<WebElement>links= driver.findElements(By.tagName("a"));
     System.out.println("no of total links"+""+links.size());
      String actualtitle = driver.getTitle();
      String expectedtitle = "Amazon.com. Spend less. Smile more.";
     Assert.assertEquals(actualtitle,expectedtitle);
}
@AfterTest
public void close()
{
    driver.close();
	
}
}

