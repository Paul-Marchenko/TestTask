import static com.codeborne.selenide.Selenide.$;

/**
 * Created by pavel on 9/2/17.
 */
public class WixPage {
    public void findLogo(String logoname){

        $("#wm-logo").shouldHave();
    }

}
