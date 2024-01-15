package Demo;
//import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("email")).sendKeys("###########");
		 Thread.sleep(2000);
	     WebElement password= driver.findElement(By.id("pass"));
	     password.sendKeys("$$$$$$$$$$");
	     Thread.sleep(2000);
	     WebElement login = driver.findElement(By.id("loginbutton"));
	     login.click();
	     Thread.sleep(5000);
		 driver.close();

 	}

} 
