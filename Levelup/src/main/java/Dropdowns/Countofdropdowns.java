package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countofdropdowns {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\driver\\chromedriver_win32\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				 driver.get("https://www.mercurytravels.co.in/");
				 driver.manage().window().maximize();
				 List<WebElement>dropdowns= driver.findElements(By.tagName("select"));
			     System.out.println("no of total dropdowns"+""+dropdowns.size());
			     Thread.sleep(1000);
			     driver.close();

}
}
