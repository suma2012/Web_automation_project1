package Crome_drivers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignemnt2_modify_users {
	
	public static WebDriver oDriver=null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizewindow();
		createUser();
		modifyuser();
		deleteUser();
		logout();
		closeApplication();
	}
		
	
	// launch chrome browser
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
		
		public static void createUser()
		{
			try
			{
				
				oDriver.findElement(By.xpath("//div[text()='USERS']")).click();
				Thread.sleep(5000);
				oDriver.findElement(By.xpath("//div[text()=Add User']")).click();
				Thread.sleep(5000);
				oDriver.findElement(By.name("firstName")).sendKeys("suma");
				oDriver.findElement(By.name("lastName")).sendKeys("B");
				oDriver.findElement(By.name("email")).sendKeys("demo@gmail.com");
				oDriver.findElement(By.name("username")).sendKeys("demoUser1");
				oDriver.findElement(By.name("password")).sendKeys("Welcome1");
				oDriver.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
				Thread.sleep(2000);
				oDriver.findElement(By.xpath("//span[text()='Create User']")).click();
				
				
			}catch(Exception e)
			
			{
				e.printStackTrace();
			}
		}
		public static void modifyuser()
		{
			try
			{
				
				oDriver.findElement(By.xpath("//span[text()='B, suma']")).click();
				Thread.sleep(2000);
				oDriver.findElement(By.name("firstName")).sendKeys("suma1");
				oDriver.findElement(By.name("lastName")).sendKeys("B");
				oDriver.findElement(By.name("email")).sendKeys("demo@gmail.com");
				oDriver.findElement(By.name("username")).sendKeys("suma1");
				oDriver.findElement(By.name("password")).sendKeys("Welcome1");
				oDriver.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
				Thread.sleep(2000);
				oDriver.findElement(By.xpath("//span[text()='Save Changes']")).click();
				
				
			}catch(Exception e)
			
			{
				e.printStackTrace();
			}
		}
		private static void deleteUser()
		{
			try
			{
				oDriver.findElement(By.xpath("//span[text()='B, suma1']")).click();
				Thread.sleep(2000);
				oDriver.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert=oDriver.switchTo().alert();
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
				oDriver.findElement(By.linkText("Logout")).click();
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
				oDriver.quit();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}
