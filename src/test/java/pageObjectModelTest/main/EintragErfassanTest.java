package pageObjectModelTest.main;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageObjectModel.main.EintragErfassan;
import pageObjectModel.useCase.LoginPageCase;
import pageObjectModel.WebElements;



public class EintragErfassanTest extends WebElements {

    LoginPageCase loginPageCase = new LoginPageCase();
    EintragErfassan eintragErfassan = new EintragErfassan();

    @Before
    public void openconnection(){
        loginPageCase.loginWebsite();
    }

    @Test
    public void clickBtnEintragErfassen() throws Throwable {

        eintragErfassan.clickEintragErfassen();
        eintragErfassan.clickprojectWahlen();
//        eintragErfassan.clickreproduzierbar();
//        eintragErfassan.clickschweregrad();
//        eintragErfassan.clickprioritat();
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
       // System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "MantisBT");


   }

    @After
    public void closeconnection(){
        quitDriver();
    }


}