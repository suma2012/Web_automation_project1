package Amazon_web_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{

	public static WebDriver oDriver=null;
	public static void main(String[] args)
	{
		lanuchbrowsers();	
		navigate();
		
	}
	public static void lanuchbrowsers()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\Web_automation\\Library\\Drivers\\chromedriver.exe");
			oDriver=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			oDriver.get("http://www.amazon.in");
			Thread.sleep(2000);
			oDriver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();
			
			Thread.sleep(200);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
