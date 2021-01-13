package main;

import webdriver.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MainPage extends WebDriver {


    private static String EintragView = "0000058";
    private static String EintragZus = "Anzeigen und Aendern Testfall";
    private static String EintragBeschreibung = "Notwendige Aenderung in der Beschreibung";
    private static String EintragNotiz = "Bearbeitet von ffischerUseCaseTest";

    public static void erfassungTest() {
        //linke Navbar Eintrag erfassen
        By erfassung = By.xpath("//body/div[@id='main-container']/div[@id='sidebar']/ul[1]/li[3]/a[1]");

        driver.findElement(erfassung).click();
    }

    public static void viewAll() {
        //Eintraege-anzeigen-Reiter
        By anzeigen = By.xpath("//span[contains(text(),'Einträge anzeigen')]");
        driver.findElement(anzeigen).click();
        //Suchfeld mit Eingabe
        By suchfeld = By.xpath("//input[@name='bug_id']");
        WebElement eintragSuchefeld = driver.findElement(suchfeld);
        eintragSuchefeld.click();
        eintragSuchefeld.sendKeys(EintragView);
        eintragSuchefeld.sendKeys(Keys.ENTER);
    }

    //Weitere ID/X-Path als String sh. Oben oder wie Unten fortfahren/ Logik überdenkenm
    public static void updateInfo() {
        //Zusammenfassung aendern, Textfeld loeschen und neuer Eintrag//lange Schreibweise
        By aendernZus = By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div/table/tfoot/tr/td/div/div[1]/form/fieldset/input[3]");
        driver.findElement(aendernZus).click();
        By FeldZus = By.id("summary");
        WebElement zusammenfassung = driver.findElement(FeldZus);
        zusammenfassung.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        zusammenfassung.sendKeys(EintragZus);

        //Beschreibung aendern
        driver.findElement(By.id("bugnote_text")).sendKeys(EintragBeschreibung);

        //Notiz aendern //kurze Schreibweise
        driver.findElement(By.id("bugnote_text")).sendKeys(EintragNotiz);

        //Hitbox privat
        driver.findElement(By.xpath("//tbody/tr[18]/td[1]/label[1]/span[1]")).click();}

    public static void viewObserve(){
        //Verschieben
        driver.findElement(By.xpath("//body/div[@id='main-container']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tfoot[1]/tr[1]/td[1]/div[1]/div[9]/form[1]/fieldset[1]/input[4]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'Test4')]")).click();
        driver.findElement(By.xpath("//input[@class='btn btn-primary btn-white btn-round']")).click();

        //Beobachten
        driver.findElement(By.xpath("//body/div[@id='main-container']/div[2]/div[1]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='main-container']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tfoot[1]/tr[1]/td[1]/div[1]/div[4]/form[1]/fieldset[1]/input[3]")).click();

        //Verschieben rueckgaengig
        driver.findElement(By.xpath("//body/div[@id='main-container']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tfoot[1]/tr[1]/td[1]/div[1]/div[9]/form[1]/fieldset[1]/input[4]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'Bugerstellung')]")).click();
        driver.findElement(By.xpath("//input[@class='btn btn-primary btn-white btn-round']")).click();

        //Beobachten rueckgaengig
        driver.findElement(By.xpath("//body/div[@id='main-container']/div[2]/div[1]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='main-container']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tfoot[1]/tr[1]/td[1]/div[1]/div[4]/form[1]/fieldset[1]")).click();

    }

}
