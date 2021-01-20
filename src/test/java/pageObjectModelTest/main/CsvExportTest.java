package pageObjectModelTest.main;

import pageObjectModel.main.CsvExport;
import webdriver.Driver;
import org.junit.After;
import org.junit.Test;
import pageObjectModel.pages.MainPage;
import pageObjectModel.useCase.LoginPageCase;


public class CsvExportTest extends Driver {


    LoginPageCase loginPageCase = new LoginPageCase();
    MainPage mainPage =  new MainPage();
    CsvExport csvExport = new CsvExport();

    @Test
    public void clickFilterFelderReporter() throws InterruptedException {
        loginPageCase.loginWebsite();
        csvExport.btnEintrageAnzeigen();
        csvExport.clickCsvExport();

    }

    @After
    public void closeconnection(){
        quitDriver();
    }
}
