package Keydrivenframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keydata {
	 WebDriver driver;//instance variable
		ChromeOptions p = new ChromeOptions();
	//	p.addArguments("--disable-notifications");

		public void launchbrowser()
		{
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\driver\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			p.addArguments("--incognito");
			p.addArguments("--disable-notifications");
			driver=new ChromeDriver(p);

		}
		
		public void navigate() throws InterruptedException
		{
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
		}
		
		public void enterusername()
		{
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys("############");
		}
		
		public void enterpassword()
		{
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys("@@@@@@@@@@");
		}
		
		public void clickonlogin() throws InterruptedException
		{
		
			driver.findElement(By.name("login")).click();
			Thread.sleep(3000);
			//p = new ChromeOptions();

		     // driver.switchTo().alert().accept();

		}
		
		public void logout() throws InterruptedException
		{
		    driver.findElement(By.xpath("(//span[@class='x4k7w5x x1h91t0o x1h9r5lt x1jfb8zj xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j'])[7]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='x6s0dn4 x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1q0g3np x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r xeuugli x18d9i69 x1sxyh0 xurb0ha xexx8yu x1n2onr6 x1ja2u2z x1gg8mnh'])[18]")).click();
		}
		
	    public void close()
		
		{
			driver.close();
		}
	public static void main(String[] args) throws InterruptedException, IOException {
		Keydata key = new Keydata();
		FileInputStream fis=new FileInputStream("C:\\Users\\Ram\\eclipse-workspace\\Levelup\\Excel\\keydriven.xlsx");
		XSSFWorkbook wbo = new XSSFWorkbook(fis);
		XSSFSheet wso = wbo.getSheet("Sheet1");

		Row r;
		
		int rowc=wso.getLastRowNum();
		 
		 for(int i=1;i<=rowc;i++)
		 {
			 r=wso.getRow(i);
			 
			 String runmode=r.getCell(4).getStringCellValue();
			 
			 if(runmode.equals("Y"))
		{
		
				 String action=r.getCell(3).getStringCellValue();
					
					if(action.equals("launchbrowser"))
					{
						key.launchbrowser();
						
					}
					else if(action.equals("navigate"))
					{
						key.navigate();
					}
					else if(action.equals("enterusername"))
						
					{
						key.enterusername();
					}
						
					else if(action.equals("enterpassword"))
					{
						key.enterpassword();
						
					}
					
					else if(action.equals("clickonlogin"))
					{
						key.clickonlogin();
					}
					else if(action.equals("logout"))
					{
						key.logout();
					}
					
					else if(action.equals("close"))
					{
						key.close();
					}
	        }
     }
		 System.out.println("success");
	}
	}


