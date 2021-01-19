package pageObjectModel.main;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.WebElements;


public class EintragErfassan extends WebElements {


    public EintragErfassan() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "fa-edit")
    private WebElement btnEintragErfassen;

    public void clickEintragErfassen() {
        clickFunction(btnEintragErfassen);
    }

    @FindBy(className = "btn-white")
    private WebElement btnprojektWahlen;
    public void clickprojectWahlen() { clickFunction(btnprojektWahlen);    }

    @FindBy(id = "reproducibility")
    private WebElement reproduzierbar;
    public void clickreproduzierbar() { selectElementFromDropdown(reproduzierbar, "immer");  }

    @FindBy(id = "severity")
    private WebElement schweregrad;

    public void clickschweregrad() {
        selectElementFromDropdown(schweregrad, "Blocker");
    }

    @FindBy(id = "priority")
    private WebElement prioritat;
    public void clickprioritat() { selectElementFromDropdown(prioritat, "hoch");   }

    @FindBy(className = "fa-minus-square-o")
    private WebElement btnplus;
    public void clickbtnplus() { clickFunction(btnplus);    }

    @FindBy(css = "#platform")
    private WebElement rechnertyp;
    public void clickplatform() {sendKeysFunction(rechnertyp,"Rechnertyp");}

    @FindBy(css = "#os")
    private WebElement betriebssystem;
    public void clickbetriebssystem() {sendKeysFunction(betriebssystem, "betriebssystem");    }

    @FindBy(id = "os_build")
    private WebElement bsVersion;
    public void clickbsVersion() {sendKeysFunction(bsVersion, "bsVersion");    }

    @FindBy(id = "handler_id")
    private WebElement zuordnunAn;
    public void clickrzuordnungAn() { selectElementFromDropdown(zuordnunAn, "etosun");  }

    @FindBy(id = "summary")
    private WebElement btnZusammenfassung;
    public void clickbtnZusammenfassung() {sendKeysFunction(btnZusammenfassung, "Fehler ins anmelden");    }
    //************
    @FindBy(id = "description")
    private WebElement btnBeschreibung;
    public void clickbtnBeschreibung() {sendKeysFunction(btnBeschreibung, "Fehler desciption");    }

    @FindBy(id = "steps_to_reproduce")
    private WebElement schritteZurReproduktion;
    public void schritteZurReproduktion() {sendKeysFunction(schritteZurReproduktion, "Reproduce");    }

    @FindBy(id = "additional_info")
    private WebElement zusatzlicheInfo;
    public void zusatzlicheInfo() {sendKeysFunction(zusatzlicheInfo, "additional info");    }

    @FindBy(xpath = "//span[contains(text(),'privat')]")
    private WebElement btnPrivat;
    public void clickbtnPrivat() { clickFunction(btnPrivat);    }

    @FindBy(css = ".btn.btn-primary.btn-white.btn-round")
    private WebElement btnEintragAbsenden;
    public void clickbtnEintragAbsenden() { clickFunction(btnEintragAbsenden);    }










}