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

public class Slider {
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		WebDriverManager.chromedriver().setup();

		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
	}
	@Test
	public void alert() throws InterruptedException
	{
		Actions ac = new Actions(driver);
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.id("slider")); 
		int loc = slider.getLocation().x;
		
		ac.dragAndDropBy(slider, 250,loc).build().perform();
		Thread.sleep(1000);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	


}
