package Automation_on_gmail.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webelments_on_gmail
{
	Webelments_on_gmail(WebDriver oBroser)
	{
		PageFactory.initElements(oBroser, this);
	}
	
	// web element for username 
	private WebElement 	identifierId;
	public WebElement getUsername1()
	{
		return 	identifierId;
	}
	@FindBy(xpath="//*[@id='identifierNext']/div/button/span")
	private WebElement nextUser;
	public WebElement nextInLogin()
	{
		return 	nextUser;
	}

}
