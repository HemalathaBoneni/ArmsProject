package Testclases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utility.ReadConfigFile;

import pageclasses.AscentLoginPage;

public class AscentloginTest extends BaseTest
{
	ReadConfigFile config;
	

	public AscentloginTest() throws IOException
	{
		
		super();

	}

	@Test
	public void AscentArms() throws InterruptedException
	{
		
		 config =new ReadConfigFile();
		AscentLoginPage ascent = new AscentLoginPage(driver);
		

		ascent.email("testsa@ascent.com");				
		ascent.password("A$cent#2024");
		ascent.login();
		Thread.sleep(5000);
		ascent.clickOntest();
		Thread.sleep(3000);
		ascent.clickOnHealix();
		Thread.sleep(3000);
		ascent.organizationPage("Centralized User Module");
		Thread.sleep(3000);
		ascent.clickOnSave();
		Thread.sleep(2000);
	}
}
