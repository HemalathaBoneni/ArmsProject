package Testclases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.utility.GenericKeywords;
import com.utility.ReadConfigFile;


import pageclasses.PasswordResetPage;

public class PasswordResetTest extends BaseTest
{
	ReadConfigFile config;
	PasswordResetPage Passwordreset;

	public PasswordResetTest() throws IOException
	{
		super();
		Passwordreset = new PasswordResetPage(GenericKeywords.driver);
	}

	@Test
	public void ResetPassword() throws Throwable
	{
		//WebDriver driver = null;
		Passwordreset = new PasswordResetPage(GenericKeywords.driver);
		
		 config =new ReadConfigFile();
		Passwordreset.email();
		Passwordreset.password();
		Passwordreset.login();
		Passwordreset.ForgetPassword();
		Passwordreset.EnterEmailIDForResetPassword();
		Passwordreset.ResetPasswordDetails();
		throw new SkipException("Skipping this test case intentionally");
		
		}
}
