package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fblogout   {
	
	@FindBy(xpath="(//span[@class='x4k7w5x x1h91t0o x1h9r5lt x1jfb8zj xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j'])[7]")
	WebElement drop;
	
	@FindBy(xpath="(//div[@class='x6s0dn4 x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1q0g3np x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r xeuugli x18d9i69 x1sxyh0 xurb0ha xexx8yu x1n2onr6 x1ja2u2z x1gg8mnh'])[18]")
	WebElement loginout;
	
	public Fblogout(WebDriver driver) //page name 
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public void logout() throws InterruptedException
	{
		drop.click();
		Thread.sleep(1000);
		loginout.click();
		Thread.sleep(100);
	}

}
