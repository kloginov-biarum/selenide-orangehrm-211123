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

    @Test
    public void searchBarExactTextLink(){
        //Auth
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        //enter "Time" to search input field
        sidePanel.enterValueInSearchBar("Time");
        //Check that there is only one link
        sidePanel.checkLinksNumber(1);
        //Check that there is "Time" link
        sidePanel.checkTimeLinkIsDisplayed();
    }

    @Test
    public void searchBarInvalidLinkTest(){
        //Enter unexisting text link
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        sidePanel.enterValueInSearchBar("bvszxgchjxc");
        sidePanel.checkLinksNumber(0);
    }

    @Test
    public void searchBarPartTextLink(){
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        sidePanel.enterValueInSearchBar("ma");
        sidePanel.checkAllLinksHaveText("ma");
        sidePanel.checkLinksTexts();
        //Enter "ma"
        //Check that there are 2 links
        //Check that all links contains search value
    }


    //clear()
    @Test
    public void searchBarDeleteSearchQuery(){
        //Auth
        //Remember how much links are on side panel (int quantityOfLinks)
        //Enter search query
        //Delete searh query
        //Check that we have the same quantity (int quantityOfLinks)
    }

    @Test
    public void rollOutTest(){
        //AUTH
        //Click on the arrow button of the side panel
        //Check that side panel is rolled out

        //Click on the arrow button of the side panel
        //Check that there are 12 links
        //Check that all links have neccesary texts
    }




}
