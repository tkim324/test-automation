package pageObjectModelTest.FilterFelderTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pageObjectModel.FilterFelder.FilterReporter;
import pageObjectModel.useCase.LoginPageCase;
import webdriver.Driver;


public class FilterReporterTest extends  Driver {

      LoginPageCase loginPageCase = new LoginPageCase();
    FilterReporter filter = new FilterReporter();

    @Before
    public void openconnection(){
        loginPageCase.loginWebsite();
    }

    @Test
    public void clickFilterFelderReporter() throws Throwable {

        filter.btnEintrageAnzeigen();
        filter.clickbtnReporter();
        filter.typebtnReporterId();
        //filter.choseReporter();
        filter.clickbtnfiltersearch();
        filter.clickbtnzurucksetzen();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "View Issues - MantisBT");


    }
    @After
    public void closeconnection(){
        quitDriver();
    }
}