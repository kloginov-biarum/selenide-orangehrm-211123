import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SidePanel {

   // 12 SelenideElement

    private ElementsCollection links = $$(byClassName("oxd-main-menu-item-wrapper"));

    private SelenideElement adminLink = $(byCssSelector("[href=\"/web/index.php/admin/viewAdminModule\"]"));

    public void checkAllLinks(){
        links.shouldHave(CollectionCondition.size(12));
    }

    public void followTheAdminLink(){
        adminLink.shouldBe(Condition.visible).click();
    }
}
