import org.testng.annotations.Test;

/**
 * Created by pavel on 9/2/17.
 */
public class MainLogoPresentTest {
    WixPage wixPage = new WixPage();
    @Test
    public void mainLogoPresent(){
        wixPage.findLogo("WIX");
    }
}
