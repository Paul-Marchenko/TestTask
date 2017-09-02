import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pavel on 9/2/17.
 */
public class InputSymbolTest {

    MainPage mainPage = new MainPage();
    @Test
    public void searchInputtedSymbols(){
        mainPage.open().inputSymbols("WIX");
        //Assert.assertEquals()

    }
}
