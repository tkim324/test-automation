package pageObjectModel.main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.WebElements;


public class CsvExport extends WebElements {


    public CsvExport() {
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