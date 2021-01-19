package pageObjectModelTest.FilterFelderTest;

import org.junit.After;
import org.junit.Test;
import pageObjectModel.FilterFelder.FilterReporter;
import pageObjectModel.useCase.LoginPageCase;
import webdriver.Driver;


public class FilterReporterTest extends  Driver {

      LoginPageCase loginPageCase = new LoginPageCase();
    FilterReporter filter = new FilterReporter();

    @Test
    public void clickFilterFelderReporter() throws Throwable {
        loginPageCase.loginWebsite();
        filter.btnEintrageAnzeigen();
        filter.clickbtnReporter();
        filter.typebtnReporterId();
        //filter.choseReporter();
        filter.clickbtnfiltersearch();
        filter.clickbtnzurucksetzen();

    }
    @After
    public void closeconnection(){
        quitDriver();
    }
}