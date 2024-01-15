package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namesoftheparticulardropdown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\driver\\chromedriver_win32\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				 driver.get("https://www.mercurytravels.co.in/");
				
			       WebElement holiday = driver.findElement(By.id("themes"));
			       List<WebElement>values= holiday.findElements(By.tagName("option"));
			       System.out.println("no of total values"+""+values.size());
			       for(int i=0 ;i<values.size();i++)
			       {
			    	   System.out.println(values.get(i).getText());
			    	   
			       }
			       driver.close();
}
}