import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SidePanel {

   // 12 SelenideElement

    private SelenideElement pimLink = $(byCssSelector("a[href='/web/index.php/pim/viewPimModule']"));

    private ElementsCollection links = $$(byClassName("oxd-main-menu-item-wrapper"));

    private SelenideElement adminLink = $(byCssSelector("[href=\"/web/index.php/admin/viewAdminModule\"]"));

    private SelenideElement maintenanceLink = $(byCssSelector("a[href='/web/index.php/maintenance/viewMaintenanceModule']"));

    private SelenideElement searchBar = $("[placeholder=\"Search\"]");

    private SelenideElement timeLink = $("[href=\"/web/index.php/time/viewTimeModule\"]");
    public void checkAllLinks(){
        links.shouldHave(CollectionCondition.size(12));
    }

    public void followTheAdminLink(){
        adminLink.shouldBe(Condition.visible).click();
    }

    public void followPimLink(){
        pimLink.click();
    }

    public void followMaintenanceLink(){
        maintenanceLink.click();
    }

    public void enterValueInSearchBar(String searchValue){

        searchBar.setValue(searchValue);

    }

    public void checkLinksNumber(int expectedSize) {
        links.shouldHave(CollectionCondition.size(expectedSize));
    }

    public void checkTimeLinkIsDisplayed(){
        timeLink.shouldBe(Condition.visible);
    }


    public void checkAllLinksHaveText(String expectedPartText){
        for (SelenideElement link: links) {
            link.shouldHave(text(expectedPartText));
        }
    }

    public void checkLinksTexts(){
        links.filter(visible).shouldHave(CollectionCondition.exactTexts("Maintenance", "Performance"));
    }
}
