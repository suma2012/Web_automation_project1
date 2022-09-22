package Page_object_model_assignmet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_crerate_delete_task
{
	//create object for brwoser
		public static WebDriver oBrowser=null;
		
		// create object for Active_page_web_elements class which has web elements
		public static Active_page_web_elements oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		deleteProject();
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
	private static void createProject()
	{
		try
		{
		
			oPage.gettask().click();
			Thread.sleep(2000);
			
			oPage.getnewcustk().click();			
			Thread.sleep(2000);
			
			oPage.getnewproject().click();			
			Thread.sleep(2000);
			
			oPage.gettoenterprojectname().sendKeys("Lekhana");			
			Thread.sleep(2000);
			
			// enter tasks 			
			oPage.getgettasks().click();			
			Thread.sleep(2000);
			oPage.getentertask11().sendKeys("task1");			
			Thread.sleep(2000);
			
			oPage.getcreateprojectclick().click();			
			Thread.sleep(2000);
			
			//modify task1
			oPage.getmodifytask1().click();			
			Thread.sleep(2000);
			
			
			
			oPage.getopentask1click().click();			
			Thread.sleep(2000);
			
			
			oPage.getmodiftasdec().sendKeys("Task1descption");		
			Thread.sleep(2000);

			
			// click on ACTION PART IN TASK
			oPage.getactionontask().click();			
			Thread.sleep(2000);
			
			// click on DELETE part on task
			
			
			oPage.getactiondeleteontask().click();			
			Thread.sleep(2000);
			
			// delete con
			oPage.getactiondeleteontaskconf().click();			
			Thread.sleep(2000);
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteProject()
	{
		try
		{
			oPage.getucusttodelete().click();
			Thread.sleep(1000);
			oPage.getprojectname().click();
			Thread.sleep(1000);
			oPage.getprojectname1().click();
			Thread.sleep(1000);
			//modify the project
			oPage.getmodifyprojectdec().sendKeys("project desc");
			Thread.sleep(1000);
			// action to delete
			oPage.getactiononproject().click();
			Thread.sleep(1000);
			
			oPage.getdeleteproject().click();
			Thread.sleep(1000);
			oPage.getdeleteprojectconfirm().click();
			Thread.sleep(1000);
			
			
			
			
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
