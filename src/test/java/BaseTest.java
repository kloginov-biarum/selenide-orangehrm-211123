import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeEach
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        Configuration.browserCapabilities = options;
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    ResetPasswordPage resetPasswordPage = new ResetPasswordPage();
    SidePanel sidePanel = new SidePanel();
    AdminPage adminPage = new AdminPage();
    PimPage pimPage = new PimPage();
    AdminAuthPage adminAuthPage = new AdminAuthPage();
    MaintenancePage maintenancePage = new MaintenancePage();
}
