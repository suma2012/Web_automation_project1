package Amazon_web_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartWebElements 
{
	FlipcartWebElements(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]")
	private WebElement mobiles;
	public WebElement getMobiles()
	{
		return mobiles;
	}
}
