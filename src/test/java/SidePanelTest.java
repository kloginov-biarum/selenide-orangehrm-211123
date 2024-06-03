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

}
