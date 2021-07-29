import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class Before {
    private WebDriver driver = Driver.getChromeDriver();
    @BeforeAll
    public void setUp() {
        driver.get("http://a.testaddressbook.com/sign_in");
        String currentURL = driver.getCurrentUrl();
        Assertions.assertEquals("http://a.testaddressbook.com/sign_in", currentURL ,"Открыта не та страница, проверьте URL");
    }
    @AfterAll
    public void tearDown() {
        driver.quit();
    }
}