package Assertions;

import static org.testng.AssertJUnit.assertEquals;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class Softassert {

	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	@BeforeTest
	public void open() 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 driver.manage().window().maximize();
	}
	@Test
	public void softassertionurl()
	{
		 List<WebElement>links= driver.findElements(By.tagName("a"));
	     System.out.println("no of total links"+""+links.size());	 
		 String actualturl = driver.getCurrentUrl();
	      String expectedurl = "www.amazon.com";
	      softAssert.assertEquals(actualturl,expectedurl);
	      softAssert.assertAll();
	}
  @Test
  public void softassertiontitle()
	  	{
	      String actualtitle = driver.getTitle();
	      String expectedtitle = "Amazon.com. Spend less. Smile more.";
	      softAssert.assertEquals(actualtitle,expectedtitle);
	      softAssert.assertAll();
	}
	
	@AfterTest
	public void close()
	{
	    driver.close();		
	}
}
