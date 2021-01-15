package pageObjectModelTest.main;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjectModel.main.MainPage;
import pageObjectModelTest.login.LoginPageTest;

public class MainPageTest{

    WebDriver driver;
    LoginPageTest loginPageTest = new LoginPageTest();
    MainPage mainPage = new MainPage();

    @Test
    public void clickBtnEintragErfassen() throws  Throwable{
        loginPageTest.login_Website();
        mainPage.clickEintragErfassen();
        //System.out.println(driver.getTitle());
    }



}