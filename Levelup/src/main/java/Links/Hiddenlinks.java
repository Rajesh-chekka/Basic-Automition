package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 List<WebElement>links= driver.findElements(By.tagName("a"));
	       int count = 0;
	       for (int i = 0;i<links.size();i++)
	       {
	    	   if(links.get(i).isDisplayed())
	    	   {
	    		   count++;
	    	   }
	       }
	       System.out.println("no of total links"+""+links.size());
	       System.out.println("no of visibled links"+""+count);
	       System.out.println("no of hidden links"+""+(links.size()-count));
	       
		}
	

	}


