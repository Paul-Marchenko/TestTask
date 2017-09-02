import org.testng.annotations.Test;

/**
 * Created by pavel on 9/2/17.
 */
public class DisplayInfoTest {
    SearchedPage searchedPage = new SearchedPage();
    @Test
    public void infoPresentInTheSearchPage(){
        searchedPage.requirementsData("http://ru.wix.com/");
    }
}
