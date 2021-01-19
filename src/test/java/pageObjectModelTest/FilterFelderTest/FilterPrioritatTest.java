package pageObjectModelTest.FilterFelderTest;

import org.junit.After;
import org.junit.Test;
import pageObjectModel.FilterFelder.FilterPrioritat;
import pageObjectModel.useCase.LoginPageCase;
import webdriver.Driver;

public class FilterPrioritatTest extends Driver {
    LoginPageCase loginPageCase = new LoginPageCase();
    FilterPrioritat filterPrioritat = new FilterPrioritat();

    @Test
    public void clickFilterFelderReporter() throws Throwable {
        loginPageCase.loginWebsite();
        filterPrioritat.btnEintrageAnzeigen();
        filterPrioritat.clickbtnprioritat();
        filterPrioritat.choosePrioritat();
        filterPrioritat.clickbtnfiltersearch();
        filterPrioritat.clickbtnzurucksetzen();

    }
    @After
    public void closeconnection(){
        quitDriver();
    }
}