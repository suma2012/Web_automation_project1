package Crome_drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		lanchnBrowser();
		navigate();
		//loginPage();
		//min();
		//logoutPage();
		//closeApplication();

	}
	
	public static void lanchnBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Web_automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser= new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	public static void navigate()
	{
		try {
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
