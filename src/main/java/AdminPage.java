import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AdminPage {

    private SelenideElement header = $x("//h6[1]");


    public void checkAdminHeader(){
        header.shouldBe(Condition.visible, Duration.ofSeconds(10));
        header.shouldHave(Condition.text("Admin"));
    }
}
