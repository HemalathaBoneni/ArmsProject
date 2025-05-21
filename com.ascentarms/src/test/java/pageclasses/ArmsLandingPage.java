package pageclasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.GenericKeywords;

public class ArmsLandingPage 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	public Actions action;
	public ArmsLandingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.js = (JavascriptExecutor) driver;
		this.action = new Actions(driver);
	}
	@FindBy(xpath="//span[text()='User Management']")
	WebElement usermanagement;

	@FindBy(xpath="//a[normalize-space()='Landing page']")
	WebElement landingpage;

	@FindBy(xpath="//select[@id='module']/option[@value='centralized-user-module']")
	WebElement module;

	@FindBy(xpath="(//i[@class='fa fa-edit'])[1]")
	WebElement edit;

	@FindBy(xpath="//select[@id='redirectionUrl']/option[text()='Organizations (/user-module/organizations)']")
	WebElement redirecturldropdown;

	@FindBy(xpath="//button[text()='Update']")
	WebElement update;

	@FindBy(xpath="//input[@type='search']")
	WebElement search;

	@FindBy(xpath="//div[@class='d-flex justify-content-end col-4']//button[normalize-space()='Add']")
	WebElement add;

	@FindBy(xpath="//select[@id='redirectionUrl']/option[text()='AFL Importer Data (/arms/afl-importer)']")
	WebElement redirect;

	@FindBy(xpath="")
	WebElement updatebutton;

	@FindBy(xpath="//select[@id='roleName']/option[text()='Billing Admin']")
	WebElement rolename;

	@FindBy(xpath="//select[@id='redirectionUrl']/option[text()='Manual Assignment (/arms/manual-assignment)']")
	WebElement redirecturl;

	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;

	public GenericKeywords keyword = new GenericKeywords("ArmsLandingPage");
	
	public void clickOnUserMangement()
	{
		//		usermanagement.click();

		js.executeScript("arguments[0].click();", usermanagement);
	}

	public void ClickLandingPage()
	{
		landingpage.click();
	}

	public void clickOnModuleDropDown()
	{
		module.click();
	}
	public void clickonEdit()
	{
		wait.until(ExpectedConditions.elementToBeClickable(edit));
		edit.click();
	}
	public void clickOnRedirectionUrlDropDown()
	{
		redirecturldropdown.click();
	}
	public void clickOnUpadte()
	{
		update.click();
	}
	public void clickOnsearch(String data)
	{
		search.sendKeys(data);
	}


	public void update() 
	{
		updatebutton.click();
	}
	public void addbutton()
	{
		keyword.click(add);
	}
	public void roleNameDropDown() 
	{
		rolename.click();
	}
	public void redirectUrl() 
	{
		redirecturl.click();
	}

	public void clickOnSave() 
	{
		save.click();
	}



}
