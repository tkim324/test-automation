package pageObjectModel.FilterFelder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjectModel.WebElements;
import webdriver.Driver;

public class FilterPrioritat extends WebElements {
    WebDriver driver;

    public FilterPrioritat() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "fa-list-alt")
    private WebElement btnEintrageAnzeigen;
    public void btnEintrageAnzeigen() {clickFunction(btnEintrageAnzeigen);    }

    @FindBy(id = "show_priority_filter")
    private WebElement btnprioritat;
    public void clickbtnprioritat() {clickFunction(btnprioritat);    }

    public void choosePrioritat(){
    WebElement element = driver.findElement(By.name("priority[]"));
    Select slc =new Select(element);
    element=driver.findElement(By.name("priority[]"));
    slc= new Select(element);
        slc.selectByIndex(3);}



    @FindBy(xpath = "//body/div[@id='main-container']/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[2]")
    private WebElement btnfiltersearch;
    public void clickbtnfiltersearch () { clickFunction(btnfiltersearch);}

    @FindBy(xpath = "//body[@class='skin-3']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='row']/div[@class='col-md-12 col-xs-12']/div[@class='filter-box']/div[@id='filter']/div[@class='widget-body']/div[@class='widget-toolbox padding-4 clearfix']/div[@class='btn-toolbar']/div[@class='form-inline']/div[@class='btn-group pull-left']/a[1]")
    private WebElement btnzurucksetzen;
    public void clickbtnzurucksetzen (){ clickFunction(btnzurucksetzen);}



}
