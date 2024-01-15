package Testng;

import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngsequence {
	@BeforeMethod
	void wakeup()
	{
		System.out.println("Good morning hyderabad");
	}
	@Test
	void testing()
	{
		System.out.println("Learning testing");
	}
	@Test(priority =1)
	void breakfast()
	{
		System.out.println("idli");
	}
	@Test(priority = 2)
	void ipl()
	{
		System.out.println("Entertainment");
	}
	
	@AfterMethod
	void slepping()
	{
	  System.out.println("Good night Hyderabad");
	}


}
