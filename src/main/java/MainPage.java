import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by pavel on 9/2/17.
 */
public class MainPage {


    public MainPage open(){
        Selenide.open("/");
        return this;
    }

    public void inputSymbols(String symbols){
        $("#lst-ib").val(symbols).pressEnter().click();

    }
}

