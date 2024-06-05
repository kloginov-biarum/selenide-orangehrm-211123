import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AdminAuthPage {

    private SelenideElement usernameInput = $("[name=\"username\"]");
    private SelenideElement passwordInput = $("[type=\"password\"]");
    private SelenideElement confirmButton = $("[type=\"submit\"]");
    private SelenideElement errorMessageTextPassword = $x("//*[@class='oxd-text oxd-text--p oxd-alert-content-text']");
            //$(byXpath("//*[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]"));
            //$(byClassName("oxd-text oxd-text--p oxd-alert-content-text"));
            //$(byClassName("oxd-alert-content-text"));
            //$(byCssSelector("[class=\"oxd-text oxd-text--p oxd-alert-content-text\"]"));

    public void enterUsername(String usernameValue) {
        usernameInput.setValue(usernameValue);
    }

    public void enterPassword(String passwordValue) {
        passwordInput.setValue(passwordValue);
    }

    public void clickOnConfirmButton (){
        confirmButton.shouldBe(visible).click();
    }
    public void errorMessageTextPasswordCheck(String requiredText){
        errorMessageTextPassword.shouldBe(visible).shouldHave(text(requiredText));
    }
}
