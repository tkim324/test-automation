package pageObjectModelTest.main;

import org.junit.Test;
import pageObjectModel.main.MainPage;
import pageObjectModelTest.login.LoginPageTest;

public class MainPageTest{

    LoginPageTest loginPageTest = new LoginPageTest();
    MainPage mainPage = new MainPage();

    @Test
    public void clickAllButtons() {
        loginPageTest.loginWebsite();
        mainPage.clickEintragAnzeigen();
        mainPage.clickEintragAnzeigen();
        mainPage.clickAenderungsprotokoll();
        mainPage.clickRoadmap();
        mainPage.clickZusammenfassung();
        mainPage.clickVerwaltung();
        mainPage.clickUebersicht();
        //System.out.println(driver.getTitle());
    }

    @Test
    public void clickBtnEintragErfassen() {
        loginPageTest.loginWebsite();
        mainPage.clickEintragErfassen();
        //System.out.println(driver.getTitle());
    }




}