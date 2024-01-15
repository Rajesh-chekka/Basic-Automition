package Radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Particularradiobutton {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\driver\\chromedriver_win32\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				 driver.get("https://www.spicejet.com/");
				 driver.manage().window().maximize();
				 Thread.sleep(1000);
			       WebElement student = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
			       student.click();
			       if(student.isSelected())
			       {
			    	  System.out.println("Working success");  
			       }
			       else 
			       {
			    	  System.out.println("Working unsuccess");
			       }
			       driver.close();

			}

}

