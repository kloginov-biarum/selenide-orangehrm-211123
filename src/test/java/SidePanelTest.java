import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.jupiter.api.Test;

public class SidePanelTest extends BaseTest{

    @Test
    public void checkAllLinks(){
        //Auth
        //Check all links
    }


    @Test
    public void adminLinkTest(){
        //Auth
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        //Follow the link "Admin"
        sidePanel.followTheAdminLink();
        //Check that admin page is opened
        adminPage.checkAdminHeader();
    }

    @Test
    public void pimLinkTest(){
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        sidePanel.followPimLink();
        pimPage.checkPimHeader("PIM");
    }
    @Test
    public void maintenanceLinkTestValidCred(){
        //Auth
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        //Follow maintenance link
        sidePanel.followMaintenanceLink();
        //Administrator Access auth
        adminAuthPage.enterPassword("admin123");
        adminAuthPage.clickOnConfirmButton();
        //Check Maintenance page
        maintenancePage.checkMaintenanceHeader();
    }

    @Test
    public void maintenanceLinkTestINValidCred() {
        //Invalid credentials ERROR MESSAGE TEXT
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        sidePanel.followMaintenanceLink();
        adminAuthPage.enterPassword("2656327");
        adminAuthPage.clickOnConfirmButton();
        adminAuthPage.errorMessageTextPasswordCheck("Invalid credentials");
    }

}
