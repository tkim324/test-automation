package pageObjectModel.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import pageObjectModel.WebElements;
import webdriver.Driver;

public class MainPage extends WebElements {

    WebDriver driver;

    public MainPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "fa-edit")
    private WebElement btnEintragErfassen;

    public void clickEintragErfassen(){
        clickFunction(btnEintragErfassen);
    }


}
