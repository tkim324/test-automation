package pageObjectModelTest.FilterFelderTest;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjectModel.FilterFelder.FilterPrioritat;
import pageObjectModel.FilterFelder.FilterReporter;
import pageObjectModelTest.login.LoginPageTest;
import webdriver.Driver;

public class FilterPrioritatTest extends  Driver {

    WebDriver driver;
    LoginPageTest loginPageTest = new LoginPageTest();
    FilterPrioritat filterPrioritat = new FilterPrioritat();

    @Test
    public void clickFilterFelderReporter() throws Throwable {
        loginPageTest.login_Website();
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