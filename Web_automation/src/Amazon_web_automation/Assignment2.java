package Amazon_web_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Automation_on_gmail.com.Webelments_on_gmail;

public class Assignment2 {
	public static WebDriver oDriver=null;
	public static FlipcartWebElements oPage1=null;

	public static void main(String[] args) 
	{
		lanch();
		navigate();
		

	}
	public static void lanch()
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
			oDriver.get("http://www.flipkart.com");
			Thread.sleep(2000);
			oPage1.getMobiles().click();
			String ex,act;
			ex="Mobile Phones";
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	

}
