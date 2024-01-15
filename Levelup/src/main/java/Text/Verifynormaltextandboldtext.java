package Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Verifynormaltextandboldtext {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://demo.guru99.com/test/newtours/");
       WebElement text =  driver.findElement(By.xpath("//b[text()='sign-in here']"));
       String expected = "b";
       String actual = text.getTagName();
       if(expected.equals(actual))
       {
    	   System.out.println("BoldText");
       }
       driver.close();
       


}
}