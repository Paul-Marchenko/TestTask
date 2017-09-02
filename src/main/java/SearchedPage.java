import static com.codeborne.selenide.Selenide.$;

/**
 * Created by pavel on 9/2/17.
 */
public class SearchedPage {
    public void requirementsData(String url){
      $("#rso > div:nth-child(1) > div > div > div > div > h3 > a").shouldHave();
    }

}
