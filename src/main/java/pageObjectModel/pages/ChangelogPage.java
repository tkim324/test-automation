package pageObjectModel.pages;

import org.openqa.selenium.support.PageFactory;
import pageObjectModel.WebElements;

public class ChangelogPage extends WebElements {

    public ChangelogPage(){
        PageFactory.initElements(driver,this);
    }


}
