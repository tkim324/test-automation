package pageObjectModel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.WebElements;

public class BugReportPage extends WebElements {

    public BugReportPage(){PageFactory.initElements(driver,this);}


    @FindBy(className = "category_id")
    private WebElement category;
    public void dropCategory() { clickFunction(category);    }

    @FindBy(id = "reproducibility")
    private WebElement reproduzierbar;
    public void dropReproduzierbar() { selectElementFromDropdown(reproduzierbar, "immer");  }

    @FindBy(id = "severity")
    private WebElement schweregrad;
    public void dropSchweregrad() { selectElementFromDropdown(schweregrad, "Blocker"); }

    @FindBy(id = "priority")
    private WebElement prioritaet;
    public void dropPrioritaet() { selectElementFromDropdown(prioritaet, "hoch");   }

    @FindBy(className = "fa-minus-square-o")
    private WebElement btnPlus;
    public void clickBtnPlus() { clickFunction(btnPlus);    }

    @FindBy(css = "#platform")
    private WebElement rechnertyp;
    public void clickRechnertyp() {sendKeysFunction(rechnertyp,"Rechnertyp");}

    @FindBy(css = "#os")
    private WebElement betriebssystem;
    public void clickBetriebssystem() {sendKeysFunction(betriebssystem, "Bestes Betriebssystem");    }

    @FindBy(name = "os_build")
    private WebElement bsVersion;
    public void clickBSVersion() {sendKeysFunction(bsVersion, "bsVersion");    }

    @FindBy(id = "handler_id")
    private WebElement zuordnung;
    public void dropZuordnung() { selectElementFromDropdown(zuordnung, "ffischer");  }

    @FindBy(id = "summary")
    private WebElement btnZusammenfassung;
    public void clickZusammenfassung() {sendKeysFunction(btnZusammenfassung, "Beste Zusammenfassung");    }

    @FindBy(id = "description")
    private WebElement btnBeschreibung;
    public void clickBeschreibung() {sendKeysFunction(btnBeschreibung, "Beste Beschreibung");    }

    @FindBy(id = "steps_to_reproduce")
    private WebElement schritteZurReproduktion;
    public void ClickReproduktion() {sendKeysFunction(schritteZurReproduktion, "1. \n 2. \n3. ");    }

    @FindBy(id = "additional_info")
    private WebElement zusaetzlicheInfo;
    public void zusaetzlicheInfo() {sendKeysFunction(zusaetzlicheInfo, "Beste Zusatzinfo");    }

    @FindBy(xpath = "//span[contains(text(),'öffentlich')]")
    private WebElement btnOeffentlich;
    public void clickBtnOeffetnlich() { clickFunction(btnOeffentlich);    }

    @FindBy(xpath = "//span[contains(text(),'privat')]")
    private WebElement btnPrivat;
    public void clickBtnPrivat() { clickFunction(btnPrivat);    }

    @FindBy(xpath = "//span[contains(text(),'auswählen, um weitere Einträge zu erfassen')]")
    private WebElement btnImEingabemodusBleiben;
    public void clickBtnEingabemodus() { clickFunction(btnImEingabemodusBleiben);    }

    @FindBy(className = "btn-white")
    private WebElement btnEintragAbsenden;
    public void clickBtnEintragAbsenden() { clickFunction(btnEintragAbsenden);    }

}