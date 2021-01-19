package pageObjectModel.pages;

import org.openqa.selenium.support.PageFactory;
import pageObjectModel.WebElements;

public class MyViewPage extends WebElements {

    public MyViewPage(){
        PageFactory.initElements(driver,this);
    }


}