package pageObjectModelTest.FilterFelderTest;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjectModel.FilterFelder.Date;
import pageObjectModel.FilterFelder.FilterPrioritat;
import pageObjectModelTest.login.LoginPageTest;
import webdriver.Driver;

public class DateTest extends  Driver {

    WebDriver driver;
    LoginPageTest loginPageTest = new LoginPageTest();
    Date date = new Date();

    @Test
    public void clickFilterFelderReporter() throws Throwable {
        loginPageTest.login_Website();
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

    }
    @After
    public void closeconnection(){
        quitDriver();
    }
}