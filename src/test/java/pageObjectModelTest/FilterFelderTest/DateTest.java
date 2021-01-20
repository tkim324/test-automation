package pageObjectModelTest.FilterFelderTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageObjectModel.FilterFelder.Date;
import pageObjectModel.WebElements;
import pageObjectModel.useCase.LoginPageCase;


public class DateTest extends WebElements {

    LoginPageCase loginPageCase = new LoginPageCase();
    Date date = new Date();


    @Test
    public void clickFilterFelderReporter() throws Throwable {
        loginPageCase.loginWebsite();
        date.btnEintrageAnzeigen();
        date.btnNachErfassungDatumn();
        date.clickErfassungCheck();
        date.chooseStartYear();
        date.chooseStartMont();
        date.chooseStartDay();
        date.chooseEndYear();
        date.chooseEndMonth();
        date.chooseEndDay();

        date.clickbtnfiltersearch();
        date.clickbtnzurucksetzen();
       // System.out.println(driver.getTitle());
       Assert.assertEquals(driver.getTitle(), "View Issues - MantisBT");

    }


    @After
    public void closeconnection(){
        quitDriver();
    }
}