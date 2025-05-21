package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.GenericKeywords;

public class AscentLoginPage 
{
public WebDriver driver;
	Actions action;

	public AscentLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='login_name']")
	WebElement mail;

	@FindBy(xpath="//input[@id='Password']")
	WebElement passwrd;

	@FindBy(xpath="//button[@type='submit']")
	WebElement logn;

	@FindBy(xpath="//a[@id='user-dropdown']")
	WebElement test;

	@FindBy(xpath="//span[@class='ms-1'][normalize-space()='Healix - Arms']")
	WebElement healix;

	@FindBy(xpath="//select[@class='form-select']")
	WebElement selclick;

	@FindBy(xpath="//button[text()='Save']")
	WebElement save;


	GenericKeywords g1=new GenericKeywords("AscentLoginPage");

	public void email(String email)
	{
		GenericKeywords.waitForElementVisible(driver, mail, 10).sendKeys(email);

//		mail.sendKeys(email);
	}
	public void password( String password)
	{
		GenericKeywords.waitForElementVisible(driver, passwrd, 10).sendKeys(password);

//		passwrd.sendKeys(password);
	}
	public void login()
	{
		logn.click();
	}
	public void clickOntest()
	{
		GenericKeywords.waitForElementVisible(driver, test, 10).click();

//		test.click();
	}
	public void clickOnHealix()
	{
		
		healix.click();
	}

	public void organizationPage(String dropdownOption)
	{
		GenericKeywords.waitForElementVisible(driver, selclick, 10);

		selclick.click();
		g1.selectDropdown(selclick,dropdownOption);
	}   
	public void clickOnSave()
	{
		save.click();
	}
}
