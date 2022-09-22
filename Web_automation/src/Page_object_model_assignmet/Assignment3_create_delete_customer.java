package Page_object_model_assignmet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_create_delete_customer
{
	//create object for brwoser
		public static WebDriver oBrowser=null;
		
		// create object for Active_page_web_elements class which has web elements
		public static Active_page_web_elements oPage=null;
	

	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		deleteCustomer();
		logout();
		closeApplication();
		
	}
	private static void  launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Web_automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new Active_page_web_elements(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
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
			oPage.getUsername().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLongin().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// minimize 
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try
		{
			oPage.gettask().click();
			Thread.sleep(2000);
			
			oPage.getnewcustk().click();			
			Thread.sleep(2000);
			
			oPage.getnewcust1().click();	
			Thread.sleep(2000);
			
			oPage.getenterCostname().sendKeys("Sudha");	
			Thread.sleep(2000);
			
			oPage.getcreatecustbotton().click();	
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	private static void deleteCustomer()
	{
		try
		{
			
			oPage.getucusttodelete().click();
			Thread.sleep(1000);
			
			oPage.getucusttodelete1().click();
			Thread.sleep(1000);
			
			oPage.getdeletecustaction().click();
			Thread.sleep(1000);
			
			oPage.getdeletecustaction1().click();;
			Thread.sleep(1000);
			oPage.getdeletecust11().click();;
			Thread.sleep(1000);
			
			
			
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
