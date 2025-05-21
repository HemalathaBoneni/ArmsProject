package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.GenericKeywords;

public class TimeZoneSelectByTextPage 
{

	public WebDriver driver;
	Actions action;
	public TimeZoneSelectByTextPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='User Management']")
	WebElement usermanagement;
	
	public GenericKeywords keyword = new GenericKeywords("ArmsLandingPage");
	
	
	
	
	public void userManagementClick()
	{
		usermanagement.click();
	}
}
