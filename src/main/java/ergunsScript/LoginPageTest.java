package ergunsScript;

        import login.LoginPage;
        import org.junit.Assert;
        import org.junit.Test;
        import webdriver.WebDriver;


public class LoginPageTest extends WebDriver {


    @Test
    public void correctLogin() {
        navigateUrl(WebDriver.URL);
        LoginPage.signIn(LoginPage.correctUsername, LoginPage.correctPassword);
        Assert.assertEquals(driver.getTitle(), "Übersicht - MantisBT");
        //System.out.println(driver.getTitle());
    }

    @Test
    public void incorrectLogin() throws InterruptedException {
        navigateUrl(LoginPage.URL);
        LoginPage.signIn(LoginPage.incorrectUsername, LoginPage.incorrectPassword);
        Assert.assertEquals(driver.getTitle(),"MantisBT");
        //System.out.println(driver.getTitle());

    }
   
}
