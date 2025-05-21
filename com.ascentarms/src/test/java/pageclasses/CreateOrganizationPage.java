package pageclasses;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.GenericKeywords;

public class CreateOrganizationPage 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	public Actions action;

	public CreateOrganizationPage(WebDriver driver)
	{

		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.js = (JavascriptExecutor) driver;
		this.action = new Actions(driver);


	}

	@FindBy(xpath="//a[normalize-space()='Organizations']")
	WebElement organizations;

	@FindBy(xpath="(//button[normalize-space()='Add'])[1]")
	WebElement addbutton;

	@FindBy(xpath = "//input[@placeholder='Enter organization name']")
	public WebElement orgName;

	@FindBy(xpath = "//input[@placeholder='Enter address line 1']")
	public WebElement orgAddressLine1;

	@FindBy(xpath = "//input[@placeholder='Enter address line 2']")
	public WebElement orgAddressLine2;

	@FindBy(xpath = "//input[@placeholder='Enter area']")
	public WebElement orgArea;

	@FindBy(xpath = "//input[@placeholder='Enter city']")
	public WebElement orgCity;

	@FindBy(xpath = "//input[@placeholder='Enter state']")
	public WebElement orgState;

	@FindBy(xpath = "//input[@placeholder='Enter country']")
	public WebElement orgCountry;

	@FindBy(xpath = "//input[@placeholder='Enter zip code']")
	public WebElement orgZipCode;

	@FindBy(id = "ianatId")
	public WebElement orgTimezone;

	// -------- Primary Contact Fields --------

	@FindBy(xpath = "//input[@placeholder='Enter first name']")
	public WebElement contactFirstName;

	@FindBy(xpath = "//input[@placeholder='Enter middle name']")
	public WebElement contactMiddleName;

	@FindBy(xpath = "//input[@placeholder='Enter last name']")
	public WebElement contactLastName;

	@FindBy(xpath = "//input[@placeholder='Enter email']")
	public WebElement contactEmail;

	@FindBy(xpath = "(//input[@id='primaryContactDetails.billingAddressLine1'])[1]")
	public WebElement contactAddressLine1;

	@FindBy(xpath = "(//input[@id='primaryContactDetails.billingAddressLine2'])[1]")
	public WebElement contactAddressLine2;

	@FindBy(xpath = "//input[@id='primaryContactDetails.billingAddressLineArea']")
	public WebElement contactArea;

	@FindBy(xpath = "//input[@id='primaryContactDetails.billingAddressCity']")
	public WebElement contactCity;

	@FindBy(xpath = "//input[@id='primaryContactDetails.billingAddressState']")
	public WebElement contactState;

	@FindBy(xpath = "//input[@id='primaryContactDetails.billingAddressCountry']")
	public WebElement contactCountry;

	@FindBy(xpath = "//input[@id='primaryContactDetails.billingAddressZipCode']")
	public WebElement contactZipCode;

	@FindBy(xpath = "(//input[@id='01936784-0921-707b-9802-68bba47c6d68'])[1]")
	public WebElement contactmodule;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement saveButton;

	@FindBy(xpath = "(//i[@class='icon fa fa-reply me-1'])[1]")
	public WebElement backButton;

	@FindBy(xpath = "(//i[@class='fa fa-envelope'])[2]")
	public WebElement invite;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement close;

	@FindBy(xpath = "(//i[@class='fa fa-edit'])[9]")
	public WebElement edit;


	public void clickOnOrganizations()
	{
		organizations.click();
	}

	public void clickOnaddbutton() 
	{
		//			addbutton.click();
		wait.until(ExpectedConditions.elementToBeClickable(addbutton));
		js.executeScript("arguments[0].click();", addbutton);
	}
	public void enterOrganizationName(String name) 
	{
		GenericKeywords.waitForElementVisible(driver, orgName, 10).sendKeys(name);
		//	        orgName.sendKeys(name);
	}

	public void enterAddressLine1(String address1)
	{
		orgAddressLine1.sendKeys(address1);
	}

	public void enterAddressLine2(String address2)
	{
		orgAddressLine2.sendKeys(address2);
	}

	public void enterArea(String area)
	{
		orgArea.sendKeys(area);
	}

	public void enterCity(String city)
	{
		orgCity.sendKeys(city);
	}

	public void enterState(String state)
	{
		orgState.sendKeys(state);
	}

	public void enterCountry(String country) 
	{
		orgCountry.sendKeys(country);
	}

	public void enterZipCode(String zip)
	{
		orgZipCode.sendKeys(zip);
	}

	public void selectTimezone(String timezone) 
	{
		new Select(orgTimezone).selectByVisibleText(timezone);
	}

	public void enterFirstName(String fname) 
	{
		contactFirstName.sendKeys(fname);
	}

	public void enterMiddleName(String mname) 
	{
		contactMiddleName.sendKeys(mname);
	}

	public void enterLastName(String lname) 
	{
		contactLastName.sendKeys(lname);
	}

	public void enterEmail(String email) 
	{
		contactEmail.sendKeys(email);
	}

	public void enterContactAddressLine1(String addr1)
	{
		contactAddressLine1.sendKeys(addr1);
	}

	public void enterContactAddressLine2(String addr2) 
	{
		contactAddressLine2.sendKeys(addr2);
	}

	public void enterContactArea(String area) 
	{
		contactArea.sendKeys(area);
	}

	public void enterContactCity(String city) 
	{
		contactCity.sendKeys(city);
	}

	public void enterContactState(String state)
	{
		contactState.sendKeys(state);
	}

	public void enterContactCountry(String country) 
	{
		contactCountry.sendKeys(country);
	}

	public void enterZipContactCode(String zip) 
	{
		contactZipCode.sendKeys(zip);
	}
	public void clickOnEVBV()
	{
		//        	contactmodule.click();
		js.executeScript("arguments[0].click();", contactmodule);
	}
	public void clickSave() 
	{
		js.executeScript("arguments[0].click();", saveButton);
//		saveButton.click();
	}

	public void clickBack()
	{
		backButton.click();
	}
	public void clickOnInvite()
	{
		invite.click();
	}
	public void clickOnClose()
	{

	}
	public void clickOnEdit()
	{
		edit.click();
	}


}


