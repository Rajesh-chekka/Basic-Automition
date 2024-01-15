package Dropdowns;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectparticulardropdown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.mercurytravels.co.in/");
       WebElement holiday = driver.findElement(By.id("themes"));
       holiday.sendKeys("family");
       Thread.sleep(4000);
       Select st = new Select(holiday);
       st.selectByIndex(4);
       Thread.sleep(3000);
       st.selectByValue("22");
       Thread.sleep(3000);
       st.selectByVisibleText("Cruise");
       Thread.sleep(3000);
       driver.close();

}
}
