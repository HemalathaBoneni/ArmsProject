package pageclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.GenericKeywords;

public class ModuleFeaturesPage 
{
 public WebDriver driver;
	Actions action;
	
	public ModuleFeaturesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Module Features']")
	WebElement modulefeature;
	
	@FindBy(xpath="//select[@id='module']/option[text()='Centralized User Module']")
	WebElement modules;
   
	@FindBy(xpath="(//i[@class='fa fa-edit'])[1]")
	WebElement edit;
	
	@FindBy(xpath="//input[@id='moduleName']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='featureDescription']")
	WebElement description;
	
	@FindBy(xpath="//select[@id='level']/option[text()='2']")
	WebElement level;
	
	@FindBy(xpath="//select[@id='parentAmfId']/option[text()='Shift Management']")
	WebElement parentfeature;
	
	@FindBy(xpath="//input[@id='isVisibleInMenu']")
	WebElement visiblemenu;

	@FindBy(xpath="//select[@id='pageFilename']/option[text()='/user-module/my-shifts-targets']")
	WebElement pagefile;
		
	@FindBy(xpath="(//input[@type='checkbox'])[14]")
	WebElement readacess;
	
	@FindBy(xpath="//input[@id='write-client_user']")
	WebElement writeacess;
	
	@FindBy(xpath="//input[@id='delete-client_user']")
	WebElement deleteacess;
	
	@FindBy(xpath="//button[normalize-space()='Update']")
	WebElement update;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement search;
	
	@FindBy(xpath="(//i[@class='fa fa-trash'])[1]")
	WebElement trash;
	
	@FindBy(xpath="//button[normalize-space()='Delete']")
	WebElement delete;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement addbutton;
	
	@FindBy(xpath="//input[@id='moduleName']")
	WebElement addname;
	
	@FindBy(xpath="//input[@id='featureDescription']")
	WebElement adddescription;
	
	@FindBy(xpath="//select[@id='level']/option[text()='2']")
	WebElement addlevel;
	
	@FindBy(xpath="//select[@id='parentAmfId']/option[text()='Shift Management']")
	WebElement addparentfeaturename;
	
	@FindBy(xpath="//input[@id='isVisibleInMenu']")
	WebElement addvisiblemenu;
	
	@FindBy(id="pageFilename")
	WebElement addpagefile;
	
	@FindBy(xpath="//input[@id='read-user']")
	WebElement addreadacess;

	@FindBy(xpath="//input[@id='write-user']")
	WebElement addwriteacess;
	
	@FindBy(xpath="//input[@id='delete-user']")
	WebElement adddeleteacess;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	
	@FindBy(id="ianatId")
	WebElement 	selectTimeZone;
	
		

	GenericKeywords generic = new GenericKeywords("ArmsModuleFeatures");
	
    public void clickOnModuleFeatures()
    {
    	generic.click(modulefeature);
    }
    public void clickOnModules()
    {
    	modules.click();
    }
    public void edit()
    {
    	edit.click();
    }
    public void nameFiled(String data)
    {
    	generic.clearEnter(name, data);
    }
    public void descriptionFiled(String data)
    {
    	generic.clearEnter(description, data);
    }
    public void leveldropdown()
    {
    	level.click();
    }
    public void parentFeatureName()
    {
    	parentfeature.click();
    }
    public void isVisibleMenu()
    {
    	visiblemenu.click();
    }
//    public void pagefilename()
//    {
//    	pagefile.click();
//    }
   
    public void clientUserReadAcess()
    {
    	readacess.click();
    }
    public void clientUserWriteAcess()
    {
    	writeacess.click();
    }
    public void clientUserDeleteAcess()
    {
    	deleteacess.click();
    }
    public void clickOnUpdate()
    {
    	update.click();
    }
    public void textsearch(String data)
    {
    	search.sendKeys(data);
    }
    public void delete()
    {
    	trash.click();
    }
    public void deleteConfirmation()
    {
    	delete.click();
    }
    public void addbutton()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", addbutton);
//    	addbutton.click();
    }
    public void addnameFiled(String data)
    {
    	addname.sendKeys(data);
    }
    public void adddescriptionFiled(String data)
    {
    	adddescription.sendKeys(data);
    }
    public void addleveldropdown()
    {
    	addvisiblemenu.click();
    }
    public void addParentFeatureName()
    {
       addparentfeaturename.click();
    }
    public void addisVisibleMenu()
    {
    	addvisiblemenu.click();
    }
    public void addpageFileName(String data)
    {
    	addpagefile.sendKeys(data);
    }
    public void addclientUserReadAcess()
    {
    	addreadacess.click();
    }
    public void addclientUserWriteAcess()
    {
    	addwriteacess.click();
    }
    public void addclientUserDeleteAcess()
    {
    	adddeleteacess.click();
    }
    public void addclickOnUpdate()
    {
    	update.click();
    }
    public void clickOnSave()
    {
    	save.click();
    }
    
}

    
