import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement username =  $("[name=\"username\"]");

    private SelenideElement password = $("[name=\"password\"]");

    private SelenideElement loginButton = $("[type=\"submit\"]");

    private SelenideElement errorMessageText = $(".oxd-alert-content .oxd-alert-content-text");

    private SelenideElement forgotPasswordLink = $("[class= \"oxd-text oxd-text--p orangehrm-login-forgot-header\"]");
    private SelenideElement errorMessageRequiredUsername = $(Selectors.byXpath("(//span)[1]"));
    private SelenideElement errorMessageRequiredPass = $(Selectors.byXpath("(//span)[2]"));


    private SelenideElement twitterLink = $("[href=\"https://twitter.com/orangehrm?lang=en\"]");

    private SelenideElement facebookLink = $("[href=\"https://www.facebook.com/OrangeHRM/\"]");

    private SelenideElement youtubeLink = $("[href=\"https://www.youtube.com/c/OrangeHRMInc\"]");

    private SelenideElement linkedInLink = $("[href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]");

    private SelenideElement headerLogo = $("[alt=\"company-branding\"]");

    //twitterLinkIsDisplayed
    public void twitterLinkIsDisplayed(){
        twitterLink.shouldBe(visible);
    }

    public void followTwitterLink(){
        twitterLink.click();
    }
    //facebookLink
    public void facebookLinkIsDisplayed(){
        facebookLink.shouldBe(visible);
    }
    //youtubeLink
    public void youtubeLinkIsDisplayed(){
        youtubeLink.shouldBe(visible);
    }
    //linkedInLink
    public void linkedInLinkIsDisplayed(){
        linkedInLink.shouldBe(visible);
    }

    public void followLinkedInLink(){
        linkedInLink.click();
    }


    //forgot pass link

    private SelenideElement requiredErrorMessage =
            $("[class=\"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\"]");

    public void enterUsername(String usernameValue){
        username.setValue(usernameValue);
    }

    public void enterPassword(String passwordValue){
        password.setValue(passwordValue);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void errorMessageTextCheck(String expectedText){
        errorMessageText.shouldBe(visible).shouldHave(text(expectedText));
    }

    public void requiredErrorMessageIsDisplayed(String requiredText){
        requiredErrorMessage.shouldBe(visible).shouldHave(text(requiredText));
    }

    //follow the forgot password link
    public void clickOnForgotPasswordLink(){
        forgotPasswordLink.click();
    }

    public void headerLogoIsDisplayed(){
        headerLogo.shouldBe(visible);
    }
}
