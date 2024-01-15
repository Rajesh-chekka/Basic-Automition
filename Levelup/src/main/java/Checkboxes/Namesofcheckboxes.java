package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namesofcheckboxes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\driver\\chromedriver_win32\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				 driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
				 driver.manage().window().maximize();
				 List<WebElement>checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
			     System.out.println("no of total checkboxes"+" "+checkbox.size());
			     for(int i= 0;i<checkbox.size();i++)
			       {
			    	   System.out.println(checkbox.get(i).getAttribute("value"));
			       }
			       driver.close();
}
}



