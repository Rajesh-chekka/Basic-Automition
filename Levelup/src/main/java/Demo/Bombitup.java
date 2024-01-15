package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
public class Bombitup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
		WebDriver	 driver = new ChromeDriver();
			driver.get("https://greatonlinetools.com/smsbomber/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.id("mobile")).sendKeys("enter number");
			Thread.sleep(3000);
			driver.findElement(By.id("count")).sendKeys("100");
			Thread.sleep(3000);
	        WebElement button =	driver.findElement(By.id("start"));			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", button);
			js.executeScript("arguments[0].scrollIntoView();", button);
			Thread.sleep(30000);
			System.out.println("the buttion is captured");
         driver.close();
}

}
