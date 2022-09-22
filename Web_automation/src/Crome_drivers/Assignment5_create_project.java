package Crome_drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_create_project
{
	public static WebDriver oDriver=null;
	
	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();
		login();
		minimizewindow();
		createCustomer();
		createProject();
		//logOut();
		//closeApplication();
	}
	public static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\Web_automation\\Library\\Drivers\\chromedriver.exe");
			oDriver= new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void navigate()
	{
		try
		{
			oDriver.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// log in 
	public static void login()
	{
		try
		{
		
			oDriver.findElement(By.id("username")).sendKeys("admin");
			oDriver.findElement(By.name("pwd")).sendKeys("manager");
			oDriver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void minimizewindow()
	{
		try
		{
			oDriver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createCustomer()
	{
		try
		{
			oDriver.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(5000);
			
			oDriver.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(5000);
			
			oDriver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(5000);
			
			oDriver.findElement(By.id("customerLightBox_nameField")).sendKeys("sudha1");
			oDriver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Bangalore");
			Thread.sleep(5000);
			
			oDriver.findElement(By.xpath("//span[text()='Create Customer']")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try
		{
			oDriver.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(5000);
			
			oDriver.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(5000);
			
			oDriver.findElement(By.xpath("//div[text()='+ New Project']")).click();
			Thread.sleep(5000);
						
			
			oDriver.findElement(By.id("projectPopup_projectNameField")).sendKeys("Automation");
			Thread.sleep(2000);
			
			//oDriver.findElement(By.id("projectPopup_newCustomerNameField")).sendKeys("Lekhana");
			//Thread.sleep(2000);
			
			oDriver.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logOut()
	{
		try
		{
			oDriver.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oDriver.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
