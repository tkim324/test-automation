package pageObjectModelTest.main;

import org.junit.After;
import org.junit.Test;
import pageObjectModel.main.EintragErfassan;
import pageObjectModel.useCase.LoginPageCase;

import webdriver.Driver;

public class EintragErfassanTest extends Driver {

    LoginPageCase loginPageCase = new LoginPageCase();
    EintragErfassan eintragErfassan = new EintragErfassan();


    @Test
    public void clickBtnEintragErfassen() throws Throwable {
        loginPageCase.loginWebsite();
        eintragErfassan.clickEintragErfassen();
        eintragErfassan.clickprojectWahlen();
        eintragErfassan.clickreproduzierbar();
        eintragErfassan.clickschweregrad();
        eintragErfassan.clickprioritat();
        //eintragErfassan.clickbtnplus();
        eintragErfassan.clickplatform();
        eintragErfassan.clickbetriebssystem();
        eintragErfassan.clickbsVersion();
        eintragErfassan.clickrzuordnungAn();
        eintragErfassan.clickbtnZusammenfassung();
        eintragErfassan.clickbtnBeschreibung();
        eintragErfassan.schritteZurReproduktion();
        eintragErfassan.zusatzlicheInfo();
        eintragErfassan.clickbtnPrivat();
        eintragErfassan.clickbtnEintragAbsenden();
       // quitDriver();


   }

    @After
    public void closeconnection(){
        quitDriver();
    }


}