package pageObjectModel.useCase;

import pageObjectModel.WebElements;
import pageObjectModel.login.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginPageCase extends WebElements {

    public LoginPageCase(){}

    LoginPage loginPage = new LoginPage();

    public void navigateToWebsite() {
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //System.out.println(driver.getTitle());
    }

    public void loginWebsite() {
        navigateToWebsite();
        loginPage.insertUsername();
        loginPage.clickLoginButton();
        loginPage.insertPassword();
        loginPage.clickLoginButton();
        //System.out.println(driver.getTitle());
    }
}
