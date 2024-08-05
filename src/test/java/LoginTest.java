import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest{


    @Test
    public void successLoginTest(){
       loginPage.enterUsername("Admin");
       loginPage.enterPassword("admin123");
       loginPage.clickOnLoginButton();
       dashboardPage.headerHasText("Dashboard");
    }

    @Test
    public void invalidPasswordTest(){
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin");
        loginPage.clickOnLoginButton();
        loginPage.errorMessageTextCheck("Invalid credentials");
    }


    @Test
    //invalid username
    public void invalidUser(){

    }


    //Empty password
    @Test
    public void testEmptyPass(){
        //error message "Required" is displayed under the password input field
        loginPage.enterUsername("Admin");
        loginPage.clickOnLoginButton();
        loginPage.requiredErrorMessageIsDisplayed("Required");
        }

     //Empty username


    //Empty username & Empty password


    //Check Forgot your password link
    @Test
    public void forgotPasswordLinkTest(){
        LoginPage loginPage = new LoginPage();
        //follow the link "Forgot your password"
        loginPage.clickOnForgotPasswordLink();
        //reset password page
        resetPasswordPage.headerHasText("Reset Password");
    }


    //Check LinkedIN link is displayed
    //Check Facebook link is displayed
    //Check Twitter link is displayed
    //Check Youtube link is displayed
    @Test
    public void checkIconsLinkTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.twitterLinkIsDisplayed();
        loginPage.facebookLinkIsDisplayed();
        loginPage.youtubeLinkIsDisplayed();
        loginPage.linkedInLinkIsDisplayed();
    }
    @Test
    public void checkFollowLinkLinkedin(){
        loginPage.followLinkedInLink();
        LinkedInPage linkedInPage = new LinkedInPage();
        switchTo().window(1);
        linkedInPage.linkedInTextContains("LinkedIn");

    }

    //twitter
    @Test
    public void checkTwitterLink(){
        LoginPage loginPage = new LoginPage();
        loginPage.followTwitterLink();
        switchTo().window(1);
        String url = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(url.contains("x.com"));
    }
    //facebook
    //youtube

    @Test
    public void checkLogo(){
        loginPage.headerLogoIsDisplayed();
    }


}
