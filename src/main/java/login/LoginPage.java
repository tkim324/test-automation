package login;

import webdriver.WebDriver;
import org.openqa.selenium.By;

public class LoginPage extends WebDriver {

    public static String correctUsername = "ffischer";
    public static String correctPassword = "5elenium";
    public static String incorrectUsername = "test";
    public static String incorrectPassword = "123456";

    private static By txtUsername = By.id("username");
    private static By txtPassword = By.id("password");
    private static By btnLogin = By.xpath("//input[@class='width-40 pull-right btn btn-success btn-inverse bigger-110']");
    
    public static void signIn(String username, String password) {
        driver.findElement(txtUsername).sendKeys(username);
        driver.findElement(btnLogin).click();
        driver.findElement(txtPassword).sendKeys(password);
        driver.findElement(btnLogin).click();

    }

}
