import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private SelenideElement header = $(byTagName("h6"));
    //private SelenideElement hjsdbjhd = $(Selectors.)

    public void headerHasText(String expectedText){
        header.shouldBe(visible).shouldHave(text(expectedText));
    }
}
