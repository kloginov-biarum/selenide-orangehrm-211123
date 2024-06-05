import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class AdminAuthPage {

    private SelenideElement usernameInput = $("[name=\"username\"]");
    private SelenideElement passwordInput = $("[type=\"password\"]");
    private SelenideElement confirmButton = $("[type=\"submit\"]");

    public void enterUsername(String usernameValue) {
        usernameInput.setValue(usernameValue);
    }

    public void enterPassword(String passwordValue) {
        passwordInput.setValue(passwordValue);
    }

    public void clickOnConfirmButton (){
        confirmButton.shouldBe(visible).click();
    }
}
