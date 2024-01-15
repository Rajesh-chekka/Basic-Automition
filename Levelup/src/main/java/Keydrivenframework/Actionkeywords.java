package Keydrivenframework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Actionkeywords {
   public WebDriver driver;//instance variable
	public void launchbrowser()
	{	
	   WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
}
	
	public void navigate() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	public void enterusername()
	{
        driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Admin");
	}
	
	public void enterpassword()
	{
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
	
	public void clickonlogin()
	{
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public void logout() throws InterruptedException
	{
	    driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
	}
	
    public void close()
	
	{
		driver.close();
	}
}
