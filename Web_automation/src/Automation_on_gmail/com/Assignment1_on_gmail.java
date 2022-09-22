package Automation_on_gmail.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_object_model_assignmet.Active_page_web_elements;

public class Assignment1_on_gmail

{

	public static WebDriver oBrowser=null;
	public static Webelments_on_gmail oPage1=null;
	public static void main(String[] args)
	{
		lanuchBroser();
		navigate();
		login();
	}
	private static void lanuchBroser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Web_automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage1=new Webelments_on_gmail(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			oBrowser.get("https://www.gmail.com/");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage1.getUsername1().sendKeys("bsuma.vijay");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
