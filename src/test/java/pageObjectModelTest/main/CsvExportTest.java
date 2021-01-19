package pageObjectModelTest.main;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pageObjectModel.main.CsvExport;
import pageObjectModel.useCase.LoginPageCase;
import webdriver.Driver;

import java.io.File;
import java.io.IOException;

public class CsvExportTest extends Driver {

    LoginPageCase loginPageCase = new LoginPageCase();
    CsvExport csvExport = new CsvExport();

    @Test
    public void clickFilterFelderReporter() {
        loginPageCase.loginWebsite();
        csvExport.btnEintrageAnzeigen();
        csvExport.clickCsvExport();

    }

    @After
    public void closeconnection(){
        quitDriver();
    }
}