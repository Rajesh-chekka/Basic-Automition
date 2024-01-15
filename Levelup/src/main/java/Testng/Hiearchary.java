package Testng;

import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hiearchary {
	@BeforeSuite
	void wakeup()
	{
		System.out.println("Good morning hyderabad");
	}
	@Test(invocationCount = 10,invocationTimeOut=1)
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
	
	@AfterSuite
	void slepping()
	{
	  System.out.println("Good night Hyderabad");
	}

}
