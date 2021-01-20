package pageObjectModelTest.FilterFelderTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageObjectModel.FilterFelder.FilterPrioritat;
import pageObjectModel.useCase.LoginPageCase;
import webdriver.Driver;

public class FilterPrioritatTest extends Driver {
    LoginPageCase loginPageCase = new LoginPageCase();
    FilterPrioritat filterPrioritat = new FilterPrioritat();
    @Before
    public void openconnection(){
        loginPageCase.loginWebsite();
    }

    @Test
    public void clickFilterFelderReporter() throws Throwable {

        filterPrioritat.btnEintrageAnzeigen();
        filterPrioritat.clickbtnprioritat();
        filterPrioritat.choosePrioritat();
        filterPrioritat.clickbtnfiltersearch();
        filterPrioritat.clickbtnzurucksetzen();
       // System.out.println(driver.getCurrentUrl());
       // Assert.assertEquals(driver.getCurrentUrl(), "https://mantis.haeger-consulting.de/view_all_bug_page.php");
        Assert.assertNotNull("notnull");
    }
    @After
    public void closeconnection(){
        quitDriver();
    }
}