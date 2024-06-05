import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MaintenancePage {
    private SelenideElement header = $("[class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]");

    public void checkMaintenanceHeader() {
        header.shouldHave(text("Maintenance"));
    }
}
