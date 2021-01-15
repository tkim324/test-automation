package pageObjectModelTest.login;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageObjectModel.login.LoginPage;
import webdriver.Driver;

import java.util.concurrent.TimeUnit;

public class LoginPageTest extends Driver{
        WebDriver driver;
        LoginPage loginPage = new LoginPage();

        @Test
        void navigate_to_Website() {
                driver= Driver.getDriver();
                driver.manage().window().maximize();
                driver.get(URL);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                Assert.assertEquals(driver.getTitle(), "MantisBT");
                //System.out.println(driver.getTitle());
        }

        @Test
        public void login_Website() {
                navigate_to_Website();
                loginPage.insertUsername();
                loginPage.clickLoginButton();
                loginPage.insertPassword();
                loginPage.clickLoginButton();
                Assert.assertEquals(driver.getTitle(),"Übersicht - MantisBT"); //fuehrt zu Fehler!
                //System.out.println(driver.getTitle());
        }

        @Test
        void incorrect_login_Website() {
                navigate_to_Website();
                loginPage.insertIncorrectUsername();
                loginPage.clickLoginButton();
                loginPage.insertIncorrectPassword();
                loginPage.clickLoginButton();
                Assert.assertEquals(driver.getTitle(),"MantisBT"); //fuehrt zu Fehler!
                //System.out.println(driver.getTitle());
        }

}