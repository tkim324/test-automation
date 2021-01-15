package pageObjectModel.main;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import pageObjectModel.WebElements;
import webdriver.Driver;

public class MainPage extends WebElements {

    public MainPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }


    @FindBy(className = "fa-dashboard")
    private WebElement btnUebersicht;

    public void clickUebersicht(){
        clickFunction(btnUebersicht);
    }

    @FindBy(className = "fa-list-alt")
    private WebElement btnEintragAnzeigen;

    public void clickEintragAnzeigen(){
        clickFunction(btnEintragAnzeigen);
    }

    @FindBy(className = "fa-edit")
    private WebElement btnEintragErfassen;

    public void clickEintragErfassen(){
        clickFunction(btnEintragErfassen);
    }

    @FindBy(className = "fa-retweet")
    private WebElement btnAenderungsprotokoll;

    public void clickAenderungsprotokoll(){
        clickFunction(btnAenderungsprotokoll);
    }

    @FindBy(className = "fa-road")
    private WebElement btnRoadmap;

    public void clickRoadmap(){
        clickFunction(btnRoadmap);
    }

    @FindBy(className = "fa-bar-chart-o")
    private WebElement btnZusammenfassung;

    public void clickZusammenfassung(){
        clickFunction(btnZusammenfassung);
    }

    @FindBy(className = "fa-gears")
    private WebElement btnVerwaltung;

    public void clickVerwaltung(){
        clickFunction(btnVerwaltung);
}}
