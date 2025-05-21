package Testclases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.utility.ReadConfigFile;

import pageclasses.ArmsLandingPage;
import pageclasses.AscentLoginPage;

public class ArmsLandingTest extends BaseTest
{
	ReadConfigFile config;
    WebDriver driver;
	public ArmsLandingTest() throws IOException  
	{
		super();
		
	}
	
	public void waitUntilClickable(WebElement element) 
	{
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(element));
    }
	
	
  @Test
  public void LandingSetup() throws InterruptedException 
  {
	  
	  config =new ReadConfigFile();

	 
	AscentLoginPage ascent = new AscentLoginPage(driver);
	  ArmsLandingPage landpage = new ArmsLandingPage(driver);
	  ascent.email("testsa@ascent.com");	
		Thread.sleep(2000);
		ascent.password("A$cent#2024");
		Thread.sleep(2000);
		ascent.login();
		Thread.sleep(5000);
		
	

		ascent.clickOntest();
		Thread.sleep(3000);
		ascent.clickOnHealix();
		Thread.sleep(3000);
		ascent.organizationPage("Centralized-user-module");
		Thread.sleep(3000);
		ascent.clickOnSave();
		Thread.sleep(6000);
		
		landpage.clickOnUserMangement();
		Thread.sleep(3000);
		landpage.ClickLandingPage();
		Thread.sleep(3000);
		landpage.clickOnModuleDropDown();
		Thread.sleep(3000);
		landpage.clickonEdit();
		Thread.sleep(3000);
		landpage.clickOnRedirectionUrlDropDown();
		Thread.sleep(3000);
		landpage.clickOnUpadte();
		Thread.sleep(3000);
		landpage.clickOnsearch("Supervisor");
		Thread.sleep(3000);
		landpage.clickonEdit();
		Thread.sleep(3000);
		landpage.clickOnUpadte();
		Thread.sleep(10000);
		landpage.addbutton();
		Thread.sleep(3000);
		landpage.roleNameDropDown();
		Thread.sleep(3000);
		landpage.redirectUrl();
		Thread.sleep(3000);
		landpage.clickOnSave();
		Thread.sleep(3000);

		
		
		
}
}