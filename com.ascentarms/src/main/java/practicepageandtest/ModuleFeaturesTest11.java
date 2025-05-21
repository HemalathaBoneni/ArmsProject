package practicepageandtest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utility.GenericKeywords;
import com.utility.ReadConfigFile;

import Testclases.BaseTest;
import pageclasses.ArmsLandingPage;
import pageclasses.AscentLoginPage;
import pageclasses.ModuleFeaturesPage;


public class ModuleFeaturesTest11 extends BaseTest
{
     ReadConfigFile config;
     
	public ModuleFeaturesTest11() throws IOException
	{
		super();
	}
	
	GenericKeywords generic = new GenericKeywords("ArmsModuleFeatures");
	
	@Test
	public void modulefeatures() throws InterruptedException, IOException
	{
		 config =new ReadConfigFile();
		 
		 AscentLoginPage ascent = new AscentLoginPage(driver);
		    ascent.email("testsa@ascent.com");	
			ascent.password("A$cent#2024");
			ascent.login();
			Thread.sleep(4000);
			ascent.clickOntest();
			Thread.sleep(3000);
			ascent.clickOnHealix();
			Thread.sleep(3000);
			ascent.organizationPage("Centralized User Module");
			Thread.sleep(3000);
			ascent.clickOnSave();
			Thread.sleep(6000);
			
			ArmsLandingPage landpage = new ArmsLandingPage(driver);
			landpage.clickOnUserMangement();
			Thread.sleep(3000);
			
			 ModuleFeaturesPage featuremodule = new ModuleFeaturesPage(driver);
			featuremodule.clickOnModuleFeatures();
		       Thread.sleep(4000);
		       featuremodule.clickOnModules();
		       Thread.sleep(3000);
		       featuremodule.edit();
		       Thread.sleep(3000);
		       featuremodule.nameFiled("Client Users");
		       Thread.sleep(3000);
		       featuremodule.descriptionFiled("Client Users");
		       Thread.sleep(3000);
		       featuremodule.leveldropdown();
		       Thread.sleep(3000);
		       featuremodule.parentFeatureName();
		       Thread.sleep(4000);
		       featuremodule.isVisibleMenu();
		       Thread.sleep(4000);
//		       featuremodule.pagefilename();
//		       Thread.sleep(6000);
		       featuremodule.clientUserReadAcess();
		       Thread.sleep(3000);
		       featuremodule.clientUserWriteAcess();
		       Thread.sleep(3000);
		       featuremodule.clientUserDeleteAcess();
		       Thread.sleep(3000);
		       featuremodule.clickOnUpdate();
		       Thread.sleep(5000);
		       featuremodule.textsearch("Client Users");
		       Thread.sleep(3000);
		       featuremodule.delete();
		       Thread.sleep(3000);
		       featuremodule.deleteConfirmation();
			   Thread.sleep(3000);
		       featuremodule.addbutton();
		       Thread.sleep(3000);
		       featuremodule.addnameFiled("Testing Feature 1");
		       Thread.sleep(3000);
		       featuremodule.adddescriptionFiled("Testing Feature 1");
		       featuremodule.addleveldropdown();
		       Thread.sleep(3000);
		       featuremodule.addParentFeatureName();
		       Thread.sleep(3000);
		       featuremodule.addisVisibleMenu();
		       Thread.sleep(3000);
		       featuremodule.addpageFileName("/app-settings");
		       Thread.sleep(3000);
		       featuremodule.addclientUserReadAcess();
		       Thread.sleep(3000);
		       featuremodule.addclientUserWriteAcess();
		       Thread.sleep(3000);
		       featuremodule.addclientUserDeleteAcess();
		       Thread.sleep(3000);
		       featuremodule.clickOnSave();
		      

			

			
			
	       
	      
	       
}
}