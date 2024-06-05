import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class PimPage {
    private SelenideElement headerPim = $x("//h6[1]");  //po x-path

    public void checkPimHeader(String expectedHeader){
        headerPim.shouldHave(text(expectedHeader));
    }
}
