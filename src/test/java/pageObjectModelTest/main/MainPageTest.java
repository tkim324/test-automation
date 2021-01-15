package pageObjectModelTest.main;

import org.junit.Test;
import pageObjectModel.WebElements;
import pageObjectModel.login.LoginPageCase;
import pageObjectModel.main.MainPage;


public class MainPageTest extends WebElements {

    LoginPageCase loginPageCase = new LoginPageCase();
    MainPage mainPage = new MainPage();

    @Test
    public void clickAllButtons() {
        loginPageCase.loginWebsite();
        mainPage.clickAenderungsprotokoll();
        mainPage.clickEintragAnzeigen();
        mainPage.clickEintragAnzeigen();
        mainPage.clickRoadmap();
        mainPage.clickZusammenfassung();
        mainPage.clickUebersicht();
        mainPage.clickVerwaltung();
        System.out.println(driver.getTitle());
        quitDriver();
    }

    @Test
    public void clickBtnEintragErfassen() {
        loginPageCase.loginWebsite();
        mainPage.clickEintragErfassen();
        System.out.println(driver.getTitle());
        quitDriver();
    }




}