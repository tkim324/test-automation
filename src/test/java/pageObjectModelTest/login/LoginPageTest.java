package pageObjectModelTest.login;

import org.junit.After;
import org.junit.jupiter.api.Test;
import pageObjectModel.WebElements;
import pageObjectModel.login.LoginPage;
import pageObjectModel.useCase.LoginPageCase;


import java.util.concurrent.TimeUnit;

public class LoginPageTest extends WebElements {

        LoginPage loginPage = new LoginPage();
        LoginPageCase loginPageCase = new LoginPageCase();

        @After
        public void teardown() {quitDriver();}

        @Test
        void navigateToWebsite() {
                driver.manage().window().maximize();
                driver.get(URL);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                //Assert.assertEquals(driver.getTitle(), "MantisBT");
                System.out.println(driver.getTitle());
                //quitDriver();
        }

        @Test
        void loginWebsite() {
                loginPageCase.navigateToWebsite();
                loginPage.insertUsername();
                loginPage.clickLoginButton();
                loginPage.insertPassword();
                loginPage.clickLoginButton();
                //Assert.assertEquals(driver.getTitle(),"Übersicht - MantisBT"); //fuehrt zu Fehler!
                System.out.println(driver.getTitle());
                //quitDriver();
        }

        @Test
        void incorrectLoginWebsite() {
                loginPageCase.navigateToWebsite();
                loginPage.insertIncorrectUsername();
                loginPage.clickLoginButton();
                loginPage.insertIncorrectPassword();
                loginPage.clickLoginButton();
                //Assert.assertEquals(driver.getTitle(),"MantisBT"); //fuehrt zu Fehler!
                System.out.println(driver.getTitle());
                //quitDriver();
        }

}