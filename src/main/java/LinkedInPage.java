import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class LinkedInPage {

    private SelenideElement linkedInText =
            $(byCssSelector("[class =\"contextual-sign-in-modal__join-now m-auto font-sans text-md text-color-text\"]"));

    public void linkedInTextContains(String expectedText){
        linkedInText.shouldHave(text(expectedText));
    }
}
