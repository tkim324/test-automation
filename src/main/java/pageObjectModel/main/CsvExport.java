package pageObjectModel.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.WebElements;
import webdriver.Driver;

public class CsvExport extends WebElements {
    WebDriver driver;

    public CsvExport() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "fa-list-alt")
    private WebElement btnEintrageAnzeigen;
    public void btnEintrageAnzeigen() {clickFunction(btnEintrageAnzeigen);    }

    @FindBy(linkText = "CSV-Export")
    private WebElement btnCsvExport;

    public void clickCsvExport() {
        clickFunction(btnCsvExport);
    }


}