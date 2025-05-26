package Testclases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.utility.GenericKeywords;
import com.utility.ReadConfigFile;
import pageclasses.ArmsLandingPage;
import pageclasses.AscentLoginPage;
import pageclasses.ClientUsersPage;

public class ClientUsersTest extends BaseTest {
    ReadConfigFile config;

    public ClientUsersTest() throws IOException {
        super();
    }

    GenericKeywords generic = new GenericKeywords("ClientUsers");

    @Test
    public void clientUsersTest() throws InterruptedException, IOException {
        config = new ReadConfigFile();

        // Login
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

        // Navigate to Client Users
        ArmsLandingPage landpage = new ArmsLandingPage(driver);
        landpage.clickOnUserMangement();
        Thread.sleep(3000);
        landpage.clickOnClientUsers();
        Thread.sleep(3000);

        ClientUsersPage clientUsersPage = new ClientUsersPage(driver);

        // Test Invite User functionality
        clientUsersPage.clickInviteTab();
        Thread.sleep(2000);
        clientUsersPage.clickInviteUserButton();
        Thread.sleep(2000);
        clientUsersPage.enterEmail("testclientuser@example.com");
        clientUsersPage.enterFirstName("Test");
        clientUsersPage.enterLastName("ClientUser");
        clientUsersPage.clickSendInvite();
        Thread.sleep(3000);

        // Test Edit Invite
        clientUsersPage.clickEditInvite();
        Thread.sleep(2000);
        clientUsersPage.enterFirstName("UpdatedTest");
        clientUsersPage.clickSendInvite();
        Thread.sleep(3000);

        // Test Delete Invite
        clientUsersPage.clickDeleteInvite();
        Thread.sleep(2000);

        // Test Users tab functionality
        clientUsersPage.clickUsersTab();
        Thread.sleep(2000);

        // Test Nominate functionality
        clientUsersPage.clickNominateUser();
        Thread.sleep(2000);
        clientUsersPage.clickAcceptNomination();
        Thread.sleep(2000);
        clientUsersPage.closeNominationPopup();
        Thread.sleep(2000);

        // Test Edit User
        clientUsersPage.clickEditUser();
        Thread.sleep(2000);
        clientUsersPage.enterFirstName("UpdatedUser");
        clientUsersPage.clickSendInvite();
        Thread.sleep(3000);

        // Test Delete User
        clientUsersPage.clickDeleteUser();
        Thread.sleep(3000);
    }
}