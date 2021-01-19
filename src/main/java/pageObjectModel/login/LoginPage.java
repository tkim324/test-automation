package pageObjectModel.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.WebElements;


public class LoginPage extends WebElements {

    private String correctUsername = "ffischer";
    private String correctPassword = "5elenium";
    private String incorrectUsername = "test";
    private String incorrectPassword = "123456";


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }


        @FindBy(name = "username")
        private WebElement subjectUsername;

        public void insertUsername() {
            sendKeysFunction(subjectUsername, correctUsername);
        }

        public void insertIncorrectUsername() {
            sendKeysFunction(subjectUsername, incorrectUsername);
        }


        @FindBy(name = "password")
        private WebElement subjectPassword;

        public void insertPassword () {

            sendKeysFunction(subjectPassword, correctPassword);
        }

        public void insertIncorrectPassword() {
        sendKeysFunction(subjectPassword, incorrectPassword);
        }

        @FindBy(xpath = "//input[@class='width-40 pull-right btn btn-success btn-inverse bigger-110']")
        private WebElement LoginButton;

        public void clickLoginButton () {
            clickFunction(LoginButton);
        }

}



