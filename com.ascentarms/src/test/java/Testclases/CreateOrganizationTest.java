package Testclases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utility.GenericKeywords;
import com.utility.ReadConfigFile;

import pageclasses.ArmsLandingPage;
import pageclasses.AscentLoginPage;
import pageclasses.CreateOrganizationPage;
import pageclasses.ModuleFeaturesPage;

public class CreateOrganizationTest extends BaseTest 
{
	ReadConfigFile config;
	public CreateOrganizationTest() throws IOException
	{
		super();
	}

	@Test
	public void verifyAddOrganization() throws InterruptedException {

		config = new ReadConfigFile();
		AscentLoginPage ascent = new AscentLoginPage(driver);

		ascent.email("testsa@ascent.com");	
		ascent.password("A$cent#2024");
		ascent.login();
		//			Thread.sleep(3000);

		AscentLoginPage testdropdown = new AscentLoginPage(driver);

		testdropdown.clickOntest();
		Thread.sleep(3000);
		testdropdown.clickOnHealix();
		Thread.sleep(3000);
		testdropdown.organizationPage("Centralized User Module");
		Thread.sleep(3000);
		testdropdown.clickOnSave();
		Thread.sleep(3000);

		ArmsLandingPage landpage = new ArmsLandingPage(driver);
		landpage.clickOnUserMangement();
		Thread.sleep(3000);

		CreateOrganizationPage orgPage = new CreateOrganizationPage(driver);

		orgPage.clickOnOrganizations();
		orgPage.clickOnaddbutton();

		orgPage.enterOrganizationName("Ascent Corp");
		orgPage.enterAddressLine1("Nsl Arena");
		orgPage.enterAddressLine2("Uppal-nsl");
		orgPage.enterArea("Uppal");
		orgPage.enterCity("Hyderabad");
		orgPage.enterState("Telangana");
		orgPage.enterCountry("India");
		orgPage.enterZipCode("500039");
		orgPage.selectTimezone("IST");

		orgPage.enterFirstName("Hema");
		orgPage.enterMiddleName("priya");
		orgPage.enterLastName("Yadav");
		orgPage.enterEmail("hema.yadav@example.com");
		orgPage.enterContactAddressLine1("NSL ARENA");
		orgPage.enterContactAddressLine2("NSL ARENA");
		orgPage.enterContactArea("Madhapur");
		orgPage.enterContactCity("Hyderabad");
		orgPage.enterContactState("Telangana");
		orgPage.enterContactCountry("India");
		orgPage.enterZipContactCode("500039");
		orgPage.clickOnEVBV();
		orgPage.clickSave();
		Thread.sleep(3000);
		orgPage.clickBack();
		orgPage.clickOnInvite();
		orgPage.clickOnEdit();

	}
}
