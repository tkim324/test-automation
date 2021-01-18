package pageObjectModelTest.main;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjectModel.main.EintragErfassan;
import pageObjectModel.main.MainPage;
import pageObjectModelTest.login.LoginPageTest;
import webdriver.Driver;

public class EintragErfassanTest extends Driver {
    WebDriver driver;
    LoginPageTest loginPageTest = new LoginPageTest();
    EintragErfassan eintragErfassan = new EintragErfassan();


    @Test
    public void clickBtnEintragErfassen() throws Throwable {
        loginPageTest.login_Website();
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