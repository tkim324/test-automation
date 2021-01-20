package pageObjectModel.main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.WebElements;
import webdriver.Driver;

public class CsvExport extends WebElements {
    public CsvExport() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "fa-list-alt")
    private WebElement btnEintrageAnzeigen;
    public void btnEintrageAnzeigen() {clickFunction(btnEintrageAnzeigen);    }

    @FindBy(css = "body.skin-3:nth-child(2) div.main-container:nth-child(3) div.main-content div.page-content div.row div.col-md-12.col-xs-12:nth-child(2) div.widget-box.widget-color-blue2 div.widget-body div.widget-toolbox.padding-8.clearfix div.btn-toolbar div.btn-group.pull-left:nth-child(1) > a.btn.btn-primary.btn-white.btn-round.btn-sm:nth-child(2)")
    private WebElement btnCsvExport;

    public void clickCsvExport() {
        clickFunction(btnCsvExport);
    }


}