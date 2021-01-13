package ergunsScript;

import login.LoginPage;
import main.MainPage;
import org.junit.Test;
import webdriver.WebDriver;

public class MainPageTest extends WebDriver {
    @Test
    public void navBar1() throws InterruptedException {
        navigateUrl(LoginPage.URL);
        LoginPage.signIn(LoginPage.correctUsername, LoginPage.correctPassword);
        MainPage.erfassungTest();
        MainPage.viewAll();
        MainPage.updateInfo();
        MainPage.viewAll();
        MainPage.viewObserve();
    }

}
