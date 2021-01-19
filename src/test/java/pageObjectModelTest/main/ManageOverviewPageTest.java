package pageObjectModelTest.main;

import org.junit.After;
import org.junit.jupiter.api.Test;
import pageObjectModel.WebElements;
import pageObjectModel.pages.BugReportPage;
import pageObjectModel.pages.MainPage;
import pageObjectModel.pages.ManageOverviewPage;
import pageObjectModel.useCase.LoginPageCase;

class ManageOverviewPageTest extends WebElements {

    BugReportPage bugReportPage = new BugReportPage();
    LoginPageCase loginPageCase = new LoginPageCase();
    MainPage mainPage = new MainPage();
    ManageOverviewPage manageOverviewPage = new ManageOverviewPage();

    @After
    public void teardown() {quitDriver();}

    @Test
    void clickTheButtons() {
        loginPageCase.loginWebsite();
        mainPage.clickVerwaltung();
        manageOverviewPage.clickBtnBenutzerVerwalten();
        manageOverviewPage.clickBtnI();
    }

    @Test
    void clickBtnVerwalteProfileueberVerwaltung() {
        loginPageCase.loginWebsite();
        mainPage.clickVerwaltung();
        manageOverviewPage.clickBtnProfileVerwalten();
        manageOverviewPage.clickRechnertyp();
        manageOverviewPage.clickBetriebssystem();
        manageOverviewPage.clickBSVersion();
        manageOverviewPage.clickBeschreibung();
        manageOverviewPage.clickBtnProfilHinzufuegen();
    }

    @Test
    void clickBtnVerwalteProfileueberVerwaltungmitHilfevonEintragErfassen() {
        loginPageCase.loginWebsite();
        mainPage.clickVerwaltung();
        manageOverviewPage.clickBtnProfileVerwalten();
        bugReportPage.clickRechnertyp();
        bugReportPage.clickBetriebssystem();
        bugReportPage.clickBSVersion();
        bugReportPage.clickBeschreibung();
        bugReportPage.clickBtnEintragAbsenden();
    }

    @Test
    void ProfileInvert(){
        loginPageCase.loginWebsite();
        mainPage.clickEintragErfassen();
        bugReportPage.clickBtnEintragAbsenden();
    /*    bugReportPage.clickBtnPlus();
        manageOverviewPage.clickRechnertyp();
        manageOverviewPage.clickBetriebssystem();
        manageOverviewPage.clickBSVersion();
        manageOverviewPage.clickBeschreibung();
        manageOverviewPage.clickBtnProfilHinzufuegen();*/
    }
}
