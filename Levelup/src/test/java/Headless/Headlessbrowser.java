package Headless;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headlessbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // WebDriver driver = new HtmlUnitDriver();
		WebDriver driver = new HtmlUnitDriver();
	        driver.get("http://www.google.com");
	        WebElement element = driver.findElement(By.name("q"));  

	        element.sendKeys("Edureka");
	        element.submit();   

	        System.out.println("Page title is: " + driver.getTitle());  

	        driver.quit();


	}

}
