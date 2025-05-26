package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.GenericKeywords;

public class ClientUsersPage {
    public WebDriver driver;
    GenericKeywords generic = new GenericKeywords("ClientUsers");

    public ClientUsersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Elements for Invite tab
    @FindBy(xpath = "//*[contains(text(),'Invite')]")
    WebElement inviteTab;

    @FindBy(xpath = "//button[contains(text(),'Invite User')]")
    WebElement inviteUserButton;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastNameField;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement sendInviteButton;

    @FindBy(xpath = "(//i[@class='fa fa-edit'])[1]")
    WebElement editInviteButton;

    @FindBy(xpath = "(//i[@class='fa fa-trash'])[1]")
    WebElement deleteInviteButton;

    // Elements for Users tab
    @FindBy(xpath = "//a[contains(text(),'Users')]")
    WebElement usersTab;

    @FindBy(xpath = "(//i[@class='fa fa-edit'])[1]")
    WebElement editUserButton;

    @FindBy(xpath = "(//i[@class='fa fa-trash'])[1]")
    WebElement deleteUserButton;

    @FindBy(xpath = "(//button[contains(text(),'Nominate')])[1]")
    WebElement nominateButton;

    @FindBy(xpath = "//button[contains(text(),'Accept')]")
    WebElement acceptNominationButton;

    @FindBy(xpath = "//button[contains(text(),'Reject')]")
    WebElement rejectNominationButton;

    @FindBy(xpath = "//button[contains(text(),'Close')]")
    WebElement closeNominationPopupButton;

    // Methods for Invite tab
    public void clickInviteTab() {
        generic.click(inviteTab);
    }

    public void clickInviteUserButton() {
        generic.click(inviteUserButton);
    }

    public void enterEmail(String email) {
        generic.clearEnter(emailField, email);
    }

    public void enterFirstName(String firstName) {
        generic.clearEnter(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        generic.clearEnter(lastNameField, lastName);
    }

    public void clickSendInvite() {
        generic.click(sendInviteButton);
    }

    public void clickEditInvite() {
        generic.click(editInviteButton);
    }

    public void clickDeleteInvite() {
        generic.click(deleteInviteButton);
    }

    // Methods for Users tab
    public void clickUsersTab() {
        generic.click(usersTab);
    }

    public void clickEditUser() {
        generic.click(editUserButton);
    }

    public void clickDeleteUser() {
        generic.click(deleteUserButton);
    }

    public void clickNominateUser() {
        generic.click(nominateButton);
    }

    public void clickAcceptNomination() {
        generic.click(acceptNominationButton);
    }

    public void clickRejectNomination() {
        generic.click(rejectNominationButton);
    }

    public void closeNominationPopup() {
        generic.click(closeNominationPopupButton);
    }
}