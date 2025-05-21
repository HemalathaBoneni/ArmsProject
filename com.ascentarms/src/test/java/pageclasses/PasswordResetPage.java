package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.utility.GenericKeywords;

public class PasswordResetPage 
{
	public PasswordResetPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public	GenericKeywords g1 = new GenericKeywords("PasswordResetPage");

	@FindBy(xpath="//input[@id='login_name']")
	WebElement mail;

	@FindBy(xpath="//input[@id='Password']")
	WebElement passwrd;

	@FindBy(xpath="//button[@type='submit']")
	WebElement logn;

	@FindBy(xpath="//span[@class='text-danger']")
	WebElement IncorrectpasswordMsg;

	@FindBy(xpath="//a[text()='Forgot Password?']")
	WebElement forgetPassword;

	@FindBy(xpath="//input[@name='email']")
	WebElement reEnterEmailId;

	@FindBy(xpath="//button[text()='Get Details']")
	WebElement getdetailsBtn;

	@FindBy(xpath="(//input[@id='password'])[1]")
	WebElement petName;

	@FindBy(xpath="(//input[@id='password'])[2]")
	WebElement enterNewPassword;

	@FindBy(xpath="//input[@id='confirmPassword']")
	WebElement ConfirPassword;

	@FindBy(xpath="//button[text()='Update Password']")
	WebElement updatepasswordBtn;

	@FindBy(xpath="//button[text()='Update']")
	WebElement updateBtnClick;



	public void email()
	{

		mail.sendKeys("testsa@ascent.com");
	}
	public void password()
	{
		passwrd.sendKeys("HemaWrongPassword");
	}
	public void login() throws Throwable
	{
		logn.click();
		Thread.sleep(3000);
		IncorrectpasswordMsg.getText();

	}

	public void ForgetPassword() throws Throwable
	{
		forgetPassword.click();
		Thread.sleep(3000);
	}
	public void EnterEmailIDForResetPassword() throws InterruptedException
	{
		reEnterEmailId.sendKeys("testsa@ascent.com");
		getdetailsBtn.click();
		Thread.sleep(3000);
	}

	@Test
	public void ResetPasswordDetails() throws Throwable
	{
		petName.click();
		petName.sendKeys("sai"+ "");
		Thread.sleep(3000);
		enterNewPassword.click();
		enterNewPassword.sendKeys("HemaNewPasword@321");
		Thread.sleep(3000);
		ConfirPassword.click();
		Thread.sleep(3000);
		ConfirPassword.sendKeys("HemaNewPasword@321");
		Thread.sleep(3000);
		updatepasswordBtn.click();
		Thread.sleep(3000);
		updateBtnClick.click();
		Thread.sleep(3000);


	}
}
