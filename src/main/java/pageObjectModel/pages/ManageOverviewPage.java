package pageObjectModel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.WebElements;

public class ManageOverviewPage extends WebElements {

    public ManageOverviewPage(){ PageFactory.initElements(driver,this); }

    @FindBy(className = "fa-info-circle")
    private WebElement btnI;
    public void clickBtnI(){
        clickFunction(btnI);
    }

    @FindBy(xpath = "//a[contains(text(),'Benutzer verwalten')]")
    private WebElement btnBenutzerVerwalten;
    public void clickBtnBenutzerVerwalten(){
        clickFunction(btnBenutzerVerwalten);
    }

    @FindBy(xpath = "//a[contains(text(),'Projekte verwalten')]")
    private WebElement btnProjekteVerwalten;
    public void clickBtnProjekteVerwalten(){
        clickFunction(btnProjekteVerwalten);
    }

    @FindBy(xpath = "//a[contains(text(),'Tags verwalten')]")
    private WebElement btnTagsVerwalten;
    public void clickBtnTagsVerwalten(){
        clickFunction(btnTagsVerwalten);
    }


    //Reiter Globale Profile verwalten
    @FindBy(xpath = "//a[contains(text(),'Globale Profile verwalten')]")
    private WebElement btnProfileVerwalten;
    public void clickBtnProfileVerwalten(){ clickFunction(btnProfileVerwalten); }

    //Felder in Globale Profile verwalten
    @FindBy(id = "platform")
    private WebElement clickRechnertyp;
    public void clickRechnertyp(){ sendKeysFunction(clickRechnertyp, "Allerbester Rechner"); }

    @FindBy(id = "os")
    private WebElement clickBS;
    public void clickBetriebssystem(){ sendKeysFunction(clickBS,"Allerbestes Betriebssystem"); }

    @FindBy(name = "os_build")
    private WebElement clickBSVersion;
    public void clickBSVersion(){ sendKeysFunction(clickBSVersion, "Allerbeste Betriebssystemversion"); }

    @FindBy(css = "#description")
    private WebElement clickBeschreibung;
    public void clickBeschreibung(){ sendKeysFunction(clickBeschreibung, "Allerbeste Beschreibung"); }

    @FindBy(className = "btn-round")
    private WebElement btnProfilHinzufuegen;
    public void clickBtnProfilHinzufuegen(){ clickFunction(btnProfilHinzufuegen); }



    @FindBy(xpath = "//a[contains(text(),'Plugins verwalten')]")
    private WebElement btnPluginsVerwalten;
    public void clickBtnPluginsVerwalten(){ clickFunction(btnPluginsVerwalten); }

    @FindBy(xpath = "//a[contains(text(),'Konfiguration verwalten')]")
    private WebElement btnKonfigVerwalten;
    public void clickBtnKonfigVerwalten(){ clickFunction(btnKonfigVerwalten); }
/*




    @FindBy(xpath = "//a[contains(text(),'Benutzerdefinierte Felder verwalten')]")
    private WebElement btnFelderVerwalten;
    public void clickBtnFelderVerwalten(){ clickFunction(btnFelderVerwalten); }

    @FindBy(xpath = "//a[contains(text(),'Benutzerdefinierte Felder verwalten')]")
    private WebElement btnFelderVerwalten;
    public void clickBtnFelderVerwalten(){ clickFunction(btnFelderVerwalten); }*/
}