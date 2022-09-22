package Page_object_model_assignmet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_modify_user
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
		createUser();
		modifyuser();
		//deleteUser();
		//logout();
		//closeApplication();

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
	
	public static void createUser()
	{
		try
		{
			
			oPage.getUser().click();
			Thread.sleep(2000);
			
			oPage.getAddUser().click();
			Thread.sleep(2000);
			
			oPage.getFirstname().sendKeys("Suma");
			oPage.getlastname().sendKeys("B");
			oPage.getemail().sendKeys("demo@gmail.com");
			oPage.getusername1().sendKeys("demoUser1");
			oPage.getpassword().sendKeys("p1");
			Thread.sleep(3000);
			oPage.getpasswordCopy().sendKeys("p1");
			Thread.sleep(2000);
					
			oPage.getcreateuser().click();
						
			
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
	}
	public static void modifyuser()
	{
		try
		{
			oPage. getmodifyeuser().click();
			Thread.sleep(2000);
			oPage.getFirstname().sendKeys("Suma1");
			oPage.getlastname().sendKeys("B");
			oPage.getemail().sendKeys("demo@gmail.com");
			oPage.getusername1().sendKeys("demoUser2");
			oPage.getpassword().sendKeys("p1");
			Thread.sleep(3000);
			oPage.getpasswordCopy().sendKeys("p1");
			Thread.sleep(2000);
			
			oPage.getsavechanges().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
	}
	public static void deleteUser()
	{
		try
		{
			
			oPage.getusernametodelete().click();
			Thread.sleep(2000);
			
			oPage.getusertodelete().click();
			Thread.sleep(2000);	
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
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
