package pageObjectModelTest.main;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageObjectModel.WebElements;
import pageObjectModel.main.CsvExport;
import pageObjectModelTest.login.LoginPageTest;
import webdriver.Driver;

import java.io.File;
import java.io.IOException;

public class CsvExportTest  extends Driver {
    WebDriver driver;
    LoginPageTest loginPageTest = new LoginPageTest();
    CsvExport csvExport = new CsvExport();

    @Test
    public void clickFilterFelderReporter() throws Throwable {
        loginPageTest.login_Website();
        csvExport.btnEintrageAnzeigen();
        csvExport.clickCsvExport();

    }

    @After
    public void closeconnection(){
        quitDriver();
    }
}