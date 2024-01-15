package Testng;

import org.testng.annotations.Test;

public class Concepts {
	
	@Test(priority = 3)
	public void chiranjeevi()
	{
		System.out.println("versatile hero");
	}
	@Test(priority = 2)
	public void balakrishna()
	{
		int a = 5 ;
		int b = 10;
		int c = a+b;
		System.out.println(c);
	}
	
	@Test(priority =1 ,enabled =false)
	public void nagarjuna()
	{
		System.out.println("Romantic hero");
	}
	
	@Test(enabled = false)
	public void venkatesh()
	{
		System.out.println("Family hero");
	}
	

}
