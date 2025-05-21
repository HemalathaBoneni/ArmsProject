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
import pageclasses.TimeZoneSelectByTextPage;

public class TimeZoneSelectByTextTest
{

	ReadConfigFile config;
    WebDriver driver;
	public TimeZoneSelectByTextTest() throws IOException  
	{
		super();
		
	}
	
	public void waitUntilClickable(WebElement element) 
	{
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(element));
    }
	
	
  @Test
  public void TimeZoneSelect() throws InterruptedException 
  {
	  
	  config =new ReadConfigFile();

	 
	AscentLoginPage ascent = new AscentLoginPage(driver);
	 TimeZoneSelectByTextPage timepage = new TimeZoneSelectByTextPage(driver);
	  ascent.email("testsa@ascent.com");	
		Thread.sleep(2000);
		ascent.password("A$cent#2024");
		Thread.sleep(2000);
		ascent.login();
		Thread.sleep(5000);
		
		
}
}
