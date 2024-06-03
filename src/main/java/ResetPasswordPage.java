import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;

public class ResetPasswordPage {
    private SelenideElement header = $(byTagName("h6"));

    public void headerHasText(String expectedText) {
        header.shouldBe(Condition.visible).shouldHave(Condition.text(expectedText));
    }
}
