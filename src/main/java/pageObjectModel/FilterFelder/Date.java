package pageObjectModel.FilterFelder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.WebElements;
import webdriver.Driver;

public class Date extends WebElements {
    WebDriver driver;
    public Date() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(className = "fa-list-alt")
    private WebElement btnEintrageAnzeigen;
    public void btnEintrageAnzeigen() {clickFunction(btnEintrageAnzeigen);    }

    @FindBy(id = "do_filter_by_date_filter")
    private WebElement nachErfassungDatum;
    public void btnNachErfassungDatumn() {clickFunction(nachErfassungDatum);    }

    @FindBy (xpath = "//span[@class='lbl padding-6 small']")
    private WebElement btnErfassungCheck;
    public void clickErfassungCheck(){ clickFunction(btnErfassungCheck);}

    @FindBy(name = "start_year")
    private WebElement btnStartYear;
    public void chooseStartYear(){ sendKeysFunction(btnStartYear , "2019");};

    @FindBy(name = "start_month")
    private WebElement btnStartMonth;
    public void chooseStartMont(){ sendKeysFunction(btnStartMonth , "April");};

    @FindBy(name = "start_day")
    private WebElement btnStartDay;
    public void chooseStartDay(){ sendKeysFunction(btnStartDay , "6");};

    @FindBy(name = "end_year")
    private WebElement btnEndYear;
    public void chooseEndYear(){ sendKeysFunction(btnEndYear , "2019");};

    @FindBy(name = "end_month")
    private WebElement btnEndMonth;
    public void chooseEndMonth(){ sendKeysFunction(btnEndMonth , "April");};

    @FindBy(name = "end_day")
    private WebElement btnEndDay;
    public void chooseEndDay(){ sendKeysFunction(btnEndDay , "7");};


    @FindBy(xpath = "//body/div[@id='main-container']/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[2]")
    private WebElement btnfiltersearch;
    public void clickbtnfiltersearch () { clickFunction(btnfiltersearch);}

    @FindBy(xpath = "//body[@class='skin-3']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='row']/div[@class='col-md-12 col-xs-12']/div[@class='filter-box']/div[@id='filter']/div[@class='widget-body']/div[@class='widget-toolbox padding-4 clearfix']/div[@class='btn-toolbar']/div[@class='form-inline']/div[@class='btn-group pull-left']/a[1]")
    private WebElement btnzurucksetzen;
    public void clickbtnzurucksetzen (){ clickFunction(btnzurucksetzen);}




}
