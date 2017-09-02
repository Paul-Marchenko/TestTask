import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.aspectj.lang.annotation.Before;
import org.testng.annotations.BeforeTest;


/**
 * Created by pavel on 9/2/17.
 */
public class BaseTest {
    @BeforeTest
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        Configuration.timeout = 5000;
        Configuration.baseUrl = "https://www.google.com.ua/";

    }
}
