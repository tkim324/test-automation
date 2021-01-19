package pageObjectModelTest.main;

import org.junit.After;
import org.junit.Test;
import pageObjectModel.WebElements;
import pageObjectModel.useCase.LoginPageCase;
import pageObjectModel.pages.MainPage;


public class MainPageTest extends WebElements {

    LoginPageCase loginPageCase = new LoginPageCase();
    MainPage mainPage = new MainPage();

    @After
    public void teardown() {quitDriver();}

    @Test
    public void clickNavBarAllButtons() {
        loginPageCase.loginWebsite();
        mainPage.clickAenderungsprotokoll();
        mainPage.clickEintragAnzeigen();
        mainPage.clickEintragAnzeigen();
        mainPage.clickRoadmap();
        mainPage.clickZusammenfassung();
        mainPage.clickUebersicht();
        mainPage.clickVerwaltung();
        System.out.println(driver.getTitle());
        //Assertion(, "MantisBT");
        //quitDriver();
    }

    @Test
    public void clickBtnEintragErfassen() {
        loginPageCase.loginWebsite();
        mainPage.clickEintragErfassen();
        System.out.println(driver.getTitle());
        //quitDriver();
    }




}