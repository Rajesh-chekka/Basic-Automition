 package Windowhandles;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://canarabank.com/NET_Banking.aspx");
		driver.manage().window().maximize();
	}
	@Test
	public void alert() throws InterruptedException
	{
		 WebElement tabeedWindow= driver.findElement(By.xpath("(//button[@type ='submit'])[2]"));
	     tabeedWindow.click();
	     Thread.sleep(1000);
	     Set<String>windowIds = driver.getWindowHandles();
	     Iterator<String>iter = windowIds.iterator();
	     String mainWindow = iter.next();
	     String childWindow = iter.next();
	     driver.switchTo().window(childWindow);
	     System.out.println("The title of childwindow  ="+" "+driver.getTitle());
	     Thread.sleep(10000);
	     driver.close();
	     Thread.sleep(1000);
	     driver.switchTo().window(mainWindow);
	     System.out.println("The title of mainwindow  ="+" "+driver.getTitle());
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
