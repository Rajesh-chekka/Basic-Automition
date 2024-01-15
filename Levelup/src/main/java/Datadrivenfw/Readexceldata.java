package Datadrivenfw;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Readexceldata {
	 WebDriver driver;
	 FileInputStream fso;
	 XSSFWorkbook wbo;
	 XSSFSheet wso;
	 FileOutputStream fo;
	
	 @BeforeTest
	 public void open() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver",
					"C:\\driver\\chromedriver_win32\\chromedriver.exe");	
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(3000);
		 
	 }
	 @Test
	 public void operations() throws IOException, InterruptedException
	 {
		 fso = new FileInputStream("C:\\Users\\Ram\\eclipse-workspace\\Levelup\\Excel\\Readdata.xlsx");
		 wbo = new XSSFWorkbook(fso);
		 wso = wbo.getSheet("Sheet1");
		 Row r;
		 int rno = wso.getLastRowNum();
		 for (int i = 1; i<=rno; i++)
		 {
			 r = wso.getRow(i);
			 driver.findElement(By.id("email")).clear();
			 driver.findElement(By.id("email")).sendKeys(r.getCell(0).getStringCellValue());
			 Thread.sleep(1000);
			 driver.findElement(By.id("pass")).clear();
			 driver.findElement(By.id("pass")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.name("login")).click();
			 driver.manage().window().maximize();
			 String actual= driver.getCurrentUrl();
			 r.createCell(3).setCellValue(actual);
			 String expected = r.getCell(2).getStringCellValue();
			 if(expected.equals(actual))
			 {
				 r.createCell(4).setCellValue("pass");
			 }
			 else
			 {
				 r.createCell(4).setCellValue("fail");
				 Thread.sleep(2000);
			 }
	    // driver.navigate().back();
		//Thread.sleep(5000);

	       driver.navigate().refresh();
			 Thread.sleep(10000);

		   }
	 		 fo =  new FileOutputStream ("C:\\Users\\Ram\\eclipse-workspace\\Levelup\\Excel\\Readdata.xlsx");
			 wbo.write(fo);
		 }

@AfterTest
public void close()
{
	driver.close();
}
}